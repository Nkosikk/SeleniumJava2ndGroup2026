package Tests;

import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
    }

}
