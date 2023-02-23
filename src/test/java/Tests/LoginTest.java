package Tests;

import HelpMethods.ElementMethods;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {
    @Test
    public void MetodaTest(){

    //Declaram un element si refactorizam actiunile;
        ElementMethods elementMethods = new ElementMethods(getDriver());


    //Declaram elementul sign in;
        WebElement SignIn =getDriver().findElement(By.id("btn1"));
        elementMethods.ClickElement(SignIn);

        WebElement email= getDriver().findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "timi@gmail.com";
        elementMethods.FillElement(email, emailValue);

        WebElement parola = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "Parola";
        elementMethods.FillElement(parola, parolaValue);

        WebElement Enter = getDriver().findElement(By.id("enterbtn"));
        elementMethods.ClickElement(Enter);

    //Validam un mesaj de eroare;
        WebElement error = getDriver().findElement(By.id("errormsg"));
        String expectedError = "Invalid User Name or PassWord";
        elementMethods.ValidateElementText(error, expectedError);
    }

}
