import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satvi\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radiobutton1=driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
         radioButton2.click();WebElement radioButton3=driver.findElement(By.xpath("/html/body/div/div[3]/label"));
         radioButton3.click();

        driver.quit();
    }
}
