Hola :) FEMSA

Lab2. Conclusiones SOLID:

1. Se generan las clases de servicio para separar funcionalidades y cumplir con el SRP.
2. Se genera una clase base de órdenes para que se puedan crear nuevos tipos de órdenes sin tener que modificar los if's para cumplir con el OCP.
3. Con la misma clase base es posible crear una lista de órdenes de diferentes tipos y ejecutar su procesamiento para cumplir el LSP.
4. Se creó una interfaz para aquellas órdenes que se puedan priorizar y así las órdenes estándar no requieran una priorización, esto para el principio ISP.
5. Se crearon inyecciones de dependencias de los servicios para que el procesador dependendiera de abstracciones de así cumplir el DIP.


Lab3. Conclusiones TEST:
1. Se separan las pruebas por escenario de prueba.
2. Se actualizan nombres de cada prueba para hacer legible el objetivo.
3. Se consideran las excepciones en una prueba específica.

Lab4. Seguridad:
1. Utilizar librerías actualizadas.
2. Apoyarse de herramientas de terceros para escaneos de SAST/DAST.
3. Para el uso de JWT se debe considerar si es adecuado dejar en el mismo servicio o separar la generación y validación del token. No se debe de dejar información sensible en el token.
4. HTTPS cifra los datos en tránsito entre el cliente y el servidor, esto ayuda a prevenir ataques de tipo "man-in-the-middle" (MITM)
