package com.interviewTask.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

@FindBy(xpath = "//h2")
public WebElement product;
}
