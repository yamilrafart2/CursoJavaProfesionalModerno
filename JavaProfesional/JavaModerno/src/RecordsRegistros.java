public class RecordsRegistros {

    /*
    ¿QUÉ ES UN REGISTRO?
        Un record es una estructura superior igual que las clases, los enumerados o las interfacer
        Pero nos permiten conseguir algo parecido a lo que podemos hacer con clases tradicionales
        Utilizando mucho menos código

        Equivale a una clase con:
            *   Campos private final
            *   Constructor
            *   Getters (sin get prefijo)
            *   equals(), hashCode(), toString()
            *   Los campos son final (no hay setters)

        public record NombreRecord(Tipo campo1, Tipo campo2) {
            // Opcional: métodos adicionales
        }
    */

    /*
    LIMITACIONES
        *   No se pueden agregar setters (es inmutable)
        *   Los campos no pueden ser modificados después de la creación
        *   No se hereda de otros records (son final implícitamente)

    ¿POR QUÉ USARLOS?
        *   Menos código: Ideal para DTOs, modelos simples.
        *   Seguro: Inmutable por diseño.
        *   Legible: Sintaxis clara y concisa.
    */

    public record Cuenta(String nombre, String clave, boolean privilegiada) {}

    public static void main(String[] args) {

        // CREACIÓN
        Cuenta admin = new Cuenta("admin", "root", true);

        // ACCESO A CAMPOS (GETTERS)
        System.out.println(admin.nombre()); // "admin"

        //METODOS AUTOGENERADOS
        System.out.println(admin.toString()); // "Cuenta[nombre=admin, clave=root, privilegiada=true]

    }

}
