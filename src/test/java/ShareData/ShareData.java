package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;

    }



    //Folosim adnotarea de @before din testng;
    @BeforeMethod
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Index.html");

    //Wait implicit = (definesti un timp maxim);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //Wait explicit = (daca rulez un test de "n"-ori si tot in acelasi loc cade inseamna ca explicit in zona aia exista
    //o problema, si atuncea doar acolo unde exista problema venim si introducem un wait. Marele avantaj fata de w.i. e ca
    //la w.e. poti sa-i specifici o anumita conditie sa astepte);



    }

    //Folosim after
    @AfterMethod
    public void Clear (){
    //inchidem un browser
        driver.quit();
    //quit= inchidem browser-ul cu oricate taburi dechise;
    //close= inchidem doar tabul curent;
    }




}
