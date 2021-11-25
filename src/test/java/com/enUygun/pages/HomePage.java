package com.enUygun.pages;

import com.enUygun.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class HomePage {

    public HomePage() {PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//input[@id='OriginInput']")
    public WebElement neredenTextBox;
    @FindBy(css = "#react-autowhatever-1-section-0-item-0")
    public WebElement istAirports;

    @FindBy(css = "#DestinationInput")
    public WebElement nereyeTextBox;
    @FindBy(css = "#react-autowhatever-1-section-0-item-0")
    public WebElement esbAirport;


    @FindBy(xpath = "//div[@class='SingleDatePicker SingleDatePicker_1']")
    public WebElement departureDayPicker;
    @FindBy(xpath = "//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_2'][2]")
    public WebElement nextMonthArrow;
    @FindBy(xpath = "//td[@aria-label='Salı, 14 Aralık 2021']/div")
    public WebElement departureDay;

    @FindBy(css = "#oneWayCheckbox")
    public WebElement onlyWayCheckBox;

    @FindBy(xpath = "//td[@aria-label='Pazartesi, 10 Ocak 2022']/div")
    public WebElement returnDay;

    @FindBy(xpath = "//button[@class='primary-btn block']")
    public WebElement ucuzBiletBulButton;

    @FindBy(xpath = "//div[@data-flight-id='TK7240:W:2021-12-14 06:45:00:15X1']")
    public WebElement departureFlight;
    @FindBy(xpath = "//div[@data-flight-id='TK7259:W:2022-01-10 19:40:00:15X1']")
    public WebElement returnFlight;

    @FindBy(css = "#contact_email")
    public WebElement mailTextBox;

    @FindBy(css = "#contact_cellphone")
    public WebElement phoneNumberTextBox;

    @FindBy(css = "#firstName_0")
    public WebElement firstNameTextBox;

    @FindBy(css = "#lastName_0")
    public WebElement lastNameTextBox;

    @FindBy(css = "#birthDateDay_0")
    public WebElement birthDateDayDropDown;
    @FindBy(xpath = "//select[@id='birthDateDay_0']/option[@value='08']")
    public WebElement birthDateDay;
    @FindBy(css = "#birthDateMonth_0")
    public WebElement birthDateMonthDropDown;
    @FindBy(xpath = "//select[@id='birthDateMonth_0']/option[@value='09']")
    public WebElement birthDateMonth;
    @FindBy(css = "#birthDateYear_0")
    public WebElement birthDateYearDropDown;
    @FindBy(xpath = "//select[@id='birthDateYear_0']/option[@value='1998']")
    public WebElement birthDateYear;

    @FindBy(xpath = "//label[@for='gender_M_0']")
    public WebElement genderMaleCheckBox;

    @FindBy(xpath = "//input[@data-content='Lütfen yolcuya ait TC Kimlik Numarasını girin.']")
    public WebElement publicIdTextBox;

    @FindBy(css = "#healthCode_0")
    public WebElement healthCodeTextBox;

    @FindBy(xpath = "//div[@data-class='proceedCheckout']/button")
    public WebElement odemeyeIlerleButton;

    @FindBy(xpath = "//input[@id='contact_cellphone']")
    public WebElement actualPhoneNumber;

    @FindBy(xpath = "//input[@name='contactEmail']")
    public WebElement actualEmail;

    @FindBy(xpath = "//input[@id='firstName_1']")
    public WebElement actualName;

    @FindBy(xpath = "//input[@id='lastName_1']")
    public WebElement actualLastName;

    @FindBy(xpath = "//input[@id='publicId_1']")
    public WebElement actualPublicId;

    @FindBy(xpath = "//input[@id='gender_M_1'][@checked='checked']")
    public WebElement actualGender;

    @FindBy(xpath = "//div[@class='departure mb-2']/div[2]/span[2]")
    public WebElement actualDepatureDay;
    @FindBy(xpath = "//div[@id='flightItemreturn']/div[1]/div[2]/div[1]/div[2]/span[2]")
    public WebElement actualReturnDay;











}
