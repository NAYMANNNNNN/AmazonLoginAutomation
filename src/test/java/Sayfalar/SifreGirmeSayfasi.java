package Sayfalar;

import org.openqa.selenium.WebDriver;

public class SifreGirmeSayfasi extends Sayfa{
    public SifreGirmeSayfasi(WebDriver driver) {
        super(driver);
    }
    public final String SifreGirmeText = "ap_password";
    public final String Sifre ="123789Ccc1";
    public final String SifreGirmeEkraniGirisYapButton = "signInSubmit";

}
