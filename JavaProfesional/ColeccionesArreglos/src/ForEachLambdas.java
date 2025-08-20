import java.util.ArrayList;

public class ForEachLambdas {

    public static void main(String[] args) {

        /*
        FOR-EACH (ITERACIÓN SIMPLIFICADA)

        for (Tipo elemento : colección) {
            // Código a ejecutar con cada 'elemento'
        }
        */

        String[] frutas = {"Manzana", "Banana", "Naranja"};
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        /*
        SALIDA:
            Manzana
            Banana
            Naranja
        */

        // Creación del ArrayList (mutable)
        ArrayList<String> frutas1 = new ArrayList<>();
        frutas1.add("Manzana");
        frutas1.add("Banana");
        frutas1.add("Naranja");

        // Recorrido con for-each
        System.out.println("Frutas de la lista:");
        for (String fruta : frutas){
            System.out.println("- " + fruta);
        }
        /*
        SALIDA:
            Frutas de la lista:
            - Manzana
            - Banana
            - Naranja
        */

        /*
        LAMBDA SIMPLES

        (parámetros) -> { cuerpo }
        // o si es una sola línea:
        (parámetros) -> expresión
        */
        // 1. Crear el ArrayList de lenguajes
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        // 2. Recorrer con forEach + lambda (forma más simple)
        lenguajes.forEach(leng -> System.out.println(leng));
        /*
        SALIDA:
            Java
            Python
            JavaScript
        */

    }

}
