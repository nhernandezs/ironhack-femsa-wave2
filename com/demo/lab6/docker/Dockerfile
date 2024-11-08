# Usa una imagen base de Java
FROM openjdk:11-jdk-slim

# Instala Git
RUN apt-get update && apt-get install -y git

# Establece el directorio de trabajo
WORKDIR /app

# Clona el repositorio de Git
RUN git clone https://github.com/nhernandezs/ironhack-femsa-wave2.git /app

# Copia el proyecto al contenedor
COPY . /app

# Construye la aplicación usando Maven
RUN ./mvnw clean package -DskipTests

# Expone el puerto en el que tu aplicación correrá
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "target/app.jar"]