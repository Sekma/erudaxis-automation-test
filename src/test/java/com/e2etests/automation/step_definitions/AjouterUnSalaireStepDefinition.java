package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AjouterUnSalairePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjouterUnSalaireStepDefinition {

	private AjouterUnSalairePage ajouterUnSalairePage;
	public AjouterUnSalaireStepDefinition () {
		this.ajouterUnSalairePage = new AjouterUnSalairePage();
	}

	@When("cliquer sur administration")
	public void cliquerSurAdministration() {
		ajouterUnSalairePage.clickOnAdministration();
	}
	@When("cliquer sur finances")
	public void cliquerSurFinances() {
		ajouterUnSalairePage.clickOnFinances();
	}
	@When("cliquer sur charges")
	public void cliquerSurCharges() {
		ajouterUnSalairePage.clickOnCharges();
	}
	@When("cliquer sur salaires")
	public void cliquerSurSalaires() {
		ajouterUnSalairePage.clickOnSalaires();
	}
	@When("cliquer sur le bouton ajouter un salaire")
	public void cliquerSurLeBoutonAjouterUnSalaire() {
		ajouterUnSalairePage.clickOnAjouterUnSalaire();
	}
	@When("selectionner le nom et prenom {string}")
	public void selectionnerLeNomEtPrenom(String name) {
		ajouterUnSalairePage.fillName(name);
	}
	@When("selectionner le status {string}")
	public void selectionnerLeStatus(String status) {
		ajouterUnSalairePage.fillStatut(status);
	}
	@When("saisir la date d embauche {string}")
	public void saisirLaDateDEmbauche(String date) {
		ajouterUnSalairePage.fillDateDembauche(date);
	}
	@When("saisir le salaire brute {string}")
	public void saisirLeSalaireBrute(String salaire) {
		ajouterUnSalairePage.fillSalaireBrute(salaire);
	}
	@When("saisir le frais d une journee d absence {string}")
	public void saisirLeFraisDUneJourneeDAbsence(String frais) {
		ajouterUnSalairePage.fillFraisJourneeDabsence(frais);
	}
	@When("cliquer sur le bouton ajouter")
	public void cliquerSurLeBoutonAjouter() {
		ajouterUnSalairePage.clickOnAjouterBtn();
	}
	@When("cliquer sur le bouton ok")
	public void cliquerSurLeBoutonOk() {
		ajouterUnSalairePage.clickOnOkSucces();
	}
	@Then("{string} est dans la liste")
	public void estDansLaListe(String name) {
		Assert.assertTrue(ajouterUnSalairePage.getTableText().contains(name));
	}



}
