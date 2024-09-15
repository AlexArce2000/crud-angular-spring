# crud-angular-spring
## Descripción

Aplicación web que implementa las operaciones básicas de un CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Angular para el frontend y Spring Boot para el backend. Este proyecto demuestra la integración entre un cliente Angular y un servidor Spring Boot para manejar datos de manera efectiva.

## Características

- **Frontend**: Angular
- **Backend**: Spring Boot
- **Base de Datos**: Postgres
- **Operaciones CRUD**: Crear, Leer, Actualizar, Eliminar

## Requisitos

- **Node.js**: 20
- **Angular CLI**: 18
- **Java**: 17
- **Maven**: 3.9
- **Spring Boot**: 3.3.2

## Instalación y Configuración

### Frontend (Angular)

1. Clona el repositorio:

    ```
    https://github.com/AlexArce2000/crud-angular-spring.git
    ```

2. Navega al directorio del frontend:

    ```
    cd crud-angular-spring/frontend-crud
    ```

3. Instala las dependencias de Angular:

    ```
    npm install
    ```

4. Inicia el servidor de desarrollo:

    ```
    ng serve --o
    ```

   El frontend estará disponible en `http://localhost:4200`.

### Backend (Spring Boot)

1. Navega al directorio del backend:

    ```bash
    cd crud-angular-spring/backend-crud
    ```

2. Configura la base de datos en el archivo `application.properties`.

3. Compila e inicia la aplicación:

    ```
    ./mvnw "spring-boot:run"
    ```
   El backend estará disponible en `http://localhost:8080`.

   El swagger disponible en `http://localhost:8080/swagger-ui/index.html`


## Uso

1. **Frontend**: Abre tu navegador y dirígete a `http://localhost:4200` para interactuar con la interfaz de usuario.
2. **Backend**: Puedes usar herramientas como Postman para probar los endpoints del backend en `http://localhost:8080/book` o mediante el swagger.
