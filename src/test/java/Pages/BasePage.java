package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementMethods eMethods;
    public PageMethods pMethods;
    public AlertMethods aMethods;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        eMethods = new ElementMethods(driver);
        pMethods = new PageMethods(driver);
        aMethods = new AlertMethods(driver);


    }
}
