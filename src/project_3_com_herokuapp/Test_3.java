package project_3_com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/****1. Setup chrome browser
 2. Open URL
 3. Print the title of the page
 4. Print the current url
 5. Print the page source
 6. Enter the email to email field
 7. Enter the password to password field
 8. Close the browser* */
public class Test_3
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Set up the ChromeBrowser
        WebDriver driver =new ChromeDriver();
        //Getting the URL
        driver.get(baseUrl);
        //Maximizing the page
        driver.manage().window().maximize();
        //Print title of the page using driver object
        System.out.println(driver.getTitle());
        //printing current url using driver object
        System.out.println(driver.getCurrentUrl());
        //printing page source using driver object
        System.out.println(driver.getPageSource());
        //Entering email ID into Email field
        driver.findElement(By.id("username")).sendKeys("pinkalpatel@gmail.com");
        //Entering Password into passowrd field
        driver.findElement(By.id("password")).sendKeys("password");

        Thread.sleep(5000);

        driver.close();
    }

}
