package project_2_com_orangehrmlive;

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
public class Test_2
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="https://opensource-demo.orangehrmlive.com/";
        //Launching the Chrome Browser
        WebDriver driver =new ChromeDriver();
       //Getting the Url
        driver.get(baseUrl);
        //Maximizing the page
        driver.manage().window().maximize();
       //Printing the title of the page
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
        driver.findElement(By.name("username")).sendKeys("pinkalpatel@gmail.com");
        //Enter the password into Password field
        driver.findElement(By.name("password")).sendKeys("passwprd");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.close();
    }

}
