@wip

Feature: Search and reserve functionalities

  Scenario: User can search and make reservation for flight ticket
    Given user is already on base page
    When  user enter "istanbul" in Nereden text box and choose to airport
    And user enter "ankara" in Nereye text box and chooses to airport
    And user chooses departure date
    And user click oneway check box
    And user chooses return date
    And user click Ucuz bilet bul button
    And user chooses one of departure flight and click Seç button
    And user chooses one of return flight and click Seç button
    And user enter "Emre.can.kuleli.1998@gmail.com" in E-posta adresiniz text box
    And user enter "428366650" in Cep Telefonunuz text box
    And user enter his/her name "Emre" name text box
    And user enter his/her surname "Kazar" in surname text box
    And user enter his/her birth day date
    And user enter "18325910324" in TC Kimlik No text box
    And user chooses male gender
    And user enter "N3L2716513" in HES Kodu text box
    And user click odemeye ilerle button
    Then user should be able to made reservation to a flight
