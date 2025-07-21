Feature: Inicio de sesión exitoso

  @exitoso @login
  Scenario: Login exitoso
    Given el usuario navega al login desde el menú
    When el usuario ingresa credenciales válidas
    Then el usuario es redirigido a la pantalla principal
