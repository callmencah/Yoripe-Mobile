package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageStory;
import objectRepository.PageHome;
import config.fakerjava;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Story extends Hooks {

    PageStory PageStory = new PageStory();
    PageHome PageHome = new PageHome();
    @When("I click Cerita Memasak")
    public void i_click_cerita_memasak() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageHome.getClick_Cerita_Memasak()));
        driver.findElement(PageHome.getClick_Cerita_Memasak()).click();
    }
    @When("I click unggah foto story")
    public void i_click_unggah_foto_story() {
        driver.findElement(PageStory.getClick_unggah_foto()).click();
    }

    @When("I set tambahkan judul")
    public void i_set_tambahkan_judul() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageStory.getClick_tambah_judul()));
        driver.findElement(PageStory.getClick_tambah_judul()).click();
        driver.findElement(PageStory.getClick_tambah_judul()).sendKeys(fakerjava.generateFood());
        driver.hideKeyboard();
    }

    @When("I Set Tulis Postingan")
    public void i_set_tulis_postingan() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageStory.getClick_tulis_postingan()));
        driver.findElement(PageStory.getClick_tulis_postingan()).click();
        driver.findElement(PageStory.getClick_tulis_postingan()).sendKeys(fakerjava.generateLorem());
        driver.hideKeyboard();
    }
    @When("I click button tandai tantangan")
    public void i_click_button_tandai_tantangan() throws InterruptedException {
        driver.findElement(PageStory.getClick_NB()).click();
        driver.findElement(PageStory.getEmpty_click()).click();

        Thread.sleep(5);
        driver.findElement(PageStory.getClick_button_tandai_tantangan()).click();
    }


    @When("I select cookandshare")
    public void i_select_cookandshare() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageStory.getClick_cookandshare()));
        driver.findElement(PageStory.getClick_cookandshare()).click();
        driver.hideKeyboard();
        driver.hideKeyboard();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageStory.getClick_button_bagikan()));
    }

    @Then("I click button bagikan")
    public void i_click_button_bagikan() {
        driver.findElement(PageStory.getClick_NB()).click();
        driver.findElement(PageStory.getClick_button_bagikan()).click();
    }
}