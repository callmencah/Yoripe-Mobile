package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageRecipe {
    By click_unggah_foto = By.xpath("//*[@text='Unggah foto dan 1 video (maks 300mb dan 10 item)']");
    By click_foto = By.xpath("//*[@text='Foto']");
    By click_allow_to_access_photos = By.xpath("//*[@text='Allow']");
    By click_burger_menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]");
    By click_downloads = By.xpath("//*[@text='Downloads']");
    By select_image = By.id("com.google.android.documentsui:id/icon_thumb");
    By field_Tulis_judul_resepmu = By.xpath("//*[@text='Tulis judul resepmu']");
    By alert_resep = By.xpath("//*[@text='Nama resep kamu masih kosong']");
    By field_ceritakan_tentang_resepmu = By.xpath("//*[@text='Ceritakan tentang resepmu di sini...']");
    By alert_deskripsi = By.xpath("//*[@text='Deskripsi kamu masih kosong']");
    By field_bahan_bahan = By.xpath("//*[@text='Minyak Goreng']");
    By fieldclass_bahan_bahan = By.xpath("//*[@text='250 g Udang\n" +
            "3 sdm Minyak Goreng\n" +
            "5 buah Bakso\n" +
            "2 piring Nasi\n" +
            "1 sdm Kecap']");
    By alert_bahan_bahan = By.xpath("//*[@text='Bahan kamu masih kosong']");

    By field_langkah_langkah = By.xpath("//*[@text='Langkah 1\n" +
            "Panaskan minyak dan tumis bumbu hingga sedikit kecoklatan. Masukan telur, lalu aduk.\n" +
            "Langkah 2\n" +
            "Tambahkan udang, bakso, dan sosis. Aduk kembali.']");
    By fieldclass_langkah_langkah = By.xpath("//*[@text='1. Panaskan minyak dan tumis bumbu hingga sedikit kecoklatan. Masukan telur, lalu aduk.\n" +
            "2. Tambahkan udang, bakso, dan sosis. Aduk kembali.']");
    By alert_langkah_langkah = By.xpath("//*[@text='langkah_langkah']");
    By click_atur_waktu = By.xpath("//*[@text='Atur Waktu  ']");
    By click_simpan = By.xpath("//*[@text='Simpan']");

    By alert_atur_waktu = By.xpath("//*[@text='0j 0m Persiapan ⬤ 0j 0m Masak']");

    By click_atur_waktu_persiapan = By.xpath("//*[@text='0j 0m ']");
    By click_change_waktu_persiapan = By.xpath("//android.widget.SeekBar[@content-desc=\"00, Select Hour\"]");
    By click_atur_waktu_pembuatan = By.xpath("//*[@text='0j 0m ']");
    By click_change_waktu_pembuatan = By.xpath("//android.widget.SeekBar[@content-desc=\"00, Select Hour\"]");
    By alert_kategori = By.xpath("//*[@text='Tag minimal 1 kategori']");
    By waktu_memasak = By.xpath("//*[@text='Waktu Memasak']");
    By click_tambah_kategori = By.xpath("//*[@text='+ Tambah Kategori']");
    By click_ayam = By.xpath("//*[@text='Ayam']");
    By click_selesai = By.xpath("//*[@text='Selesai']");
    By click_lanjut = By.xpath("//*[@text='Lanjut']");
    By click_pratinjau = By.xpath("//*[@text='Pratinjau']");
    By click_Unggah_Resep = By.xpath("//*[@text='Unggah Resep']");
    By success_Unggah_Resep = By.xpath("//*[@text='Resepmu berhasil diunggah lho! \uD83C\uDF89']");

    By scroll_todown = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Kategori\"))");

    public By getSuccess_Unggah_Resep() {
        return success_Unggah_Resep;
    }

    public By getClick_Unggah_Resep() {
        return click_Unggah_Resep;
    }

    public By getClick_pratinjau() {
        return click_pratinjau;
    }

    public By getClick_lanjut() {
        return click_lanjut;
    }

    public By getClick_selesai() {
        return click_selesai;
    }

    public By getClick_ayam() {
        return click_ayam;
    }

    public By getClick_tambah_kategori() {
        return click_tambah_kategori;
    }

    public By getScroll_todown() {
        return scroll_todown;
    }

    By click_back = By.xpath("//*[@text='\uE5E0']");
    public By getWaktu_memasak() {
        return waktu_memasak;
    }

    public By getClick_back() {
        return click_back;
    }

    public By getClick_change_waktu_pembuatan() {
        return click_change_waktu_pembuatan;
    }

    public By getClick_atur_waktu_pembuatan() {
        return click_atur_waktu_pembuatan;
    }

    public By getClick_change_waktu_persiapan() {
        return click_change_waktu_persiapan;
    }

    public By getClick_atur_waktu_persiapan() {
        return click_atur_waktu_persiapan;
    }

    public By getClick_simpan() {
        return click_simpan;
    }

    public By getAlert_kategori() {
        return alert_kategori;
    }




    public By getAlert_atur_waktu() {
        return alert_atur_waktu;
    }

    public By getClick_atur_waktu() {
        return click_atur_waktu;
    }

    public By getFieldclass_langkah_langkah() {
        return fieldclass_langkah_langkah;
    }

    public By getAlert_langkah_langkah() {
        return alert_langkah_langkah;
    }

    public By getFieldclass_bahan_bahan() {
        return fieldclass_bahan_bahan;
    }

    public By getField_bahan_bahan() {
        return field_bahan_bahan;
    }

    public By getAlert_bahan_bahan() {
        return alert_bahan_bahan;
    }

    public By getField_langkah_langkah() {
        return field_langkah_langkah;
    }

    public By getSelect_image() {
        return select_image;
    }

    public By getClick_downloads() {
        return click_downloads;
    }
    public By getClick_burger_menu() {
        return click_burger_menu;
    }

    public By getClick_allow_to_access_photos() {
        return click_allow_to_access_photos;
    }

    public By getClick_foto() {
        return click_foto;
    }

    public By getClick_unggah_foto() {
        return click_unggah_foto;
    }

    public By getAlert_deskripsi() {
        return alert_deskripsi;
    }

    public By getField_ceritakan_tentang_resepmu() {
        return field_ceritakan_tentang_resepmu;
    }

    public By getAlert_resep() {
        return alert_resep;
    }

    public By getField_Tulis_judul_resepmu() {
        return field_Tulis_judul_resepmu;
    }
}
