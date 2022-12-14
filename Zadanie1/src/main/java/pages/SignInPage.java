package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-email")
    WebElement emailInput;

    @FindBy(id = "field-password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement loginBtn;

    public void login() {
        emailInput.sendKeys("mxcpptvxjdgtepprml@tmmwj.com");
        passwordInput.sendKeys("123456a");
        loginBtn.click();
    }
}
