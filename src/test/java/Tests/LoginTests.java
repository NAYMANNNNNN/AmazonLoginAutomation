package Tests;

import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import Sayfalar.SifreGirmeSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginTests {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;
    private SifreGirmeSayfasi sifreGirmeSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        sifreGirmeSayfasi = new SifreGirmeSayfasi(driver);
    }
    @Test
    void SahibindenLoginTesti() throws InterruptedException{

        driver.get("https://www.amazon.com.tr/");  //Amazon sitesi açılır
        Thread.sleep(5000);

        anaSayfa.TiklamaID(anaSayfa.AnaSayfaGirisYap);  //Giris yap tıklanır
        Thread.sleep(5000);

        girisYapSayfasi.TiklamaID(girisYapSayfasi.CepTelefonuVeyaMailText);  //Mail girilicek texte tıklanir
        Thread.sleep(4000);

        anaSayfa.alanaYaziYaz(girisYapSayfasi.CepTelefonuVeyaMailText, "ibrahim_nayman@hotmail.com"); //Mail yazilir
        Thread.sleep(5000);

        girisYapSayfasi.TiklamaID(girisYapSayfasi.DevamEtButton); //Devam et butonuna tiklanir
        Thread.sleep(5000);

        girisYapSayfasi.TiklamaID(sifreGirmeSayfasi.SifreGirmeText); //Sifre girme textine tiklanir
        Thread.sleep(3000);

        girisYapSayfasi.alanaYaziYaz(sifreGirmeSayfasi.SifreGirmeText, sifreGirmeSayfasi.Sifre); //Sifre girilir
        Thread.sleep(4000);

        girisYapSayfasi.TiklamaID(sifreGirmeSayfasi.SifreGirmeEkraniGirisYapButton);
        Thread.sleep(5000);









}
    @AfterEach
    void tearDown(){
        driver.close();
    }
}
