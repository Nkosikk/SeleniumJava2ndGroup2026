package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-heading\"]/span")
    WebElement verifyLoginHeading;

    @FindBy(id = "login-email")
    WebElement emailField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement submitButton;


    public void verifyLoginPageIsDisplayed(){
        verifyLoginHeading.isDisplayed();
    }

    public void enterEmail(){
        emailField.sendKeys("njceles@gmail.com");
    }

    public void enterPassword(){
        passwordField.sendKeys("@12345678");
    }

    public void clickLoginButton(){
        submitButton.click();
    }

}
