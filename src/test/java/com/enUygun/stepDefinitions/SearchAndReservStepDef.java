package com.enUygun.stepDefinitions;

import com.enUygun.pages.HomePage;
import com.enUygun.utilities.BrowserUtils;
import com.enUygun.utilities.ConfigurationReader;
import com.enUygun.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;

import java.util.Locale;

public class SearchAndReservStepDef {

    @Given("user is already on base page")
    public void user_is_already_on_base_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user enter {string} in Nereden text box and choose to airport")
    public void user_enter_in_Nereden_text_box_and_choose_to_airport(String nereden) {
        HomePage homePage=new HomePage();
        homePage.neredenTextBox.sendKeys(nereden);
        homePage.istAirports.click();

    }

    @When("user enter {string} in Nereye text box and chooses to airport")
    public void user_enter_in_Nereye_text_box_and_chooses_to_airport(String nereye) {
        HomePage homePage=new HomePage();
        homePage.nereyeTextBox.sendKeys(nereye);
        homePage.esbAirport.click();

    }

    @When("user chooses departure date")
    public void user_chooses_departure_date() {
        HomePage homePage=new HomePage();
        homePage.departureDayPicker.click();
        homePage.nextMonthArrow.click();
        homePage.departureDay.click();

    }

    @When("user click oneway check box")
    public void user_click_oneway_check_box() {
        HomePage homePage=new HomePage();
        homePage.onlyWayCheckBox.click();
    }

    @When("user chooses return date")
    public void user_chooses_return_date() {
        HomePage homePage=new HomePage();
        homePage.returnDay.click();
    }

    @When("user click Ucuz bilet bul button")
    public void user_click_Ucuz_bilet_bul_button() {
        new HomePage().ucuzBiletBulButton.click();
    }

    @When("user chooses one of departure flight and click Seç button")
    public void user_chooses_one_of_departure_flight_and_click_Seç_button() {
       new HomePage().departureFlight.click();
    }

    @When("user chooses one of return flight and click Seç button")
    public void user_chooses_one_of_return_flight_and_click_Seç_button() {
        new HomePage().returnFlight.click();
    }

    @When("user enter {string} in E-posta adresiniz text box")
    public void user_enter_in_E_posta_adresiniz_text_box(String mail) {
        HomePage homePage = new HomePage();
        homePage.mailTextBox.sendKeys(mail);
    }

    @When("user enter {string} in Cep Telefonunuz text box")
    public void user_enter_in_Cep_Telefonunuz_text_box(String phoneNumber) {
       new HomePage().phoneNumberTextBox.sendKeys(phoneNumber);
    }

    @When("user enter his\\/her name {string} name text box")
    public void user_enter_his_her_name_name_text_box(String name) {
        new HomePage().firstNameTextBox.sendKeys(name);
    }

    @When("user enter his\\/her surname {string} in surname text box")
    public void user_enter_his_her_surname_in_surname_text_box(String surname) {
        new HomePage().lastNameTextBox.sendKeys(surname);
    }

    @When("user enter his\\/her birth day date")
    public void user_enter_his_her_birth_day_date() {
        HomePage homePage=new HomePage();
        homePage.birthDateDayDropDown.click();
        homePage.birthDateDay.click();
        homePage.birthDateMonthDropDown.click();
        homePage.birthDateMonth.click();
        homePage.birthDateYearDropDown.click();
        homePage.birthDateYear.click();

    }

    @When("user enter {string} in TC Kimlik No text box")
    public void user_enter_in_TC_Kimlik_No_text_box(String publicId) {
        new HomePage().publicIdTextBox.sendKeys(publicId);
    }

    @When("user chooses male gender")
    public void user_chooses_male_gender() throws ElementClickInterceptedException {
        HomePage homePage=new HomePage();


        homePage.genderMaleCheckBox.click();
    }

    @When("user enter {string} in HES Kodu text box")
    public void user_enter_in_HES_Kodu_text_box(String healthCode) throws InterruptedException {
        HomePage homePage=new HomePage();
        homePage.healthCodeTextBox.click();
       homePage.healthCodeTextBox.sendKeys(healthCode);
        Thread.sleep(5000);
    }

    @When("user click odemeye ilerle button")
    public void user_click_odemeye_ilerle_button() {
        new HomePage().odemeyeIlerleButton.click();
    }



    @Then("user should be able to made reservation to a flight")
    public void user_should_be_able_to_made_reservation_to_a_flight() {
        HomePage homePage=new HomePage();

        String expectedPhoneNumber= "5428366650";
        String expectedEmail="Emre.can.kuleli.1998@gmail.com";
        String expectedName="Emre";
        String expectedLastname="Kazar";
        String expectedPublicId="18325910324";
        String expectedGender="Male";
        String expectedDepatureDay="14 Ara 2021, Salı";
        String expectedReturnDay="10 Oca 2022, Pazartesi";

        Assert.assertTrue(expectedPhoneNumber.contains(homePage.actualPhoneNumber.getText()));
        Assert.assertTrue(expectedEmail.toLowerCase(Locale.ROOT).contains(homePage.actualEmail.getText().toLowerCase(Locale.ROOT)));
        Assert.assertTrue(expectedName.toLowerCase(Locale.ROOT).contains(homePage.actualName.getText().toLowerCase(Locale.ROOT)));
        Assert.assertTrue(expectedLastname.toLowerCase(Locale.ROOT).contains(homePage.actualLastName.getText().toLowerCase(Locale.ROOT)));
        Assert.assertTrue(expectedPublicId.contains(homePage.actualPublicId.getText()));
        Assert.assertTrue((expectedGender.toLowerCase(Locale.ROOT).contains(homePage.actualGender.getText().toLowerCase(Locale.ROOT))));
        Assert.assertTrue((expectedDepatureDay.contains(homePage.actualDepatureDay.getText())));
        Assert.assertTrue(expectedReturnDay.contains(homePage.actualReturnDay.getText()));



    }


}
