package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage {

    WebDriver driver;
    //Element to verify that the dashboard page is displayed
    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]")
    WebElement verifyDashboardPage;

    //Element for clicking on the "Learn" dropdown menu
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnDropdown;

    //Element for clicking on the "Learn Materials" option within the "Learn" dropdown menu
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")
    WebElement learnMaterials;

    //Element for clicking on the Web Automation Advanced tab
    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement webTab;

    //Element for verifying that the inventory page is displayed
    @FindBy(id = "app-main-content")
    WebElement inventoryPage;

    //Elements for selecting device specifications
    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement deviceTypeDropdown;
    @FindBy(xpath = "//*[@id=\"brand\"]/option[2]")
    WebElement brandDropdown;
    @FindBy(id = "storage-128GB")
    WebElement storage128GB;
    @FindBy(id = "color")
    WebElement colorDropdown;

    //Elements for entering purchase details
    @FindBy(id = "quantity")
    WebElement quantityField;
    @FindBy(id = "address")
    WebElement addressField;
    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;
    @FindBy (id = "shipping-express")
    WebElement expressShippingOption;
    @FindBy(id = "warranty-option-1yr")
    WebElement oneYearWarrantyOption;
    @FindBy(id = "discount-code")
    WebElement discountCodeField;
    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchaseButton;

    public DashboardPage(WebDriver driver) {
    }

    //All methods for interacting with the elements on the dashboard page
    public void setVerifyDashboardPage(){
        verifyDashboardPage.isDisplayed();
    }
    public void clickLearnDropdown(){
        learnDropdown.click();
    }
    public void clickLearnMaterials(){
        learnMaterials.click();
    }
    public void clickWebTab(){
        webTab.click();
    }
    public void verifyInventoryPageIsDisplayed(){
        inventoryPage.isDisplayed();
    }
    public void clickDeviceTypeDropdown(){
        deviceTypeDropdown.click();
    }
    public void clickBrandDropdown(){
        brandDropdown.click();
    }
    public void clickStorage128GB(){
        storage128GB.click();
    }
    public void clickColorDropdown(){
        colorDropdown.click();
    }
    public void clickQuantityField(String number) {
        quantityField.click();
    }
    public void enterAddress(String address){
        addressField.sendKeys(address);
    }
    public void clickNextButton(){
        nextButton.click();
    }
    public void clickExpressShippingOption(){
        expressShippingOption.click();
    }
    public void clickOneYearWarrantyOption(){
        oneYearWarrantyOption.click();
    }
    public void enterDiscountCode(String discountCode) {
        discountCodeField.sendKeys(discountCode);
    }
    public void clickConfirmPurchaseButton(){
        confirmPurchaseButton.click();
    }

}

