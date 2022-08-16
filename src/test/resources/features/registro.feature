#languaje: en

Feature: Registro usuario nuevo exitoso

  Scenario: Un nuevo usuario se registrara en la pagina web
    Given Que el usuario se encuentre en la pagina web
    When El usuario registra los datos solicitados para crear su cuenta
    Then El usuario visualizara la pagina de inicio