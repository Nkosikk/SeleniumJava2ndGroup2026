package InventoryPage;

import Pages.DashboardPage;
import Tests.Base;
import Tests.NdosiTests;
import Utils.ReadFromFile;
import org.testng.annotations.Test;


public class InventoryPageYN extends Base {

    @Test
    public void verifyLoginPageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLoginButton();
        loginPage.enterEmail(ReadFromFile.email);
        loginPage.enterPassword(ReadFromFile.password);
        loginPage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();

    }

    @Test
    public void verifyDashboardIsDisplayed() {
        dashboardPage.setVerifyDashboardPage();
    }

    @Test(dependsOnMethods = "verifyDashboardIsDisplayed")
    public void clickDashboardLearnDropdown() {
        dashboardPage.clickLearnDropdown();
    }

    @Test(dependsOnMethods = "clickDashboardLearnDropdown")
    public void clickDashboardLearnMaterials() {
        dashboardPage.clickLearnMaterials();
    }

    @Test(dependsOnMethods = "clickDashboardLearnMaterials")
    public void clickWebAutomationTab() {
        dashboardPage.clickWebTab();
    }

    @Test(dependsOnMethods = "clickWebAutomationTab")
    public void verifyInventoryPageIsDisplayed() {
        dashboardPage.clickWebTab();
    }

    @Test(dependsOnMethods = "verifyInventoryPageIsDisplayed")
    public void InventoryPageIsDisplayed() {
        dashboardPage.clickDeviceTypeDropdown();
    }

    @Test(dependsOnMethods = "InventoryPageIsDisplayed")
    public void clickBrandDropdown() {
        dashboardPage.clickBrandDropdown();
    }

    @Test(dependsOnMethods = "clickBrandDropdown")
    public void clickStorage128GB() {
        dashboardPage.clickStorage128GB();
    }

    @Test(dependsOnMethods = "clickStorage128GB")
    public void clickColorDropdown() {
        dashboardPage.clickColorDropdown();
    }

    @Test(dependsOnMethods = "clickColorDropdown")
    public void enterQuantity() {
        dashboardPage.clickQuantityField("2");
    }

    @Test(dependsOnMethods = "enterQuantity")
    public void enterAddress() {
        dashboardPage.enterAddress("123 Test Street");
    }

    @Test(dependsOnMethods = "enterAddress")
    public void clickNextButton() {
        dashboardPage.clickNextButton();
    }

    @Test(dependsOnMethods = "clickNextButton")
    public void selectExpressShippingOption() {
        dashboardPage.clickExpressShippingOption();
    }

    @Test(dependsOnMethods = "selectExpressShippingOption")
    public void clickOneYearWarrantyOption() {
        dashboardPage.clickOneYearWarrantyOption();
    }

    @Test(dependsOnMethods = "clickOneYearWarrantyOption")
    public void enterDiscountCode() {
        dashboardPage.enterDiscountCode("DISCOUNT10");
    }

    @Test(dependsOnMethods = "enterDiscountCode")
    public void clickConfirmPurchaseButton() {
        dashboardPage.clickConfirmPurchaseButton();
    }

}