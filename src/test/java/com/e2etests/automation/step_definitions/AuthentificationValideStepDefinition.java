package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationValidePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationValideStepDefinition {

	private AuthentificationValidePage authentificationValidePage;
	public AuthentificationValideStepDefinition(){
		this.authentificationValidePage = new AuthentificationValidePage();
	}

	@Given("je me connecte sur l application erudaxis")
	public void jeMeConnecteSurLApplicationErudaxis() {
	    authentificationValidePage.goToUrl();
	}
	@When("je saisi un email {string}")
	public void jeSaisiUnEmail(String email) {
	    authentificationValidePage.fillEmail(email);
	}
	@When("je saisi un mot de passe {string}")
	public void jeSaisiUnMotDePasse(String password) {
	    authentificationValidePage.fillPassword(password);
	}
	@When("je clique sur se connecter")
	public void jeCliqueSurSeConnecter() {
	    authentificationValidePage.clickOnSumbitBtn();
	}
	@When("je clique sur la catégorie lycee")
	public void jeCliqueSurLaCatégorieLycee() {
	    authentificationValidePage.clickOnLyceeCategory();
	}
	@Then("la page d acceuil de la categorie {string} s affiche")
	public void laPageDAcceuilDeLaCategorieSAffiche(String categoryTitle) {
		Assert.assertEquals(authentificationValidePage.getCategoryText(), categoryTitle);
	}

}
