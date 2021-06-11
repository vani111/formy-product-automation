import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satvi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
       WebElement newTabButton=driver.findElement(By.id("new-tab-button"));
       newTabButton.click();
       String originalHandle=driver.getWindowHandle() ;
       for(String handle:driver.getWindowHandles()){
           driver.switchTo().window(handle);
       }
       driver.switchTo().window(originalHandle);
       driver.quit();
    }
}
