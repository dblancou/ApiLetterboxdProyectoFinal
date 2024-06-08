# 🎬 API para el Letterboxd bueno 🎬

## Índice

1. [Introducción](#introducción)
2. [Funcionalidades del Proyecto y Tecnologías Utilizadas](#funcionalidades-del-proyecto-y-tecnologías-utilizadas)
3. [Guía de Instalación](#guía-de-instalación)
4. [Guía de Uso](#guía-de-uso)
5. [Enlace a la Documentación](#enlace-a-la-documentación)
6. [Conclusión](#conclusión)
7. [Contribuciones, Agradecimientos, Referencias](#contribuciones-agradecimientos-referencias)
8. [Licencias](#licencias)
9. [Contacto](#contacto)

## Introducción

### Descripción del Proyecto

**CineReview** es una plataforma web diseñada para los amantes del cine. Permite a los usuarios escribir y leer reseñas de películas, crear listas personalizadas de películas, y seguir a otros usuarios para ver sus recomendaciones y críticas.

### Justificación

La necesidad de una plataforma centralizada donde los cinéfilos puedan compartir sus opiniones y descubrir nuevas películas nos llevó a desarrollar CineReview. La API subyacente proporciona un backend robusto y escalable para soportar estas funcionalidades.

### Objetivos

- Crear una plataforma donde los usuarios puedan interactuar y compartir sus opiniones sobre películas.
- Proveer una interfaz intuitiva y atractiva para los usuarios.
- Asegurar una arquitectura backend que sea robusta, segura y fácil de mantener.

### Motivación

Como apasionados del cine, quisimos crear una herramienta que no solo fuera útil para nosotros, sino para cualquier persona que comparta el mismo amor por el séptimo arte.

## Funcionalidades del Proyecto y Tecnologías Utilizadas

### Funcionalidades del Proyecto

- **Gestión de Películas**: Añadir, actualizar, eliminar y buscar películas.
- **Listas de Películas Personalizadas**: Crear y gestionar listas de películas.
- **Reseñas de Usuarios**: Escribir, actualizar, eliminar y leer reseñas de películas.
- **Autenticación y Autorización**: Registro e inicio de sesión de usuarios, protección de endpoints mediante JWT.
- **Interacciones Sociales**: Seguir y dejar de seguir a otros usuarios.

### Tecnologías Utilizadas

- **Backend**: 
  - Java 17
  - Spring Boot 3.2.2
  - Hibernate/JPA
  - MySQL
  - Maven
- **Seguridad**: 
  - Spring Security
  - JWT (JSON Web Tokens)
- **Frontend**: (Pendiente de desarrollo, centrado en el backend por ahora)
- **Herramientas de Desarrollo**: 
  - Lombok
  - Spring Boot DevTools

## Guía de Instalación

### Requisitos Previos

- JDK 17
- Maven
- MySQL

### Pasos de Instalación

1. **Clonar el repositorio**

   `bash`
   `git clone https://github.com/dblancou/ApiLetterboxdProyectoFinal.git`
   `cd ApiLetterboxdProyectoFinal`

2. Configurar la base de datos

   Crear una base de datos MySQL llamada `ApiProyectoFinal`.

   `CREATE DATABASE ApiProyectoFinal;`

3. Configurar las propiedades de la aplicación

   Edita el archivo application.properties con tus credenciales de MySQL.

4. Compilar y ejecutar la aplicación

## Guía de Uso

### Endpoints Principales

- **Películas**
  - Crear: `POST /api/films`
  - Obtener por ID: `GET /api/films/{id}`
  - Listar: `GET /api/films`
  - Actualizar: `PUT /api/films/{id}`
  - Eliminar: `DELETE /api/films/{id}`
- **Listas de Películas**
  - Crear: `POST /api/movieLists`
  - Obtener por ID: `GET /api/movieLists/{id}`
  - Listar: `GET /api/movieLists`
  - Actualizar: `PUT /api/movieLists/{id}`
  - Eliminar: `DELETE /api/movieLists/{id}`
- **Reseñas**
  - Crear: `POST /api/reviews`
  - Obtener por ID: `GET /api/reviews/{id}`
  - Listar: `GET /api/reviews`
  - Actualizar: `PUT /api/reviews/{id}`
  - Eliminar: `DELETE /api/reviews/{id}`
- **Usuarios**
  - Registro: `POST /auth/register`
  - Inicio de Sesión: `POST /auth/login`
  - Obtener por nombre de usuario: `GET /api/users/public/{username}`
  - Seguir usuario: `POST /api/users/{id}/follow`
  - Dejar de seguir usuario: `DELETE /api/users/{id}/unfollow`

## Enlace a la Documentación

Para más detalles sobre el uso de la API y sus endpoints, visita [la documentación completa](https://github.com/dblancou/ApiLetterboxdProyectoFinal/wiki).


## Conclusión

CineReview es una plataforma diseñada para facilitar la interacción entre los amantes del cine, permitiéndoles compartir y descubrir opiniones sobre películas. El proyecto está en constante desarrollo y estamos abiertos a contribuciones y sugerencias para mejorarlo.

## Contribuciones, Agradecimientos, Referencias

### Contribuciones

Agradecemos cualquier tipo de contribución, ya sea en forma de código, reporte de errores o sugerencias. Para contribuir, por favor, abre un issue o haz un pull request en el repositorio.

### Agradecimientos

Agradecemos a nuestros profesores y compañeros del ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM) por su apoyo y guía durante el desarrollo de este proyecto.

### Referencias

- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Documentación de Hibernate](https://hibernate.org/orm/documentation/5.4/)
- [Guía de MySQL](https://dev.mysql.com/doc/)

## Licencias

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE`.

## Contacto

Para cualquier consulta o sugerencia, puedes contactarnos a través de:

- **Nombre del Alumno**: Daniel Blanco Guerrero
- **Correo Electrónico**: danielblancow@gmail.com
- **GitHub**: [https://github.com/dblancou](https://github.com/dblancou)
