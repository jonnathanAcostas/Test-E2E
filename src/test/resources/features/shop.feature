Feature: Purchase products at opencart

  @happyPath
  Scenario Outline: Proceso de compra
    # Agregar 2 productos al carrito de compra y visualizar el carrito
    Given User estoy en la pagina opencart
    When selecciono un producto del catalogo
    Then agrego el producto al carrito
    And veo el carrito

    # Completo el formulario de compra y finalizo la compra
    When ingreso datos <first_name> <last_name> <email> <phone> <company> <address> <city> <post_code> <country> <region>
    Then veo nuevo formulario

    Examples:
      | first_name | last_name | email              | phone     | company | address | city  | post_code | country | region |
      | Smoke      | Acosta    | smokefcc@gmail.com | 979206315 | Casa    | Quito   | Quito | 4548      | Ecuador | sierra |
