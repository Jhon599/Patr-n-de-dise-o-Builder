# Patron builder

Builder es un patrón de diseño creacional con ámbitos de objeto. Nos ayuda a crear objetos complejos de una forma sencilla usando un procedimiento de "paso por paso". Esto facilita el trabajo enormemente cuando tenemos objetos con muchos atributos, pero no necesitamos establecer de inicio todos sus valores, o no siempre establecemos los mismos. De esta forma nos guía en la construcción de estos obejtos. También ayuda en el ensamblado de objetos complejos que están formados por otros objetos.

El patrón Builder permite la construcción de objetos de dos formas que, aunque a primera vista podrían parecer diferentes, ambas siguen la esencia del patrón.

Con la primera estrategia buscamos delegar la construcción de objetos complejos a dos elementos externos, el Builder y el Director, para que no nos preocupemos de los detalles de la construcción de este. Esto sirve cuando ese objeto complejo debe estar ensamblado con un cuidado y precisión milimétrica (sí, suena exagerado pero muchas veces esto es un requisito para el correcto funcionamiento del sistema). El objeto Director hace uso del Builder para ensamblar el objeto y entregárnoslo listo para su uso.

Con la segunda estrategia no hay un Director y el Builder actúa también como un objeto externo para la construcción, pero en este caso nos ayuda guiándonos (mostrándonos o limitando las opciones que tenemos) sobre cómo construir de forma correcta el objeto. Esta segunda estrategia sirve cuando el objeto que queremos construir tiene muchas opciones o posibilidades correctas para su construcción; en otras palabras, la inicialización de este es flexible en cuanto a los parámetros que necesitamos para su construcción.

# Objetivo o intención del patrón

Como podemos ver, el objetivo de este patrón es: Separar la construcción de un objeto complejo de su representación, de forma tal que con el mismo proceso se puedan crear diferentes representaciones. Antes de ver los detalles en código, un poco de teoría de cómo implementar el patrón. Algunos de estos pasos serán opcionales dependiendo de la estrategia de implementación.

1.  Definir un tipo de objeto complejo de crear. Este será el tipo del objeto que obtendremos como resultado del uso del Builder. Puede ser un tipo abstracto o concreto.
2.  Si el tipo es abstracto, crear una representación concreta.
3.  Definir un tipo Builder. Este tendrá los pasos para la construcción del objeto concreto. Dependiendo de la implementación puede ser abstracto o concreto.
4.  Si el Builder es abstracto, definir un tipo concreto.
5.  Definir una clase que sirva como Director y que controle los pasos para la creación del objeto. Dependiendo de la estrategia, el Builder puede funcionar también como el Director.

# Implementación

Utilizaremos una de las diferentes estrategias de creación, la cual he denominado estrategia B.

Prácticamente la única diferencia que existe en esta estrategia es que el Builder es una clase anidada dentro de la clase Producto. Esta estrategia ayuda mucho si siempre tendremos una sola forma de crear el Producto (lo cual es, a mi parecer, lo normal).

Con esta estrategia también podemos usar la variación en la que el constructor de Usuario recibe al UsuarioBuilder, pero con las clases anidadas podemos tomarnos algunas libertades en cuanto al uso de los modificadores de acceso. El constructor de UsuarioBuilder puede ser público. Sería algo como:

## Diagrama

![PatronBuilder](https://github.com/Jhon599/Patr-n-de-dise-o-Builder/assets/143898470/31d20300-3b3e-4312-8d07-679e05aced31)

## Codigo ejemplo

![image](https://github.com/Jhon599/Patr-n-de-dise-o-Builder/assets/143898470/adee48f8-090b-41b7-b117-0ca2548fe1b0)






