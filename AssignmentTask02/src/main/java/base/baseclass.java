package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseclass {

    public static WebDriver driver;
    public static Properties prop;

    // All initial properties  Driver Initilization


    // Class Constructor
    public baseclass() {

        try {

            prop = new Properties();//D:\IdeaProjects\AmazonAutomationAssignmentTask02\
            FileInputStream ip = new FileInputStream("src\\main\\java\\config\\config.properties");

            prop.load(ip);
            //System.out.println(prop.getProperty("browser"));


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void initialization(){


        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get(prop.getProperty("url"));
        //driver.manage().timeouts().pageLoadTimeout(600, TimeUnit.SECONDS);
    }
}
