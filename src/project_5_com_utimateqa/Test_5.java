package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**1. Setup chrome browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browser* */
public class Test_5
{
    public static void main(String[] args) throws InterruptedException {

        String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
        //Set-up the Browser
        WebDriver driver =new ChromeDriver();
        //Opening the URL
        driver.get(baseUrl);
        //maximizing the page
        driver.manage().window().maximize();
        // Getting the page title
        System.out.println(driver.getTitle());
        //waiting time for page
        //Printing the current URL
        System.out.println(driver.getCurrentUrl());
        //Priting the page source
        System.out.println(driver.getPageSource());
        //Entering the Email into email field

        driver.findElement(By.id("user[email]")).sendKeys("pinkalpatel@gmail.com");
        //Entering the Password into password field
        driver.findElement(By.id("user[password]")).sendKeys("password");


      Thread.sleep(5000);

        //closing the driver

        driver.close();








    }


}
