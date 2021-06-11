import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satvi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownButton=driver.findElement(By.id("dropdownMenuButton"));
        dropDownButton.click();
        WebElement auotocmpleteOption=driver.findElement(By.id("autocomplete"));
        auotocmpleteOption.click();

        driver.quit();
    }
}
