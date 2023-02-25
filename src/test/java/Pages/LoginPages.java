package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends BasePage {

    @FindBy(css="input[placeholder='E mail']")
    private WebElement email;

    @FindBy(xpath="//input[@placeholder='Password']" )
    private WebElement parola;

    @FindBy(id="enterbtn")
    private WebElement Enter;

    @FindBy(id="errormsg")
    private WebElement error;

    public LoginPages(WebDriver driver) {
        super(driver);
    }

    public void LoginInvalid(String emailValue, String parolaValue, String expectedError){

        eMethods.FillElement(email, emailValue);
        eMethods.FillElement(parola, parolaValue);
        eMethods.ClickElement(Enter);
        eMethods.ValidateElementText(error, expectedError);

    }
}


