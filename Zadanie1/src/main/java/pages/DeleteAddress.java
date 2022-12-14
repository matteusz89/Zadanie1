package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAddress {

    public DeleteAddress(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"address-29783\"]/div[2]/a[2]/i")
    WebElement deleteAddressBtn;

    @FindBy (xpath = "//*[@id=\"notifications\"]/div/article/ul/li")
    WebElement deletationVerify;

    public void addressGone(){
        deleteAddressBtn.click();
    }

    public boolean isAddressGone(){
        return deletationVerify.isDisplayed();
    }
}
