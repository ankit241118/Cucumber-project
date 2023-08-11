package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinations {

	@Given("^User is on landing page$")
	public void User_is_on_landing_page() {
		System.out.println("--User is on the landing page--");
		
	}
	@When("^User logins with valid usernamen and password$")
	public void User_logins_with_valid_usernamen_and_password$() {
		System.out.println("User logging in ");
		
	}
	@Then("^Dashboard page is displayed$")
	public void Dashboard_page_is_displayed() {
		System.out.println("Dashboard page displayed");
		System.out.println("--------------");
		System.out.println("");
	}
	@When("User logins with {string} and {string}")
	public void DoLogin1(String username,String password) {
		System.out.println("User logging in with username ---"+username+" and password-- "+password);
		
	}
	
	@When("^User logins with multiple username and password (.+) and (.+)$")
	public void DoLogin2(String username,String password) {
		System.out.println("User logging in with username ---"+username+" and password-- "+password);
	}
	
	@Given("^User has stable internet connection$")
	public void StartInternet() {
		System.out.println("");
		System.out.println("Internet Started");
	}
	
	@When("^Launch browser$")
	public void LaunchBrowser() {
		System.out.println("Browser is lauched");
	}
	
	@And("^Launch App URL$")
	public void LaunchApp() {
		System.out.println("App url searched");
	}
	
	@Then("^Landing page should be launched$")
	public void CheckLandingPage() {
		System.out.println("Landing page launched");
	}
	
	@Given("^App is open$")
	public void lauchapp() {
		System.out.println("App lauched---");
	}
	
	@Then("^Dashboard screen is displayed on app$")
	public void Dashboardapp() {
		System.out.println("Dashboard screen is displayed on app");
	}
}
