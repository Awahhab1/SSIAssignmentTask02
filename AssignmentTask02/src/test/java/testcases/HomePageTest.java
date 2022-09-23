package testcases;

import base.baseclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends baseclass {

    public static HomePage homePage;

    HomePageTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp(){

        initialization();
        HomePage homePage= new HomePage();

    }



    @Test(priority = 1)
    public void navigateThroughApplicationTest(){

        homePage.navigateThroughApplication();
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }


}
