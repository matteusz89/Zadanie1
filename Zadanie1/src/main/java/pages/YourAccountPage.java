package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {

    public YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"addresses-link\"]/span")
    WebElement addressesBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/a/span")
    WebElement newAddressBtn;

    public void clickOnAddressBtn() {
        addressesBtn.click();
    }

    public void addNewAddressBtn() {
        newAddressBtn.click();
    }
}

