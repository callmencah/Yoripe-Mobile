package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageLogin;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.touch.offset.PointOption;
import java.net.MalformedURLException;

public class Login extends Hooks {

    PageLogin PageLogin = new PageLogin();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws MalformedURLException {
        before();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageLogin.getBtn_daftar())
        );
    }
    @When("I click Masuk")
    public void i_click_masuk() {
        TouchAction t = new TouchAction(driver);
        int x = 719;
        int y = 1956;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();

    }
    @When("I click button masuk dengan google")
    public void i_click_button_masuk_dengan_google() {
        driver.findElement(PageLogin.getBtn_masuk_dengan_google()).click();
    }

    @When("I select account google")
    public void i_select_account_google() {
        driver.findElement(PageLogin.getClick_akun_google()).click();
    }
    @When("I click no thank and I click Okay")
    public void i_click_no_thank_and_i_click_okay() {
        driver.findElement(PageLogin.getClick_no_thanks()).click();
        driver.findElement(PageLogin.getClick_Aktivitas_okay()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageLogin.getClick_Beranda()));
    }
    @Then("successfully logged in I am now on the home page")
    public void successfully_logged_in_I_am_now_on_the_home_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageLogin.getClick_Beranda()));
    }
}