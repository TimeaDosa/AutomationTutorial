package Tests;

import HelpMethods.ElementMethods;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class RegisterTest extends ShareData {


    @Test
    public void MetodaTest(){

        ElementMethods elementMethods = new ElementMethods(getDriver());

        WebElement SingIn = getDriver().findElement(By.id("btn1"));
        elementMethods.ClickElement(SingIn);


       WebElement FirstName = getDriver().findElement(By.cssSelector("input[placeholder='First Name']"));
       String FirstNameValue = "Timea";
       elementMethods.FillElement(FirstName, FirstNameValue);

        WebElement LastName = getDriver().findElement(By.xpath("input[placeholder='Last Name']"));
        String LastNameValue = "Dosa";
        elementMethods.FillElement(LastName, LastNameValue);

        WebElement Email = getDriver().findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        String emailValue = "timi@gmail.com";
        elementMethods.FillElement(Email, emailValue);


        WebElement Adress = getDriver().findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String AdressValue = "Timisoara";
        elementMethods.FillElement(Adress, AdressValue);

        WebElement Phone = getDriver().findElement(By.xpath("//input[@ng-model='Phone']"));
        String PhoneValue = "0725500001";
        elementMethods.FillElement(Phone, PhoneValue);

        WebElement Gender = getDriver().findElement(By.xpath("//input[@value='FeMale']"));
        elementMethods.ClickElement(Gender);
        WebElement Hobbies = getDriver().findElement(By.xpath("//input[@value='Movies']"));
        elementMethods.ClickElement(Hobbies);

        //Interactionam cu un drop down clasic;
        WebElement Skills = getDriver().findElement(By.id("Skills"));
        elementMethods.SelectElementText(Skills, "Java");

        WebElement Year = getDriver().findElement(By.id("yearbox"));
        elementMethods.SelectElementValue(Year, "1996");

        elementMethods.ScrollByPixel(0, 300);

        WebElement LanguageElement = getDriver().findElement(By.id("msdd"));
        elementMethods.ClickElement(LanguageElement);


        //Interactionam cu o multime de elemete- drop-down complex (ex: language);
        List<WebElement> LanguageOptions = getDriver().findElements(By.cssSelector("ui-autocomplete>li>a"));
        String ExpectedLanguage = "English";
        for (Integer index = 0; index < LanguageOptions.size(); index++) {
            if (LanguageOptions.get(index).getText().equals(ExpectedLanguage)) {
                elementMethods.ClickElement(LanguageOptions.get(index));
            }


            //Select Country (drop-down);
            WebElement SelectCountry = getDriver().findElement(By.cssSelector(".select2-selection"));
            elementMethods.ClickElement(SelectCountry);

            WebElement SelectCountryInput = getDriver().findElement(By.className("select2-search__field"));
            elementMethods.FillElement(SelectCountryInput, "Asia");

            WebElement Month = getDriver().findElement(By.cssSelector("select[placeholder='Month']"));
            elementMethods.SelectElementText(Month, "September");

            WebElement Day = getDriver().findElement(By.id("daybox"));
            elementMethods.SelectElementValue(Day, "20");

            WebElement FirstPassword = getDriver().findElement(By.id("firstpassword"));
            String firstPasswordValue = "Timea";
            elementMethods.FillElement(FirstPassword, firstPasswordValue);


            WebElement ConfirmPassword = getDriver().findElement(By.id("secondpassword"));
            String confirmPasswordValue = "timea";
            elementMethods.FillElement(ConfirmPassword, confirmPasswordValue);

            WebElement Submit = getDriver().findElement(By.id("submitbtn"));
            elementMethods.ClickElement(Submit);

        }
    }
}