package Tests;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import ShareData.ShareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void MetodaTest(){

        ElementMethods elementMethods = new ElementMethods(getDriver());
        PageMethods pageMethods = new PageMethods(getDriver());
        AlertMethods alertMethods = new AlertMethods(getDriver());



        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        elementMethods.ClickElement(SkipRegister);

        WebElement SwitchTo= getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));

    //Mergem cu mouse-ul pe un anumit elemet;
        elementMethods.MoveElement(SwitchTo);

        WebElement AlertElement = getDriver().findElement(By.xpath("//a[text()='Alerts']"));
        elementMethods.ClickElement(AlertElement);

    //Navigam catre un URL;
        pageMethods.NavigateToPage("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> AlertOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));
        elementMethods.ClickElement(AlertOptions.get(0));

        WebElement AlertOk = getDriver().findElement(By.cssSelector("#OKTab>button"));
        elementMethods.ClickElement(AlertOk);

    //Interactionam cu o alerta;
        alertMethods.AcceptAlert();

        elementMethods.ClickElement(AlertOptions.get(1));

        WebElement AlertOkCancel = getDriver().findElement(By.cssSelector("#CancelTab>button"));
        elementMethods.ClickElement(AlertOkCancel);

        alertMethods.CancelAlert();

        elementMethods.ClickElement(AlertOptions.get(2));

        WebElement AlertTextBox = getDriver().findElement(By.cssSelector("#Textbox>button"));
        elementMethods.ClickElement(AlertTextBox);

        alertMethods.FillAlert("test", true);
    }
}
