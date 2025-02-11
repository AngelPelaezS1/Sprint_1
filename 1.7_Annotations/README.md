Ejercicio 1: Jerarquía de clases

Se implementó una jerarquía de clases para calcular el salario de diferentes tipos de trabajadores:

Clases:
Worker: Clase base que incluye los atributos name, lastName, y priceHour. Contiene el método calculateSalary, que calcula el salario multiplicando las horas trabajadas por el precio por hora.
OnlineWorker: Sobrescribe el método calculateSalary y añade una tarifa fija de internet (internetRate).
OnsiteWorker: Sobrescribe el método calculateSalary y añade un coste fijo de desplazamientos (benzina).
Pruebas:
En el main, se crean instancias de las clases y se llama al método calculateSalary para demostrar el uso de la anotación @Override y el cálculo específico de cada clase.

Ejercicio 2: Métodos obsoletos

Se añadieron métodos marcados como obsoletos (@Deprecated) en las clases hijas.

Detalles:
Métodos obsoletos: Representan lógicas antiguas de cálculo (oldCalculateSalary).
Gestión de advertencias: En el main, se invocaron estos métodos y se utilizaron @SuppressWarnings("deprecation") para suprimir las advertencias del compilador.
Pruebas:
En el main, se compararon los resultados de los métodos obsoletos y los métodos actuales, mostrando las diferencias entre las lógicas antigua y nueva.
