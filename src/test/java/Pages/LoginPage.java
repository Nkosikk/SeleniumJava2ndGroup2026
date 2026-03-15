package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id ="login-email")
    WebElement emailField;
    @FindBy(id ="login-password")
    WebElement passwordField;
    @FindBy(id ="login-submit" )
    WebElement loginButton;

    public void enterEmail(String email){emailField.sendKeys("njceles@gmail.com");}

    public void enterPassword(String password){passwordField.sendKeys("@12345678");}

    public void clickLogin(){loginButton.click();}
}