package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {



    @Test
    public void MetodaTest(){


        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        SkipRegister.click();

        WebElement SwitchTo = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));


    //Mergem DOAR pe un anumit element;
        Actions actions = new Actions(getDriver());
        actions.moveToElement(SwitchTo).perform();

        WebElement WindowElement = getDriver().findElement(By.xpath("//a[text()='Windows']"));
        WindowElement.click();

        getDriver().navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowsOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));
        WindowsOptions.get(0).click();
        WebElement TabButton = getDriver().findElement(By.cssSelector("#Tabbed>a>button"));
        TabButton.click();

    //Identificam multimea de Tab-uri/ Windows-uri;
        List<String>Tabs = new ArrayList<>(getDriver().getWindowHandles());

    //Ne mutam cu focusul pe un tab specific;
        getDriver().switchTo().window(Tabs.get(1));

    //Inchidem Tab-ul curent;
        getDriver().close();
        getDriver().switchTo().window(Tabs.get(0));


        WindowsOptions.get(1).click();
        WebElement WindowOption = getDriver().findElement(By.cssSelector("#Seperate>button"));
        WindowOption.click();

        List<String>Windows = new ArrayList<>(getDriver().getWindowHandles());


    //Ne mutam focusul pe un Window specific;
        getDriver().switchTo().window(Windows.get(1));
        getDriver().close();
        getDriver().switchTo().window(Windows.get(0));

    //Driver close;
        WindowsOptions.get(2).click();
        WebElement WindowMultiple = getDriver().findElement(By.cssSelector("#Multiple>button"));
        WindowMultiple.click();
        List<String>Multiple = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(Multiple.get(2));
        getDriver().close();
        getDriver().switchTo().window(Multiple.get(1));
        getDriver().close();
        getDriver().switchTo().window(Multiple.get(0));

    }
}
