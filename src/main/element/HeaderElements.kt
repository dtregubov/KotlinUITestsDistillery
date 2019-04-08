package main.element

import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.Selectors.byId
import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By

class HeaderElements: ElementsContainer() {

    fun findNavigationMenu(): SelenideElement{
        return element(byId("navMenuBlock"))
    }

    fun blogButton(): SelenideElement{
        return element(byXpath("//*[@id=\"navMenuBlock\"]/div[2]/div[6]/a"))
    }
}
