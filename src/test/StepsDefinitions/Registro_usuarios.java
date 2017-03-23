import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Created by kcolina on 17/03/2017.
 */
public class Registro_usuarios {

    @Given("")
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--no-sandbox");
        //options.addArguments("user-data-dir=" + profilePath);

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://gamedb2.herokuapp.com/");
        driver.manage().window().maximize();
    }

}
