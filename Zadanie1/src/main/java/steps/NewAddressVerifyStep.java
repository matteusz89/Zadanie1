package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

public class NewAddressVerifyStep {

    public static WebDriver driver;
    public String url = "https://mystore-testlab.coderslab.pl/index.php/";

    @Given("Uzytkownik znajduje sie na stronie glownej aplikacji")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("Uzytkownik wybiera opcje Sign In")
    public void goToLoginPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
    }

    @And("Uzytkownik wpisuje poprawny email oraz haslo a nastepnie zatwierdza  dane poprzez klikniecie przycisku zalogowania")
    public void logInToApp() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.login();
    }

    @And("Przechodzi do zakladki z adresami i wybiera opcje dodania nowego adresu dostawy")
    public void goToNewAddressPage() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickOnAddressBtn();
        yourAccountPage.addNewAddressBtn();
    }


    @Then("^Wypelnia dane formularza \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" oraz \"(.*)\" oraz zatwierdza dodanie adresu.$")
    public void fillAddressForm(String formAlias, String formAddress, String formCity, String formZipCode, String formPhone) {
        FillNewAddressForm fillNewAddressForm = new FillNewAddressForm(driver);
        fillNewAddressForm.fillAddressField(formAlias, formAddress, formCity, formZipCode, formPhone);

    }

    @And ("Waliduje poprawnosc wpisanych danych")
    public void verifyNewAddress(){
        NewAddressValidation newAddressValidation = new NewAddressValidation(driver);
        Assert.assertTrue(newAddressValidation.isAddressVerifierDisplayed());
    }

    @And ("Usuwa oraz waliduje usunięcie nowo dodanego adresu")
    public void removeAddress(){
        DeleteAddress deleteAddress = new DeleteAddress(driver);
        deleteAddress.addressGone();
        deleteAddress.isAddressGone();
    }

    @And ("Zamyka przeglądarkę")
        public void tearDown(){
            driver.quit();
    }

}
