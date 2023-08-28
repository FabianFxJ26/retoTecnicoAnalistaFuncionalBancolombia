#Autor: Elkin Fabian Alfonso Bermudez
 @stories
 Feature: Register the new user on the UTest.com webpage
   @scenario1
   Scenario: Register the user on the UTest.com webpage
     Given A user wants to register on UTest.com webpage
     When The user enters the data to register on UTest.com webpage
     | firstName | lastName | email                  | birthMonth | birthDay | birthYear | city    | postalCode | country | computer |version     | language | mobileDevice| model   | operatingSystem | password            | confirmPassword      |
     | Fabian    | Alfonso  | test@gmail.com         | January    | 30       | 1994      | Armenia | 632001     | Colombia| Linux    |Debian 10.5 | English  | Samsung     | Omnia 2 | Android 1.5     | Testing2023*        | Testing2023*         |
     Then Registration is complete when the Complete Setup button is pressed
     | exit           |
     | Complete Setup |