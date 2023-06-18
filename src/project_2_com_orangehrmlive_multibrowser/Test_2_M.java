package project_2_com_orangehrmlive_multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Test_2_M
{

        static String  browser ="Edge";
        static String  baseUrl = "https://opensource-demo.orangehrmlive.com/";
        static WebDriver driver; //Driver Declaration

    public static void main(String[] args) throws InterruptedException {
        if(browser.equalsIgnoreCase("Chrome")){
            driver =new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver =new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver =new EdgeDriver();
        }else{
            System.out.println(" It's Not correct browser");
        }
        //Getting url
        driver.get(baseUrl);
        //maximizing the page
        driver.manage().window().maximize();

        String title =driver.getTitle();

        System.out.println("The title of the page is:  "+ title);
        //loop for checking the correct URl
        if(title.equalsIgnoreCase("OrangeHRM"))
        {
            System.out.println("It is correct title");
        }else
            System.out.println("It is not correct title");

        String url =driver.getCurrentUrl();
        System.out.println(url);
        //comparing URL
        if(url.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com" +
                "/web/index.php/auth/login")){
            System.out.println("It is correct URL");
        }else
            System.out.println("It is not correct URL");
        //Get page source
        System.out.println(driver.getPageSource());


        //Enter the email ID in Email field
        driver.findElement(By.name("username")).sendKeys("mynameispinkal@gmail.com");
        //Enter the password into Password field
        driver.findElement(By.name("password")).sendKeys("newpassword");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.close();

    }


}
