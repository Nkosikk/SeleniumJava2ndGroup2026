package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

WebDriver driver;

@FindBy(xpath ="//*[@id=\"app-main-content\"]/section/div[1]/h2")
    WebElement DashboardPage;

    public DashboardPage(WebDriver driver){this.driver = driver;

    }
}
