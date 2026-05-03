package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationInvalidePage;

import io.cucumber.java.en.Then;

public class AuthentificationInvalideStepDefinition {
	
	private AuthentificationInvalidePage authentificationInvalidePage  ;
	public AuthentificationInvalideStepDefinition () {
		this.authentificationInvalidePage = new AuthentificationInvalidePage();
	}

	@Then("un message s affiche {string}")
	public void unMessageSAffiche(String text) {
		Assert.assertEquals(authentificationInvalidePage.getAlertText(),text);
	}

}
