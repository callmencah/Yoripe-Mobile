package stepDefinitions;
import config.fakerjava;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PageRecipe;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Recipe extends Hooks {

    PageRecipe PageRecipe = new PageRecipe();
    @When("I click upload foto")
    public void i_click_upload_foto() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_unggah_foto()));
        driver.findElement(PageRecipe.getClick_unggah_foto()).click();
    }
    @When("I click foto")
    public void i_click_foto() {
        driver.findElement(PageRecipe.getClick_foto()).click();
    }
    @When("I click Allow for access photos")
    public void i_click_allow_for_access_photos() {
        driver.findElement(PageRecipe.getClick_allow_to_access_photos()).click();
    }
    @When("I click burger menu")
    public void i_click_burger_menu() {
        driver.findElement(PageRecipe.getClick_burger_menu()).click();
    }
    @When("I click Download")
    public void i_click_download() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_downloads()));
        driver.findElement(PageRecipe.getClick_downloads()).click();
    }
    @When("I select Image")
    public void i_select_image() {
        driver.findElement(PageRecipe.getSelect_image()).click();
    }
    @When("I set judul recipe")
    public void i_set_judul_recipe() {
        driver.findElement(PageRecipe.getField_Tulis_judul_resepmu()).click();
        driver.findElement(PageRecipe.getField_Tulis_judul_resepmu()).sendKeys(fakerjava.generateFood());
        driver.hideKeyboard();
    }
    @When("I set descriptions recipe")
    public void i_set_descriptions_recipe() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getField_ceritakan_tentang_resepmu()));
        driver.findElement(PageRecipe.getField_ceritakan_tentang_resepmu()).click();
        driver.findElement(PageRecipe.getField_ceritakan_tentang_resepmu()).sendKeys(fakerjava.generateLorem());
        driver.hideKeyboard();
    }
    @When("I set ingredients")
    public void i_set_ingredients() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getField_bahan_bahan()));
        driver.findElement(PageRecipe.getField_bahan_bahan()).click();
        driver.findElement(PageRecipe.getFieldclass_bahan_bahan()).click();
        driver.findElement(PageRecipe.getFieldclass_bahan_bahan()).sendKeys(fakerjava.generateIngredients());
        driver.hideKeyboard();
    }
    @When("I set langkah-langkah")
    public void i_set_langkah_langkah() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getField_langkah_langkah()));
        driver.findElement(PageRecipe.getField_langkah_langkah()).click();
        driver.findElement(PageRecipe.getFieldclass_langkah_langkah()).click();
        driver.findElement(PageRecipe.getFieldclass_langkah_langkah()).sendKeys(fakerjava.generateLorem());
        driver.hideKeyboard();
        driver.findElement(PageRecipe.getScroll_todown());
    }
    @When("I set waktu memasak")
    public void i_set_waktu_memasak() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_atur_waktu()));
        driver.findElement(PageRecipe.getClick_atur_waktu()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_atur_waktu_persiapan()));
        driver.findElement(PageRecipe.getClick_atur_waktu_persiapan()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_change_waktu_persiapan()));
        driver.findElement(PageRecipe.getClick_change_waktu_persiapan()).click();

        TouchAction t = new TouchAction(driver);
        int x = 485;
        int y = 1980;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
        driver.findElement(PageRecipe.getClick_simpan()).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getClick_atur_waktu_pembuatan()));
        driver.findElement(PageRecipe.getClick_atur_waktu_pembuatan()).click();
        driver.findElement(PageRecipe.getClick_change_waktu_pembuatan()).click();

        int x1 = 485;
        int y1 = 1970;
        Point point1 = new Point(x1, y1);
        t.tap(PointOption.point(point1)).perform();
        driver.findElement(PageRecipe.getClick_simpan()).click();
        driver.findElement(PageRecipe.getClick_back()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getWaktu_memasak()));

//        int x2 = 475;
//        int y2 = 1060;
//        Point point2 = new Point(x2, y2);
//        t.tap(PointOption.point(point2)).perform();
    }

    @When("I set kategori")
    public void i_set_kategori() {
        driver.findElement(PageRecipe.getClick_tambah_kategori()).click();
        driver.findElement(PageRecipe.getClick_ayam()).click();
        driver.findElement(PageRecipe.getClick_selesai()).click();

    }
    @When("I click button Lanjut")
    public void i_click_button_lanjut() {
        driver.findElement(PageRecipe.getClick_lanjut()).click();
    }

    @When("I click pratinjau")
    public void i_click_pratinjau() {
        driver.findElement(PageRecipe.getClick_lanjut()).click();
    }

    @When("I click unggah resep")
    public void i_click_unggah_resep() {
        driver.findElement(PageRecipe.getClick_Unggah_Resep()).click();
    }

    @Then("I successfully created a recipe")
    public void i_successfully_created_a_recipe() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageRecipe.getSuccess_Unggah_Resep()));
    }
}