package project_1_com_nopcommerce_multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Test_1_M
{
        static String browser ="Chrome";
        static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
        static WebDriver driver; //Declaration

    public static void main(String[] args) throws InterruptedException {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver =new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else
            System.out.println(" Wrong brwser Name: ");
        //Getting URL
        driver.get(baseUrl);
        //Maximizing window
        driver.manage().window().maximize();
        System.out.println("The title of the page is:  "   +driver.getTitle());
        //Print Current URL
        System.out.println("The Current URL the web page is:"  +driver.getCurrentUrl());
        //Print page source
        System.out.println("The Page source is: "  +driver.getPageSource());
        //Enter the email ID into Email field
        driver.findElement(By.id("Email")).sendKeys("mynameispinkal@gmail.com");
        //Enter the Passwpord into Password field
        driver.findElement(By.id("Password")).sendKeys("Passwprd");





        Thread.sleep(5000);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.close();


    }





}
