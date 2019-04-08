package test

import main.helper.TestBase
import main.page.MainPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Tags(Tag("main"), Tag("particular"))
class MainPageTest : TestBase() {
    private val mainPage = MainPage()


    @Test
    fun checkMainPageLoads() {
        mainPage.open()

        assertThat(mainPage.checkHomePosterIsDisplayed()).isTrue()
        assertThat(mainPage.checkMainLogoIsDisplayed()).isTrue()
    }

}
