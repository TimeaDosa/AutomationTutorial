package Pages;

import com.sun.jdi.PrimitiveValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertOptions;

    @FindBy(css = "#OKTab>button")
    private WebElement AlertOk;

    @FindBy(css = "#CancelTab>button")
    private WebElement AlertOkCancel;

    @FindBy(css = "#Textbox>button")
    private WebElement AlertTextBox;

    public void interactAlertAccept(){
        eMethods.ClickElement(AlertOptions.get(0));
        eMethods.ClickElement(AlertOk);
        aMethods.AcceptAlert();
    }

    public void interactAlertCancel(){
        eMethods.ClickElement(AlertOptions.get(1));
        eMethods.ClickElement(AlertOkCancel);
        aMethods.CancelAlert();
    }

    public void interactTextBoxAlert(String value){
        eMethods.ClickElement(AlertOptions.get(2));
        eMethods.ClickElement(AlertTextBox);
        aMethods.FillAlert(value, Boolean.TRUE);
    }
}
