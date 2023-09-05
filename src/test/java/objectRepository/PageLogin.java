package objectRepository;
import org.openqa.selenium.By;

public class PageLogin {
    By btn_daftar = By.xpath("//*[@text='Daftar baru']");
    By btn_lanjut_dengan_email = By.xpath("//*[@text='Lanjut dengan Email']");
    By field_masukkan_email = By.className("android.widget.EditText");
    By btn_lanjut = By.xpath("//*[@text='Lanjut']");
    By btn_masuk_dengan_google = By.xpath("//*[@text='Masuk dengan Google']");
    By click_akun_google = By.id("com.google.android.gms:id/account_display_name");
    By click_no_thanks = By.xpath("//*[@text='No, thanks']");
    By click_Aktivitas_okay = By.xpath("//*[@text='Okay']");
    By click_Beranda = By.xpath("//*[@text='Beranda']");

    public By getClick_Beranda() {
        return click_Beranda;
    }

    public By getClick_Aktivitas_okay() {
        return click_Aktivitas_okay;
    }

    public By getClick_no_thanks() {
        return click_no_thanks;
    }

    public By getClick_akun_google() {
        return click_akun_google;
    }

    public By getBtn_masuk_dengan_google() {
        return btn_masuk_dengan_google;
    }

    public By getBtn_lanjut() {
        return btn_lanjut;
    }

    public By getField_masukkan_email() {
        return field_masukkan_email;
    }

    public By getBtn_lanjut_dengan_email() {
        return btn_lanjut_dengan_email;
    }

    public By getBtn_daftar() {
        return btn_daftar;
    }
}