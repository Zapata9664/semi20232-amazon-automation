# language: es

Característica: recuperar contraseña
  Yo como usuario
  Quiero poder recuperar mi contraseña
  Para posteriormente poder acceder a mi cuenta

  @manual
  @manual-result:passed
  Escenario: recuperar contraseña
    Cuando doy clic en el enlace "¿Olvidaste tu contraseña?"
    Entonces debería ver las opciones para recuperarla, como:
    |- Ingresar mi dirección de correo electrónico|
    |- Responder preguntas de seguridad           |
    |- Enviar un código de verificación a mi número de teléfono|