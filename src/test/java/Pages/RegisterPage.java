package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToElem;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement AlertElement;

    public void goToAlert(){
        eMethods.MoveElement(SwitchToElem);
        eMethods.ClickElement(AlertElement);
        pMethods.NavigateToPage("https://demo.automationtesting.in/Alerts.html");

    }

}
