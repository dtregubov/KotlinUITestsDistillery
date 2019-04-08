package test

import io.qameta.allure.Step
import main.helper.TestBase
import main.page.BlogPage
import main.page.MainPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BlogPageTest: TestBase() {
    private val mainPage = MainPage()
    private val blogPage = BlogPage()

    @Step
    @Test
    @DisplayName("First allure test")
    fun checkBlogPageLoads(){
        blogPage.open("/blog")
        blogPage.openBlogFromHeader()
        assertThat(blogPage.getBlogLabelText()).isEqualTo("THE DISTILLERY BLOG")
    }

    @Test
    fun findAuthors(){
        blogPage.open("/blog")
        //assertThat(blogPage.checkArticlesWithAuthor("Elena")).isEqualTo(1)
        blogPage.foundAuthors()
    }

}
