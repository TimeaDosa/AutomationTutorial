package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPages extends BasePage {


    @FindBy(id = "btn1")
    private WebElement SignIn;

    @FindBy(id = "btn2")
    private WebElement SkipRegister;

    public IndexPages(WebDriver driver) {
        super(driver);
    }
    public void clickSignIn(){
        eMethods.ClickElement(SignIn);
    }

    public void clickSkipSignIn(){
        eMethods.ClickElement(SkipRegister);
    }
}
