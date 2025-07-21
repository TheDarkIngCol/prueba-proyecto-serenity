Feature: Manejo de errores de autenticación

  @fallido
  Scenario: Login fallido con usuario bloqueado
    Given el usuario navega al login desde el menú
    When el usuario ingresa credenciales con un usuario bloqueado
    Then debe aparecer un mensaje de error indicando que el usuario está bloqueado
