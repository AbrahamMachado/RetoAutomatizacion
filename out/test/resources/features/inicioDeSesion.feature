# language: es

Característica: Inicio de sesion en la pagina SauceDemo
  Como usuario de la plataforma
  Quiero autententicarme
  Para realizar una compra

  Escenario: Inicio de sesion exitoso
    Dado '<juan>' ingresa a la pagian de SauceDemo
    Cuando ingresa usuario '<standard_user>' y clave '<secret_sauce>'
    Entonces observa el titulo de '<Products>'