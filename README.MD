Hola :) FEMSA

Conclusiones SOLID:

1. Se generan las clases de servicio para separar funcionalidades y cumplir con el SRP.
2. Se genera una clase base de órdenes para que se puedan crear nuevos tipos de órdenes sin tener que modificar los if's para cumplir con el OCP.
3. Con la misma clase base es posible crear una lista de órdenes de diferentes tipos y ejecutar su procesamiento para cumplir el LSP.
4. Se creó una interfaz para aquellas órdenes que se puedan priorizar y así las órdenes estándar no requieran una priorización, esto para el principio ISP.
5. Se crearon inyecciones de dependencias de los servicios para que el procesador dependendiera de abstracciones de así cumplir el DIP.


Conclusiones TEST:
1. Se separan las pruebas por escenario de prueba.
2. Se actualizan nombres de cada prueba para hacer legible el objetivo.
3. Se consideran las excepciones en una prueba específica.