public class TiposDatos {
    public static void main(String[] args) {

        /*
          TIPOS DE DATOS PRIMITIVOS
               byte
               short
               int
               long
               float
               double
               char
               boolean
         */

        /*
          TIPOSD DE DATOS NO PRIMITIVOS
         */

        /*
          String (Cadena de texto)
            Es una clase, NO un tipo de dato.
            Inmutable: NO puede modificarse después de su cración
            Tiene métodos útiles como:
                length()
                substring()
               equals()
         */
        String nombre = "Java"; //Forma literal (recomendada)
        String lenguaje = new String("Python"); // Usando constructor
        System.out.println(nombre.length()); // 4

        /*
            Array (Arreglo)
                Tamaño fijo después de su creación
                Índice comienza en 0
         */
        int[] numeros = {10, 20, 30}; // Forma simplificada
        String[] palabras = new String[3]; // Forma con tamaño definido
        palabras[0] = "Hola";
        System.out.println(numeros[1]); // 20

        /*
            Clases Personalizadas
                Plantillas para crear objetos con atributos (variables) y métodos (funciones)
                Se instancian con new
         */
        //Definición de la clase
        /*public*/ class Persona {
            String nombre;
            int edad;

            public Persona(String nombre, int edad){
                this.nombre = nombre;
                this.edad = edad;
            }

            void saludar() {
                System.out.println("Hola, soy " + nombre);
            }
        }
        // Uso
        Persona persona1 = new Persona("Ana", 25);
        persona1.saludar(); // "Hola, soy Ana"

    }
}
