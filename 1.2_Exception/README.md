nivel 1:

Este proyecto gestiona ventas en Java con control de excepciones:

1. **Producte**: Clase con atributos `nom` (nombre) y `preu` (precio).
2. **Venda**: Clase con una colección de productos y el atributo `preuTotal` (precio total). Incluye el método `calcularTotal()`, que:
   - Lanza la excepción personalizada `VendaBuidaException` si no hay productos, mostrando: *"Per fer una venda primer has d’afegir productes"*.
   - Calcula el precio total si hay productos.

3. **VendaBuidaException**: Excepción personalizada con el mensaje mencionado, accesible mediante `getMessage()`.

También se incluye un ejemplo de manejo de la excepción estándar `IndexOutOfBoundsException`.

nivel 2:

Este proyecto implementa la clase Entrada en Java para gestionar datos introducidos por teclado con manejo de excepciones. La clase incluye métodos estáticos para leer diferentes tipos de datos utilizando un objeto Scanner:

Manejo de InputMismatchException:
llegirByte(String missatge)
llegirInt(String missatge)
llegirFloat(String missatge)
llegirDouble(String missatge)
Cada método muestra un mensaje personalizado y sigue solicitando la entrada hasta que sea válida.
Excepción personalizada:
llegirChar(String missatge)
llegirString(String missatge)
llegirSiNo(String missatge): Retorna true si el usuario introduce "s", o false si introduce "n".
El programa garantiza que cualquier entrada incorrecta será tratada, mostrando mensajes claros como "Error de format".
