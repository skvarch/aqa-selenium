import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/artems/IdeaProjects/aqa-selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.udemy.com/");
    }
}
