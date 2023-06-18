package project_3_com_herokuapp_multibrowser;
/**1. Setup chrome browser
 2. Open URL
 3. Print the title of the page
 4. Print the current url
 5. Print the page source
 6. Enter the email to email field
 7. Enter the password to password field
 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_3_M
{

    static String browser ="Edge";
    static String baseUrl= "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Driver is not correct: ");
        }
            //Getting URL
             driver.get(baseUrl);

        //maximizing the page
            driver.manage().window().maximize();

        //printing title of the page using driver object
        System.out.println(driver.getTitle());

        //printing current URL

        System.out.println(driver.getCurrentUrl());
        //printing page source

        System.out.println(driver.getPageSource());
        //Entering Email Address

        driver.findElement(By.id("username")).sendKeys("mynameispinkal@gmail.com");
        //Entering Password into passowrd field
        driver.findElement(By.id("password")).sendKeys("My password is password");

        Thread.sleep(5000);

        driver.close();


    }



}
