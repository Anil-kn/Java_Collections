package Practicepageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(String args[]) throws Exception
    {

        // System.setProperty("webdriver.chrome.driver","");
        WebDriver driver=new ChromeDriver();
        driver.get("https://cloud.kpisoft.com/home/#/signin");
        Thread.sleep(4000);
        driver.findElement(By.id("username")).sendKeys("admin@cloud.com");
        driver.findElement(By.id("KPI_Password")).sendKeys("Admin@123");
        driver.quit();
    }


}
