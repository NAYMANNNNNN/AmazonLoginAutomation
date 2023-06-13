package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
    public final String CepTelefonuVeyaMailText = "ap_email";
    public final String CepTelefonuVeyaMail = "ibrahim_nayman@hotmail.com";
    public final String DevamEtButton = "continue";
}
