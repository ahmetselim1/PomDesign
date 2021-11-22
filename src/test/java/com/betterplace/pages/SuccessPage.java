package com.betterplace.pages;

import com.betterplace.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage extends BasePage{

    public SuccessPage(){ PageFactory.initElements(Driver.getDriver(), this);}

}
