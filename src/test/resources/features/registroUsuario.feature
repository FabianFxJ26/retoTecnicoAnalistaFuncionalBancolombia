#Autor: Elkin Fabian Alfonso Bermudez
@stories
Feature: Register the new user on the UTest.com webpage

  @scenario1
  Scenario Outline: Register the user on the UTest.com webpage
    Given A user wants to register on UTest.com webpage
    When The user enters the data to register on UTest.com webpage
      | firstName   | lastName   | email   | birthMonth   | birthDay   | birthYear   | city   | postalCode   | country   | computer   | version   | language   | mobileDevice   | model   | operatingSystem   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <birthMonth> | <birthDay> | <birthYear> | <city> | <postalCode> | <country> | <computer> | <version> | <language> | <mobileDevice> | <model> | <operatingSystem> | <password> | <confirmPassword> |
    Then Registration is complete when the Complete Setup button is pressed
      | exit   |
      | <exit> |
    Examples:
      | firstName | lastName | email               | birthMonth | birthDay | birthYear | city    | postalCode | country  | computer | version     | language | mobileDevice | model   | operatingSystem | password     | confirmPassword | exit           |
      | Fabian    | Alfonso  | test12345@gmail.com | January    | 30       | 1994      | Calarcá | 632001     | Colombia | Linux    | Debian 10.5 | English  | Samsung      | Omnia 2 | Android 1.5     | Testing2023* | Testing2023*    | Complete Setup |
