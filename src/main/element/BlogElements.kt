package main.element

import com.codeborne.selenide.*
import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.Selenide.elements

class BlogElements : ElementsContainer() {

    fun findBlogLabel(): SelenideElement {
        return element(byClassName("title_blog"))
    }

    fun findArticlesAuthors(): ElementsCollection {
        return elements(byXpath("//span[@itemprop='author']"))
    }

}
