Feature: Purchase products at opencart

  @happyPath
  Scenario Outline: Proceso de compra
    # Agregar 2 productos al carrito de compra y visualizar el carrito
    Given User estoy en la pagina opencart
    When selecciono un producto del catalogo
    Then ingreso al producto
    Then agrego el producto al carrito
    And veo el carrito

    # Completo el formulario de compra y finalizo la compra
    When ingreso datos <name> <country> <city> <credit_card> <month> <year>
    Then veo nuevo formulario

    Examples:
      | name  | country    | city  | credit_card | month | year   |
      | Smoke | Ecuador    | Quito | 123456789   | 02    | 2024   |
