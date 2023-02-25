package Tests;

import HelpMethods.ElementMethods;
import Pages.IndexPages;
import Pages.LoginPages;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {
    @Test
    public void MetodaTest(){

        IndexPages indexPages = new IndexPages(getDriver());
        indexPages.clickSignIn();

        LoginPages loginPages = new LoginPages(getDriver());
        loginPages.LoginInvalid("timi@gmail.com", "Parola", "Invalid User Name or PassWord");

    }

}
