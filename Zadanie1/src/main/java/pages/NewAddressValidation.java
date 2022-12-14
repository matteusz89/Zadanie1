package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressValidation {

    public NewAddressValidation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    WebElement addressVerifier;

    public boolean isAddressVerifierDisplayed() {
        return addressVerifier.isDisplayed();
    }
}
