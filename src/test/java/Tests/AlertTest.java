package Tests;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Pages.AlertPage;
import Pages.IndexPages;
import Pages.RegisterPage;
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
    public void MetodaTest() {

        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactAlertAccept();
        alertPage.interactAlertCancel();
        alertPage.interactTextBoxAlert("ceva");
    }
}
