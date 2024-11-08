# Uso de Docker en el CICD
## Desarrollo
1. Para el desarrollo local se puede ambientar para tener características similares a ambiente productivo y evitar el "en mi máquina sí funciona".
2. Se pueden ejecutar varias aplicaciones aisladas a la vez.

### Desafíos
1. Puede surgir curva de aprendizaje.

### Propuesta de solución
1. Considerar que al inicio puede llevar tiempo pero que se va a invertir para obtener los beneficios.

## Integración Continua (CI)
1. Podemos garantizar que trabajamos con la última versión del código siempre, ya que las imágenes se crean al momento.

### Desafíos
1. El tiempo de construcción incrementa.
2. El Dockerfile puede que no esté optimizado.

### Propuesta de solución
1. Seguir las buenas prácticas para la optimización.

## Pruebas
2. Para las pruebas se puede garantizar que el ambiente está en cero y eso da consistencia.
3. Al versionar las imágenes podemos hacer rollback en caso de errores.
4. Las imágenes pueden ser compartidas, lo que permite que permite que todos trabajen con las mismas condiciones.
5. Permite la escalabilidad.

### Desafíos
1. Mantener y gestionar diferentes versiones de imágenes puede ser complicado, especialmente si no se lleva un control estricto de etiquetas y versiones.
2. Asegurar que las imágenes almacenadas no contengan vulnerabilidades o configuraciones sensibles.

### Propuesta de solución
1. Tener controles de las versiones.
2. Utilizar las dependencias e imágenes actualizadas.

## Despliegue Continuo (CD):
1. Dado que solo necesitas Docker, las imágenes se pueden compartir fácilmente.
2. Docker sumado a Kubernetes se puede utilizar para escalar.
3. El mantenimiento es más sencillo y menos riesgoso al tener todo aislado.

### Desafíos
1. Las aplicaciones con estado (como bases de datos) son más difíciles de gestionar en un entorno de contenedores.
2. Desplegar varios contenedores y asegurarse de que funcionen correctamente en conjunción puede ser complicado.

### Propuesta de solución
1. Usar herramientas de orquestación como Kubernetes que faciliten el despliegue y la gestión de múltiples contenedores.
2. Considerar utilizar volúmenes Docker o servicios externos de bases de datos que permitan separar los datos del ciclo de vida del contenedor.

# Pros y Contras de Docker
## Pros
1. Consistencia
2. Prtabilidad
3. Eficiencia de recursos
4. Escalabilidad

## Contras
1. Curva de aprendizaje
2. Persistencia de datos
3. 