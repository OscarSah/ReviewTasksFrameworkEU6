package com.interviewTask.pages;

import com.interviewTask.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage{


public WebElement getCategory(String category){
    return Driver.get().findElement(By.linkText(category));
}

public WebElement getProduct (String product){
    return Driver.get().findElement(By.linkText(product));
}

public WebElement getLink(String linkName){
    return Driver.get().findElement(By.partialLinkText(linkName));
}

    @FindBy(xpath = "//a[@class='hrefch']")
    public List<WebElement> products;

}
