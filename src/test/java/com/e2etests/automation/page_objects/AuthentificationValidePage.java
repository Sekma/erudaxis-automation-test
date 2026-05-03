package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationValidePage {

	private ConfigFileReader configFileReader; 
	private WebDriverWait wait;
	
	//** @FindBy **//
	@FindBy(how = How.ID, using = "sign-in-email-input")
	public WebElement email_input;

    @FindBy(how = How.ID, using = "sign-in-password-input")
    public WebElement password_input;

    @FindBy(how = How.XPATH , using = "//div[@class='MuiBox-root css-1xu9e0d']")
    public WebElement submit_btn;

    @FindBy(how = How.XPATH , using = "//h6[normalize-space()='lycee']")
    public WebElement category_lycee_bnt;

    @FindBy(how = How.XPATH , using = "//p[@aria-label='lycee']")
    public WebElement category_title;
	
	public AuthentificationValidePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
	}
	
	/** Create methods **/
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

    public void fillEmail(String email){
        email_input.sendKeys(email);
    }

    public void fillPassword(String password){
        password_input.sendKeys(password);
    }

    public void clickOnSumbitBtn(){
        submit_btn.click();
    }

    public void clickOnLyceeCategory(){
    	wait.until(ExpectedConditions.elementToBeClickable(category_lycee_bnt)).click();
    }

    public String getCategoryText(){
        return wait.until(ExpectedConditions.elementToBeClickable(category_title)).getText();
    }

}
