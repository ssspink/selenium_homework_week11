package project_1_com_nopcommerce;

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
 8. Close the browser
 */
public class Test_1
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //Launching the Chrome Browser
        WebDriver driver =new ChromeDriver();
        //Open the URL
        driver.get(baseUrl);
        //Maximize the page
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print Title of the page
        System.out.println("The title of the page is:  "   +driver.getTitle());
        //Print Current URL
        System.out.println("The Current URL the web page is:  "  +driver.getCurrentUrl());
        //Print page source
        System.out.println("The Page source is: "  +driver.getPageSource());
        //Enter the email ID into Email field
        driver.findElement(By.id("Email")).sendKeys("Pinkalpatel@gmail.com");
        //Enter the Passwpord into Password field
        driver.findElement(By.id("Password")).sendKeys("Passwprd");

        Thread.sleep(5000);
        //closing the browser
        driver.close();

    }

}
