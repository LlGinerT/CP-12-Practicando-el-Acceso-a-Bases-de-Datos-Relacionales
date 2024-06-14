**Importar la Base de Datos**:
   - Abre la consola de MySQL.
   - Navega al directorio donde se encuentra el archivo `empresa.sql`.
   - Ejecuta el siguiente comando para importar el archivo `empresa.sql`:
     ```
     mysql -u root -p < empresa.sql
     ```
   - Ingresa la contraseña del usuario `root` cuando si la solicita.

##  Configurar el Archivo `.env`

 **Agregar las Variables de Entorno**:
   - Añade las siguientes líneas al archivo `.env` y reemplace `Usuario` y `Pass` con las credenciales de su usuario de MySQL:
     ```
     DB_URL=jdbc:mysql://localhost:3306/empresa
     DB_USER=Usuario
     DB_PASSWORD=pass
     ```

## Enunciado del ejercicio

Imagina que estás desarrollando una aplicación para una empresa que necesita gestionar la información de sus empleados. La empresa ha decidido utilizar una base de datos relacional para almacenar la información.

Se te ha pedido que implementes una pequeña aplicación en Java que permita realizar las siguientes operaciones:

1. Establecer una conexión con la base de datos usando JDBC.

2. Agregar nuevos empleados a la base de datos.

3. Actualizar la información de empleados existentes.

4. Realizar consultas SQL para obtener información específica de los empleados.


