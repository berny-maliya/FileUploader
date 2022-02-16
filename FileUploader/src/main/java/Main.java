import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BernyCsti\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.mx/imghp?hl=es");

        WebElement fileUploadField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]/span"));
        fileUploadField.click();
        fileUploadField=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/div[1]/div/a"));
        fileUploadField.click();
        Thread.sleep(3000);
        fileUploadField=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/div[2]/div[2]/input"));
        Thread.sleep(2000);

        fileUploadField.sendKeys("C:\\Users\\eliez\\Desktop\\Proyectos\\practica2\\src\\main\\java\\weezer.png");

        //driver.quit();

    }
}