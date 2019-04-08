package main.helper

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.WebDriverRunner
import org.junit.jupiter.api.AfterEach

open class TestBase {

    // init driver
    init {
        Configuration.browser = InitDriverProvider()::class.java.name
    }

    @AfterEach
    fun clearCache() {
        WebDriverRunner.clearBrowserCache()
        Selenide.clearBrowserCookies()
        Selenide.clearBrowserLocalStorage()
    }

}
