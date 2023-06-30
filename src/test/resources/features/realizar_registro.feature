# language: es

Característica: realizar registro de usuario
  Yo como usuario
  Quiero poder registrarme como nuevo usuario
  Para posteriormente acceder a mi cuenta y usar los servicios

  @manual
  @manual-result:passed
  Escenario: registro exitoso
    Cuando realizo el formulario para registro de usuario
    Entonces deberia ver un mensaje de registro exitoso