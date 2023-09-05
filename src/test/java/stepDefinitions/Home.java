package stepDefinitions;
import io.cucumber.java.en.When;
import objectRepository.PageHome;


public class Home extends Hooks {

    PageHome PageHome = new PageHome();
    @When("I click button buat")
    public void i_click_button_buat() {
        driver.findElement(PageHome.getClick_btn_buat()).click();
    }
    @When("I click unggah recipe")
    public void i_click_unggah_recipe() {
        driver.findElement(PageHome.getClick_Unggah_Resep()).click();
    }
}