import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


//Constants sınıfını burada import ettik
import static Constants.Constants.*;

public class demoqaApp {

    WebDriver driver;

    public demoqaApp(){
        //Test için gerekli olan chrome driverı kurup Constants sınıfından alacağı bilgileri(base_Url) verdik ve
        //driverın kurulumunu tamamladık
        System.setProperty("webdriver.chrome.driver","D:\\Projects\\homework2-kadak25\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(base_Url);
        driver.manage().window().maximize();
        this.driver = driver;
    }
    @Test
    public void moveToElementsPage(){
        //Waitfor metodu ile yine Constants sınıfından aldığı locatoru beklemesini ve onu görünce tıklamasını söyledik
        waitFor(elementsLocator);
        driver.findElement(elementsLocator).click();
    }
    @Test
    public void moveToWebTablesPage(){
        //Waitfor metodu ile yine Constants sınıfından aldığı locatoru beklemesini ve onu görünce tıklamasını söyledik
        waitFor(webTablesLocator);
        driver.findElement(webTablesLocator).click();
    }

    @After
    public void checkSearchBox(){
        //Waitfor metodu ile yine Constants sınıfından aldığı locatoru beklemesini ve onu görünce
        //testi bitirmesini tarayıcıyı kapatmasını ve kullanıcıya çıktı olarak bilgi vermesini söyledik
        waitFor(searchBoxLocator);
        driver.findElement(searchBoxLocator).isDisplayed();
        driver.quit();
        System.out.println("Arama Kutusu Göründü");
    }



    //Bu metod ile element görünceye kadar beklemesi gerektiğini ve kaç saniye beklemesi gerektiğini belirledik
    private void waitFor(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
