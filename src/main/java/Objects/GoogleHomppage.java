package Objects;

import harishacademygroup.Cucumberproject.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomppage extends Base {

    WebDriver driver;
    By searchId = By.id("APjFqb");

    public GoogleHomppage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement searchIdElement()
    {
        return driver.findElement(searchId);
    }
}
