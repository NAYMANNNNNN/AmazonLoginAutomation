package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Sayfa {
WebDriver driver;

public Sayfa(WebDriver driver){
    this.driver = driver;
}
public void  TiklamaID (String TusId){     //Tiklama yaptırıyoruz
    driver.findElement(By.id(TusId)).click();
    }
    public void KlavyeTusunaBasCss(String elementId, Keys klavyeTusu){  //Enter tuşuna bastırdık klavyeden
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }
    public void TiklamaXpath(String tusXpath) {

        driver.findElement(By.xpath(tusXpath)).click();
    }
    public  void  TiklamaCss (String TusCss){     //Tiklama yaptırıyoruz
        driver.findElement(By.id(TusCss)).click();
    }
    public void alanaYaziYaz(String elementId, String email) {
        driver.findElement(By.id(elementId)).sendKeys(email);
    }

}
