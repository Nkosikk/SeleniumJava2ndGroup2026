package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() {
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

}
