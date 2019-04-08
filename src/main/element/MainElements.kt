package main.element

import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By

class MainElements: ElementsContainer() {

    fun findHomePoster(): SelenideElement{
        return element(By.id("home-poster"))
    }

    fun mainLogo(): SelenideElement{
        return element(byId("main-logo"))
    }

}
