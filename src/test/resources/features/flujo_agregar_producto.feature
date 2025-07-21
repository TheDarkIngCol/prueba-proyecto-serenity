Feature: Flujo agregar al carrito un producto

  @carrito
  Scenario: Seleccionar producto
    When el usuario selecciona un producto
    Then el usuario se agregara en el carrito de compras
