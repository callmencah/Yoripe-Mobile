package objectRepository;

import org.openqa.selenium.By;

public class PageHome {
    By click_btn_buat = By.xpath("//*[@text='Buat']");
    By click_Unggah_Resep = By.xpath("//*[@text='Unggah Resep']");
    By click_Cerita_Memasak = By.xpath("//*[@text='Cerita Memasak']");
    By click_Siaran_langsung = By.xpath("//*[@text='Siaran Langsung']");

    public By getClick_Siaran_langsung() {
        return click_Siaran_langsung;
    }

    public By getClick_Cerita_Memasak() {
        return click_Cerita_Memasak;
    }

    public By getClick_Unggah_Resep() {
        return click_Unggah_Resep;
    }

    public By getClick_btn_buat() {
        return click_btn_buat;
    }
}
