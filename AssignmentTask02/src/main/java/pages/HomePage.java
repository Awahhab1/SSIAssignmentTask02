package pages;

import base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends baseclass {


    @FindBy(xpath="//i[@data-spm-anchor-id='a2700.8293689.scGlobalHomeHeader.i3.2ce267af7pDISO']")
    WebElement categoriesWebElement;


    @FindBy(xpath="//i[@data-spm-anchor-id='a2700.8293689.scGlobalHomeHeader.i4.2ce267af7pDISO']")
    WebElement subCategoriesWebElement;
    @FindBy(xpath="//i[@data-spm-anchor-id='a2700.8293689.scGlobalHomeHeader.623']")
    WebElement showCarelink;


    @FindBy(xpath="//i[@data-spm-anchor-id='a27aq.industry_category_productlist.0.0']")
    WebElement shoeBrushelink;


    public HomePage(){

        PageFactory.initElements(driver,this); // this point to current class object
    }

    public String ValidateHomePageTile(){
        return driver.getTitle();
    }

    public void navigateThroughApplication(){

        // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS) ;
        System.out.println("Pass");
        Actions category=new Actions(driver);
        category.moveToElement(categoriesWebElement).build().perform();

        Actions subCategory=new Actions(driver);
        subCategory.moveToElement(subCategoriesWebElement).build().perform();

        showCarelink.click();

    }
}
