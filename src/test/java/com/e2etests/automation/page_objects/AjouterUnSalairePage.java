package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class AjouterUnSalairePage {
	
	private WebDriverWait wait;	
	
	/**FindBy**/
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[@class='MuiDrawer-root MuiDrawer-docked css-v3kr55']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-e1df1o']/ul[@class='MuiList-root MuiList-padding css-zws9p5']/a[3]/li[1]/div[1]")
	public WebElement administration_btn;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Finances']")
	public WebElement finance_btn;
	 
	@FindBy(how = How.XPATH, using = "//ul[@class='MuiList-root MuiList-padding css-eturh6']//ul[1]//li[1]//div[1]//i[1]")
	public WebElement charge_btn ;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/administration/finance/gestionCharge/salaires']//li[@class='MuiListItem-root MuiListItem-padding css-zanowv']")
	public WebElement salaire_btn;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='+Ajouter un Salaire']")
	public WebElement ajouter_salaire_btn;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement name_input;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	public WebElement statut_input;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
	public WebElement date_input;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	public WebElement salaire_brute_input;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/input[1]")
	public WebElement journee_absence_input;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Ajouter']")
	public WebElement ajouter_btn;
	
	public AjouterUnSalairePage(){
		PageFactory.initElements(Setup.getDriver(),this);
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
		
	}
	
	
/**Method**/
	
	public void clickOnAdministration() {
		wait.until(ExpectedConditions.elementToBeClickable(administration_btn)).click();
	}
	public void clickOnFinances() {
		finance_btn.click();
	}
	public void clickOnCharges() {
		charge_btn.click();
	}
	public void clickOnSalaires() {
		salaire_btn.click();
	}
	public void clickOnAjouterUnSalaire() {
		wait.until(ExpectedConditions.elementToBeClickable(ajouter_salaire_btn)).click();
	}
	public void fillName(String name) {
		name_input.click();
		name_input.sendKeys(name);
		name_input.sendKeys(Keys.ARROW_DOWN);
		name_input.sendKeys(Keys.ENTER);
		 
	}
	public void fillStatut(String statut) {
		statut_input.sendKeys(statut);
	}
	public void fillDateDembauche(String date) {
		date_input.sendKeys(date);
	}
	public void fillSalaireBrute(String salaire) {
		salaire_brute_input.sendKeys(salaire);
	}
	public void fillFraisJourneeDabsence(String frais) {
		journee_absence_input.sendKeys(frais);
	}
	public void clickOnAjouterBtn() {
		ajouter_btn.click();
	}
	
}
