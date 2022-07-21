# language: es

Característica: Ordenar producto exitosamente desde SauceDemo
  Como usuario de la plataforma
  Quiero agregar un producto al carrito
  Para proceder a realizar la orden

  Esquema del escenario: Ordenar producto exitosamente
    Dado '<juan>' ingresa a la pagian de SauceDemo
    Cuando ingresa usuario 'standard_user' y clave 'secret_sauce'
    Y agrega un producto al carrito de compras
    Y procede a realizar la orden del producto
    |<nombre>|<apellido>|<codigo>|
    Entonces ve en pantalla el mensaje 'THANK YOU FOR YOUR ORDER'

    Ejemplos:
      |nombre|apellido|codigo|
      |Juan  |Perez   |533444|
