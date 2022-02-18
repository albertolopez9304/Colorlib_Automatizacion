
    @stories
    Feature: A user wants to verify completion of the Block Validation screen
    @scenario1
    Scenario: Verify completion of the Block Validation screen
      Given that a user enters the colorlib page to verify the completion of the validation block
      |username|passwordColorlib|
      |demo    |demo            |
      When the user fills in the fields of the validation block form
      |requerid             |email                 |password        |date      |url                        |digits|range|
      |Es una prueba        |luialberto93@gmail.com|Choucair2022*   |01/01/1993|https://outlook.office.com/|12346 |    |
      Then verifies the success or failure of the response whit This field is required.

    @scenario2
    Scenario: Verify completion of block validation screen with all fields filled in
      Given that a user enters the colorlib page to verify the completion of the validation block
      |username|passwordColorlib|
      |demo    |demo    |
      When the user fills in the fields of the validation block form
      |requerid             |email                 |password        |date      |url                        |digits|range|
      |Es una prueba        |luialberto93@gmail.com|Choucair2022*   |01/01/1993|https://outlook.office.com/|12346 |8    |
      Then verifies the success or failure of the response by confirming that the required field is empty




