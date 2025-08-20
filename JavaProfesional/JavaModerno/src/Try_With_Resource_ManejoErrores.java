import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class Try_With_Resource_ManejoErrores {

    /*
    TRY-WITH-RESOURCE
        Es una declaración que facilita la gestión de recursos que deben cerrarse después de su uso
        (como archivos, conexiones a bd, sockets, etc.)
        También maneja errores.

        Evita:
            .close() manuales
            Bloques try-catch largos.

        Sintaxis:
        try (RecursoAutoCloseable recurso = new RecursoAutoCloseable()) {
            // Usar el recurso aquí (ej. leer un archivo)
        } // ¡Wl recurso se cierra AUTOMÁTICAMENTE al salir del bloque!
    */

    /*
    MANEJO MODERNO DE ERRORES
        *   Multi-catch: Captura múltiples excepciones en un mismo bloque.

        try {
            // Código que puede lanzar IOException o SQLException
        } catch (IOException | SQLException e) {
            System.out.println("Error genérico: " + e.getMessage());
        }
            *   IOException: Input/Output Exception (Excepción de Entrada/Salida)
                    Ocurre cuando hay un fallo al leer o escribir datos
            *   SQLException (Excepción de Base de DAtos relacional)
                    Ocurre cuando algo falla al interactuar con una BD

        *   Excepciones más específicas: Como NullPointerException con mensajes claros

        String texto = null;
        int longitud = texto.length(); // ¡NullPointerException!
    */

    public static void main(String[] args) {
        // try-with-resources (FileInputStream implementa AutoCloseable)
        try (FileInputStream archivo = new FileInputStream("ruta/archivo.txt")) {
            // Leer archivo...
            System.out.println("Archivo leído correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } // ¡FileInputStream se cierra solo aquí!
        /*
        Cierre automático: No se necesita llamar a .close()
        Menos código: Más legible que el try-catch-finally tradicional
        Seguro: Evita fugas de recursos (memory leaks)
        */


    }

}
