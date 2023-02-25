package Tests;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.WindowMethods;
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

        ElementMethods element = new ElementMethods(getDriver());
        PageMethods pMethods = new PageMethods(getDriver());
        WindowMethods wMethods = new WindowMethods(getDriver());


        WebElement SkipRegister = getDriver().findElement(By.id("btn2"));
        SkipRegister.click();

        WebElement SwitchTo = getDriver().findElement(By.xpath("//a[text()='SwitchTo']"));
        element.MoveElement(SwitchTo);  //Mergem DOAR pe un anumit element;

        WebElement WindowElement = getDriver().findElement(By.xpath("//a[text()='Windows']"));
        element.ClickElement(WindowElement);

        pMethods.NavigateToPage("https://demo.automationtesting.in/Windows.html");

        List<WebElement> WindowsOptions = getDriver().findElements(By.cssSelector(".nav-stacked>li>a"));

        WindowsOptions.get(0).click();
        WebElement btn1 = getDriver().findElement(By.cssSelector("a>button"));
        element.ClickElement(btn1);


        wMethods.moveSpecificTabW(1);
        wMethods.closeCurentTabW();   //Inchidem Tab-ul curent;
        wMethods.moveSpecificTabW(0);


        WindowsOptions.get(1).click();
        WebElement btn2 = getDriver().findElement(By.cssSelector("#Seperate>button"));
        element.ClickElement(btn2);

        List<String>Windows = new ArrayList<>(getDriver().getWindowHandles());
        wMethods.moveSpecificTabW(1);
        wMethods.closeCurentTabW();
        wMethods.moveSpecificTabW(0);


        WindowsOptions.get(2).click();
        WebElement btn3 = getDriver().findElement(By.cssSelector("#Multiple>button"));
        element.ClickElement(btn3);

        wMethods.moveSpecificTabW(2);
        wMethods.closeCurentTabW();
        wMethods.moveSpecificTabW(1);
        wMethods.closeCurentTabW();
        wMethods.moveSpecificTabW(0);


    }
}
