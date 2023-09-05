package objectRepository;
import org.openqa.selenium.By;

public class PageStory {
    By click_unggah_foto = By.xpath("//*[@text='Anda bisa unggah hingga 6 foto atau 1 video.\n" +
            "Jangan lupa untuk unggah foto tambahan untuk thumbnail video Anda.']");
    By click_tambah_judul = By.xpath("//*[@text='Tambahkan Judul']");
    By click_tulis_postingan = By.xpath("//*[@text='Tulis postingan anda di sini.']");
    By click_button_tandai_tantangan = By.xpath("//*[@text='Tandai Tantangan Seru']");
    By click_cookandshare = By.xpath("//*[@text='#CookAndShare']");
    By click_NB = By.xpath("//*[@text='N.B. Pastikan itu adalah masakan rumahan']");
    By empty_click = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]");
    By click_button_bagikan = By.xpath("//*[@text='Bagikan']");

    public By getEmpty_click() {
        return empty_click;
    }

    public By getClick_NB() {
        return click_NB;
    }

    public By getClick_unggah_foto() {
        return click_unggah_foto;
    }

    public By getClick_tambah_judul() {
        return click_tambah_judul;
    }

    public By getClick_tulis_postingan() {
        return click_tulis_postingan;
    }

    public By getClick_button_tandai_tantangan() {
        return click_button_tandai_tantangan;
    }

    public By getClick_cookandshare() {
        return click_cookandshare;
    }

    public By getClick_button_bagikan() {
        return click_button_bagikan;
    }
}
