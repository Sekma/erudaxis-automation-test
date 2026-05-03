package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class AuthentificationInvalidePage {
	
	private WebDriverWait wait;
	
	/**FindBy**/
	@FindBy(how = How.ID, using = "error-alert")
	public WebElement alert;
	
	public AuthentificationInvalidePage() {
		PageFactory.initElements(Setup.getDriver(),this);	
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
	}
	
	/**Methode**/
	public String getAlertText() {
		return wait.until(ExpectedConditions.visibilityOf(alert)).getText();
	}
}
