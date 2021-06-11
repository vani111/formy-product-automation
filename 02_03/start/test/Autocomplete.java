import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satvi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd,Pal Alto,CA");
         try{ Thread.sleep(1000);}catch(InterruptedException ie){
             System.out.println("Interrupted exception caught");
         }
        WebElement autocompleteResult=driver.findElement(By.className("pac-item")) ;
        autocompleteResult.click();

        //button.click();

        driver.quit();
    }

     }
