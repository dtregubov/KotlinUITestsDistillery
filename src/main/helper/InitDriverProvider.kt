package main.helper

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.WebDriverProvider
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URI


// initialize selenoid using only Configuration overriding
class InitDriverProvider : WebDriverProvider {

    var HUB = System.getProperty("HUB") ?: "http://83.221.205.178:4444/wd/hub"

    // change default driver to selenoid one
    override fun createDriver(capabilities: DesiredCapabilities) = ChromeOptions()
            .apply {
                setCapability("version", "72.0")
                setCapability("enableVNC", true)
                setCapability("enableVideo", false)
            }.run { RemoteWebDriver(URI.create(HUB).toURL(), this) }

    init {
        Configuration.baseUrl = "https://www.distillery.com"
        Configuration.browserSize = "1920x1080"
        Configuration.timeout = 10000
        Configuration.reopenBrowserOnFail = true
    }
}



