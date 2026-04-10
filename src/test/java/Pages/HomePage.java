package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    //Verify that the home page is displayed
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/button[1]")
    WebElement verify_homePage;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton;

    public HomePage(WebDriver driver) {

    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void verifyHomePageIsDisplayed() {

        verify_homePage.isDisplayed();
    }

}
