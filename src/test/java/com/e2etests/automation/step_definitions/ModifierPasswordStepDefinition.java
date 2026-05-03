package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.ModifierPasswordPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifierPasswordStepDefinition {

	private ModifierPasswordPage modifierPasswordPage;
	public ModifierPasswordStepDefinition () {
		this.modifierPasswordPage = new ModifierPasswordPage();
	}

	@When("cliquer sur l icone utilisateur")
	public void cliquerSurLIconeUtilisateur() {
		modifierPasswordPage.clichOnUserBtn();
	}
	@When("cliquer sur le bouton Parametres")
	public void cliquerSurLeBoutonParametres() {
		modifierPasswordPage.clickOnParametreBtn();
	}
	@When("cliquer sur le bouton Mot De Passe")
	public void cliquerSurLeBoutonMotDePasse() {
		modifierPasswordPage.clickOnPasswordBtn();
	}
	@When("saisir le Mot de passe actuel {string}")
	public void saisirLeMotDePasseActuel(String psw) {
		modifierPasswordPage.fillPasswordActuel(psw);
	}
	@When("saisir Nouveau Mot de passe {string}")
	public void saisirNouveauMotDePasse(String new_pwd) {
		modifierPasswordPage.fillNewPassword(new_pwd);
	}
	@When("saisir Confirmer votre mot de passe {string}")
	public void saisirConfirmerVotreMotDePasse(String new_pwd) {
		modifierPasswordPage.confirmNewPassword(new_pwd);
	}
	@When("cliquer sur le boutton changer le mot de passe")
	public void cliquerSurLeBouttonChangerLeMotDePasse() {
		modifierPasswordPage.clickOnChangerMotDePasse();
	}
	@Then("un popup s affiche {string}")
	public void unPopupSAffiche(String msg) {
		Assert.assertEquals(modifierPasswordPage.getAlertText() ,msg);
	}

}
