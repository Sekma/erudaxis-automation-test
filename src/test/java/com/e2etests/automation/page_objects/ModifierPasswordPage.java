package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class ModifierPasswordPage {
	private WebDriverWait wait;	
	private JavascriptExecutor executor;
/**FindBy**/
	@FindBy(how = How.XPATH, using = "//img[@alt='profile-image']")
	public WebElement user_btn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='MuiBox-root css-7d48jc']//div[@class='MuiBox-root css-1rr4qq7']")
	public WebElement parametre_btn;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='mot de passe']")
	public WebElement password_btn;
	
	@FindBy(how = How.XPATH, using = "//div[@label='Mot de passe actuel']//input[@id='nv-mot-de-passe']")
	public WebElement password_actuel;
	
	@FindBy(how = How.XPATH, using = "//div[@label='Nouveau mot de passe']//input[@id='nv-mot-de-passe']")
	public WebElement new_password;
	
	@FindBy(how = How.ID, using = "cofirm-mot-de-passe")
	public WebElement confirm_new_password;
	
	@FindBy(how = How.ID, using = "btn-change-pass")
	public WebElement confirm_btn;
	
	@FindBy(how = How.ID, using = "swal2-title")
	public WebElement success_msg;
	
	public ModifierPasswordPage(){
		PageFactory.initElements(Setup.getDriver(),this);
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
		this.executor = (JavascriptExecutor) Setup.getDriver();
		
	}
	
	
/**Method**/
	
	public void clichOnUserBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(user_btn)).click();
		}
	public void clickOnParametreBtn() {
		parametre_btn.click();
	}
	public void clickOnPasswordBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(password_btn)).click();
		
	}
	public void fillPasswordActuel(String actuel_pwd) {
		executor.executeScript("arguments[0].scrollIntoView();",password_actuel);	
		password_actuel.sendKeys(actuel_pwd);
	}
	public void fillNewPassword(String new_pwd) {
		new_password.sendKeys(new_pwd);
	}
	public void confirmNewPassword(String new_pwd) {
		confirm_new_password.sendKeys(new_pwd);
	}
	public void clickOnChangerMotDePasse() {
		//wait.until(ExpectedConditions.elementToBeClickable(confirm_btn)).click();
		executor.executeScript("arguments[0].click();",confirm_btn);
	}
	public String getAlertText() {
		return wait.until(ExpectedConditions.visibilityOf(success_msg)).getText();
	}
}
