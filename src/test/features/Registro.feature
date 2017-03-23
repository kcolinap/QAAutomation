Feature: Registro de usuarios


  #Este escenario permite probar la funcionalidad de registro de usuarios

  Scenario Outline: Probar el regsistro a la pagina gamedb2
    Given Navigate to game db2
    When Click on sign up
    And Write "<Name>","<Email>" y "<Pass>"
    Examples:
      |Name|Email|Pass|Condicion|
      |usr1|user@|1234|Invalid email|
      |    |user@gmail.com|1234|user missing|
      |usr2|user@gmail.com|   |pass missing|
      |usr3|user@gmail.com|1234|sucessfully|
    And Click on register
    Then Valido "<Condicion>"