Feature: Flujo completo

  @e2e
  Scenario: Realizar un flujo completo
    When el usuario realiza un flujo completo
    Then finaliza la compra del producto seleccionado
