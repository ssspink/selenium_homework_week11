package project_5_com_utimateqa_multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class Test_5_M {
    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Driver is not Correct");
        }
        //getting URL
        driver.get(baseUrl);

        // Maximizing the page
        driver.manage().window().maximize();
        // Printing the title page
        System.out.println(driver.getTitle());

        //printing the current URL
        System.out.println(driver.getCurrentUrl());

        //Printing the page source
        System.out.println(driver.getPageSource());

        //Using Sendkey method Inserting the value
        driver.findElement(By.id("user[email]")).sendKeys("mynameispinkal@gmail.com");
        //Entering the Password into password field
        driver.findElement(By.id("user[password]")).sendKeys("mypasswordispassword");


        Thread.sleep(5000);

        //closing the driver

        driver.close();




    }


}
