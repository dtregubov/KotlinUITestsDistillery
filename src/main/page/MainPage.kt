package main.page

import com.codeborne.selenide.Selenide
import main.element.MainElements

class MainPage {
    val mainElements = MainElements()

    fun open(url: String = "/") {
        Selenide.open(url)
    }

    fun checkMainLogoIsDisplayed(): Boolean{
        return mainElements.mainLogo().isDisplayed
    }

    fun checkHomePosterIsDisplayed(): Boolean{
        return mainElements.findHomePoster().isDisplayed
    }

}
