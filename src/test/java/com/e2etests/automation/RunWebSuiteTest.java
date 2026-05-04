package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
		
		//tags = ("@authentification"),
		//tags = ("@authentification_valide"),
		//tags = ("@authentification_mail_invalide"),
		//tags = ("@authentification_password_invalide"),
		
		//tags = ("@modifier_password"),
		//tags = ("@modifier_password_valide"),
		//tags = ("@modifier_password_invalide"),
		//tags = ("@modifier_password_verification"),
		
		tags = ("@ajouter_un_salaire"),
		
		//glue = {"com.e2etests.automation.step_definitions"},
		monochrome = true,
		snippets = CAMELCASE
		)


public class RunWebSuiteTest {
	
	

}
