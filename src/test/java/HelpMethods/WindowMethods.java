package HelpMethods;

import ShareData.ShareData;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods extends ShareData {
    private WebDriver driver;

    public WindowMethods(WebDriver driver){
        this.driver = driver;
    }
    public void moveSpecificTabW(Integer index){
        List<String>Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(index));
    }
    public void closeCurentTabW(){
        driver.close();
    }


}
