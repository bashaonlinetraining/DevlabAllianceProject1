package com.skyscanner.stepDefinitions;

import com.skyscanner.dataDrivers.readPropertiesfile;
import com.skyscanner.pages.FlightsResultsPage;
import com.skyscanner.pages.HeaderPage;
import com.skyscanner.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookflight {

	@Given("User lauch the url")
	public void user_lauch_the_url() throws Exception {
		BaseTest.lauchBrowser("Chrome", readPropertiesfile.readData("url"));
	}

	@When("User click flight tab")
	public void user_click_flight_tab() throws Exception {
		HeaderPage hp = new HeaderPage(BaseTest.getDriver());
		hp.clickTabLink("Flights");
	}

	@When("User enter from and city names")
	public void user_enter_from_and_city_names() throws Exception {
		HomePage hp = new HomePage(BaseTest.getDriver());
		hp.selectFromAndToInputs("Mumbai", "Delhi");
	}

	@When("User clicks searh button")
	public void user_clicks_searh_button() {
		HomePage hp = new HomePage(BaseTest.getDriver());
		hp.clickSearch();
	}

	@Then("user should see the flight result page and select flight filter")
	public void user_should_see_the_flight_result_page_and_select_flight_filter() throws Exception {
		FlightsResultsPage frp = new FlightsResultsPage(BaseTest.getDriver());
		frp.selectFlightName("Vistara");
	}

	@When("User enter from value {string} and to city {string}")
	public void user_enter_from_value_and_to_city(String fromCity, String toCity) throws Exception {
		HomePage hp = new HomePage(BaseTest.getDriver());
		hp.selectFromAndToInputs(fromCity, toCity);
	}

	@Then("user should see the flight result page and select flight filter {string}")
	public void user_should_see_the_flight_result_page_and_select_flight_filter(String flightName) throws Exception {
		FlightsResultsPage frp = new FlightsResultsPage(BaseTest.getDriver());
		frp.selectFlightName(flightName);
	}

}
