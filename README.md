**Importar la Base de Datos**:
   - Abre la consola de MySQL.
   - Navega al directorio donde se encuentra el archivo `empresa.sql`.
   - Ejecuta el siguiente comando para importar el archivo `empresa.sql`:
     ```bash
     mysql -u root -p < empresa.sql
     ```
   - Ingresa la contraseña del usuario `root` cuando si la solicita.

##  Configurar el Archivo `.env`

 **Agregar las Variables de Entorno**:
   - Añade las siguientes líneas al archivo `.env` y reemplace `Usuario` y `Pass` con las credenciales de su usuario de MySQL:
     ```plaintext
     DB_URL=jdbc:mysql://localhost:3306/empresa
     DB_USER=Usuario
     DB_PASSWORD=pass
     ```
