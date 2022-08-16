#languaje: en

Feature: Seleccionar productos desde categoria y barra de busqueda

  Background:
    Given Que el usuario se encuentre en la pagina web

  Scenario: Un nuevo usuario busca dos productos uno desde categoria y otro por la barra de busqueda
    When El usuario busca un producto por categoria y subcategoria y lo agrega
    And El usuario busca un producto por la barra de busqueda
    Then El usuario visualizara los productos en el carrito de compras