package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillNewAddressForm {

    public FillNewAddressForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@name='alias']")
    WebElement aliasField;

    @FindBy(id = "field-address1")
    WebElement addressField;

    @FindBy(id = "field-city")
    WebElement cityField;

    @FindBy(id = "field-postcode")
    WebElement zipCodeField;

    @FindBy(xpath = "//select[@id='field-id_country']/option[2]")
    WebElement countrySelect;

    @FindBy(id = "field-phone")
    WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    WebElement saveBtn;


    public void fillAddressField(String formAlias, String formAddress, String formCity, String formZipCode, String formPhone) {
        countrySelect.click();
        aliasField.sendKeys(formAlias);
        addressField.sendKeys(formAddress);
        cityField.sendKeys(formCity);
        zipCodeField.sendKeys(formZipCode);
        phoneField.sendKeys(formPhone);
        saveBtn.click();

    }
}
