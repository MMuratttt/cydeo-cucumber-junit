package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DicePage {

    public DicePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;


    @FindBy (id = "google-location-search")
    public WebElement zipcodeBox;

    @FindBy (xpath = "//span[@data-cy='search-count-mobile']")
    public WebElement totalJobs;


}
