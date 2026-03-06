package youtubeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Locate search box
        driver.findElement(By.name("search_query")).sendKeys("selenium tutorial");

        // Press ENTER instead of clicking search button
        driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        // Click first video
        driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();

        Thread.sleep(10000);

        driver.quit();
    }
}