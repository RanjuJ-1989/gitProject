package com.gitProject_StepDefinition;

import com.Pom.PomClass;
import com.testNG.gitProject.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass{

	PomClass pom = new PomClass();
	
	@When("User Clicks url {string}")
	public void user_clicks_url(String string) {
		launchUrl(string);
	}
	
	@And("User enter email address {string}")
	public void user_enter_email_address(String string) {
		input(pom.getLogin(), string);
	}
	
	@And("User enter Password {string}")
	public void user_enter_Password(String string) {
		input(pom.getPassword(), string);
	}
	
	@Then("User click login")
	public void user_click_login() {
		clickOnElement(pom.getClickLogin());
	}
}
