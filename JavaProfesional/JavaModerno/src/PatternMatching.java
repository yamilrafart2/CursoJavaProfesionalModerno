public class PatternMatching {

    /*
    Simplifica y mejora la legibilidad del código al realizar verificaciones de tipos y
    extracción de valores de manera más concisa y expresiva.

    Permite verificar si un objeto es de un tipo específico y, si lo es,
    extrae componentes de ese objeto directamente en una variable.
    */

    /*
    INSTANCEOF
        Podemos combinar instanceof con declaración de variable en una sola línea:
            if (obj instanceof String s) {
                System.out.println(s.length());
            }
            // System.out.println(s); NO COMPILA

        *   Elimina el cast manual
        *   Declara e inicializa la variable "s" directamente
        *   El compilador se asegura del tipo automáticamente

    ¿QUÉ HACE INTERNAMENTE?
        *   Verifica que el objeto sea un String
        *   Declara una nueva variable "s" del tipo String
        *   Le asigna automáticamente el valor de obj
        *   El alcance de "s" está dentro del if
    */

    public static void main(String[] args) {

        // ANTES
        Object obj = "a";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }

        // AHORA
        if (obj instanceof String s) {
            System.out.println(s.length()); // 's' ya casteada
        }

    }

}
