package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AjouterUnProjetPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjouterUnProjetStepDefinition {
	
	private AjouterUnProjetPage ajouterUnProjetPage;
	public AjouterUnProjetStepDefinition () {
		this.ajouterUnProjetPage = new AjouterUnProjetPage();
	}
	@When("cliquer sur gestion de projet")
	public void cliquerSurGestionDeProjet() {
		ajouterUnProjetPage.clickOnGestionDeProjet();
	}
	@When("cliquer sur le bouton ajouter un projet")
	public void cliquerSurLeBoutonAjouterUnProjet() {
		ajouterUnProjetPage.clickOnAjouterProjet();
	}
	@When("saisir le titre de projet {string}")
	public void saisirLeTitreDeProjet(String title) {
		ajouterUnProjetPage.fillTitre(title);
	}
	@When("selectionner collaborateurs {string}")
	public void selectionnerCollaborateurs(String collab) {
		ajouterUnProjetPage.fillCollab(collab);
	}
	@When("selectionner responsable {string}")
	public void selectionnerResponsable(String resp) {
		ajouterUnProjetPage.fillResponsable(resp);
	}
	@When("saisir le text dans description {string}")
	public void saisirLeTextDansDescription(String desc) {
		ajouterUnProjetPage.fillDescription(desc);
	}
	@When("cliquer sur le button ajouter")
	public void cliquerSurLeButtonAjouter() {
		ajouterUnProjetPage.clickOnAjouterButton();
	}
	@When("saisir le titre de projet {string} dans le champ de recherche")
	public void saisirLeTitreDeProjetDansLeChampDeRecherche(String title) {
		ajouterUnProjetPage.fillTitleSearch(title);
	}

	@Then("le projet {string} est dans la liste")
	public void leProjetEstDansLaListe(String string) {
	   
	}



}
