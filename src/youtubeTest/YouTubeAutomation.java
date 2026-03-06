package youtubeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        System.out.println("Test Case 1: Page opened successfully");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.name("search_query")).sendKeys("selenium tutorial");
        System.out.println("Test Case 2: Search keyword entered successfully");

        driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
        System.out.println("Test Case 3: Search executed successfully");

        Thread.sleep(5000);

        driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
        System.out.println("Test Case 4: First video opened successfully");

        Thread.sleep(8000);

        driver.quit();
        System.out.println("Test Case 5: Browser closed successfully");
    }
}