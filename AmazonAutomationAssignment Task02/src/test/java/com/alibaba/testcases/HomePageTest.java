package com.alibaba.testcases;

import com.alibaba.base.base;
import com.alibaba.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends base {



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
