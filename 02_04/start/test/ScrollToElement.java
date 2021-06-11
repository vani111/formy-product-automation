import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satvi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name=driver.findElement(By.id("name"));
        Actions action=new Actions(driver);
        action.moveToElement(name);
//        try{Thread.sleep(1000);}
//        catch(InterruptedException ie)
//        {
//            System.out.println(ie);
//        }
        name.sendKeys("Srivani");
        WebElement date=driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

    driver.quit();
    }
}
