package demoProject.webProjectDemo1.business.concretes;
import demoProject.webProjectDemo1.business.abstracts.SeleniumService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManager implements SeleniumService {

    public void Selenium() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        driver.quit();
    }
}
