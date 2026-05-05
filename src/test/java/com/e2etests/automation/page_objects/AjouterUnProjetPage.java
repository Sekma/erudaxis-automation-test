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

public class AjouterUnProjetPage {
	
	private WebDriverWait wait;
	
/**FindBy**/ 
	@FindBy(how = How.XPATH, using = "//a[@href='/suiviTache/ListeProjet']//li[@class='MuiListItem-root MuiListItem-padding css-1dft1f']//div[@class='MuiBox-root css-bto76g']")
	public WebElement gestion_projet_btn;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='+Ajouter Projet']")
	public WebElement ajouter_projet_btn; 
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Titre De Projet']")
	public WebElement titre_projet;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement collab_input;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='MuiChip-label MuiChip-labelMedium css-9iedg7'])[1]")
	public WebElement collab_ajout_input;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement responsable_input; 
	
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description']")
	public WebElement description_input;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Ajouter']")
	public WebElement ajouter_btn;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Titre de projet...']")
	public WebElement search_input;
	
	@FindBy(how = How.XPATH, using = "(//tbody)[1]")
	public WebElement table_projet;

	public AjouterUnProjetPage() {
		PageFactory.initElements(Setup.getDriver(),this);
		this.wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
	}
	
	/**Methode**/
	public void clickOnGestionDeProjet() {
		wait.until(ExpectedConditions.elementToBeClickable(gestion_projet_btn)).click();
	}
	public void clickOnAjouterProjet() {
		wait.until(ExpectedConditions.elementToBeClickable(ajouter_projet_btn)).click();		
	}	
	public void fillTitre(String title) {
		titre_projet.sendKeys(title);
	}
	public void fillCollab(String collab) {
		collab_ajout_input.click();
		collab_input.sendKeys(collab);
		collab_input.sendKeys(Keys.ARROW_DOWN);
		collab_input.sendKeys(Keys.ENTER);
		
	}
	
	public void fillResponsable(String resp) {
		responsable_input.click();
		responsable_input.sendKeys(resp);
		responsable_input.sendKeys(Keys.ARROW_DOWN);
		responsable_input.sendKeys(Keys.ENTER);
	}
	
	public void fillDescription(String desc) {
		description_input.sendKeys(desc);
	}
	public void clickOnAjouterButton() {
		ajouter_btn.click();
	}
	public void fillTitleSearch(String title) {
		search_input.sendKeys(title);
	}

	public String getTableText() {
		return wait.until(ExpectedConditions.visibilityOf(table_projet)).getText();
	}
}
