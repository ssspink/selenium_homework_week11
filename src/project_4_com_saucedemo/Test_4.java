package project_4_com_saucedemo;

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
public class Test_4
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.saucedemo.com/";
        //Set up ChromeBrowser
        WebDriver driver =new ChromeDriver();
        //Open URl
        driver.get(baseUrl);
        //maximizing the page
        driver.manage().window().maximize();
        //Printing title of the page
        String pageTitle =driver.getTitle();
        //printing the page title
        System.out.println(pageTitle);

        //Comparing the title
         String expectedTitle ="Swag Labs";
        if(pageTitle.equals(expectedTitle)){
            System.out.println("The title match the expected value");
        }else
            System.out.println("Title does not match the expected value");
        //getting current URL
        String currentUrl =driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Comparing the URL
        String expectedUrl = "https://www.saucedemo.com/";
        if(currentUrl.equals(expectedUrl))
        {
            System.out.println("The Current URL match the value");
        }else
            System.out.println("The current URL does not match the value");
        //Printing the page Source
        System.out.println(driver.getPageSource());

        //Entering email ID into email field
        driver.findElement(By.id("user-name")).sendKeys("pinkalpatel@gmail.com");

        //Entering Password into Password field
        driver.findElement(By.id("password")).sendKeys("Password");

        Thread.sleep(5000);
    //closing the driver
        driver.close();




    }





}
