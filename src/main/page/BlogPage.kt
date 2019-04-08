package main.page

import com.codeborne.selenide.Selenide
import io.qameta.allure.Step
import main.element.BlogElements
import main.element.HeaderElements
import main.element.MainElements

class BlogPage {
    val mainElements = MainElements()
    val headerElements = HeaderElements()
    val blogElements = BlogElements()

    fun open(url: String) {
        Selenide.open(url)
    }

    fun openBlogFromHeader() {
        headerElements.blogButton().click()
    }

    @Step("Get blog text")
    fun getBlogLabelText(): String {
        return blogElements.findBlogLabel().text()
    }

    fun checkArticlesWithAuthor(authorName: String): Int {
        var numberFound = 0
        for (elementAuthor in blogElements.findArticlesAuthors()){
            var numberOfElements = elementAuthor.toString().contains(authorName)
            if (numberOfElements){
                numberFound ++
            }
        }
        return numberFound
    }

    fun foundAuthors(){
        val authors = blogElements.findArticlesAuthors().texts()

    }

}

data class Authors(
        val name: String
)
