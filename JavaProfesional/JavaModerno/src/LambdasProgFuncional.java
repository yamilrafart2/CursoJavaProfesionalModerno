import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdasProgFuncional {

    /*
    LAMBDA
        Son funciones anónimas que se pueden pasar como argumentos o utilizarse como valores de retorno.

    PROGRAMACIÓN FUNCIONAL
        Se enfoca en la NO MUTABILIDAD, las funciones puras y el uso de funciones de orden superior.
    */

    /*
    API Stream
        Es una herramienta que permite trabajar con colecciones de datos (listas, arrays, etc.)
        Especialmente para realizar operaciones como filtrar, transformar o procesar elementos.
        *   Flujo de datos (Stream):
                Es una secuencia de elementos que se procesan en "pipeline" (una cadena de operaciones)
                que no almacena datos, solo los procesa.
        *   Ejecución diferida (Lazy):
                Las operaciones solo se ejecutan cuando es necesario.
        *   Podemos hacer operaciones como:
                *   Filtrar:
                        filter() --> ej. seleccionar números pares
                *   Transformar:
                        map() --> ej. convertir strings a mayúsculas
                *   Contar:
                        count() --> ej. saber cuántos elementos hay
                *   Recorrer:
                        forEach() --> ej. imprimir cada elemento
    */

    /*
    PROGRAMACIÓN FUNCIONAL
        Se enfoca en QUÉ VAS A RESOLVER Y NO EN CÓMO RESOLVERLO
    */


    public static void main(String[] args) {

        /*
        EXPRESIONES LAMBDA
        Son funciones anónimas, es decir, funciones sin nombre que pueden ser definidas en línea.
        */
        Function<String, Integer> longitud = s -> s.length();
        /*
            TIPO:   Function<String, Integer>
                Recibe un String y devuelve un Integer.
            LAMBDA: s -> s.length()
                s: Parámetro (String)
                s.length(): Devuelve la longitud
            USO:
        */
        System.out.println(longitud.apply("Java")); // Output: 4

        /*
        API Stream
        */
        List<String> palabras = Arrays.asList("Java", "amigo", "Codigo", "API", "Luz", "Arco");

        palabras.stream()                                // 1. Convertir la lista a Stream
                .filter(p -> p.startsWith("A"))   // 2. Filtrar palabras que empiezan con "A"
                .map(String::toUpperCase)               // 3. Convertir a mayúsculas
                .forEach(System.out::println);          // 4. Imprimir resultados
        /*
        .stream(): Convierte la lista palabras en un Stream para procesarla.
        .filter(p -> p.startsWith("A")): Filtra las palabras que comienzan con la letra "A"
                                            (usa una lambda p -> ...)
        .map(String::toUpperCase): Transforma cada palabra a mayúsculas
                                      (con el metodo de reverencia String::toUpperCase)
        .forEach(System.out::println): Imprime cada resultado
                                        El operador :: se llama "method reference" (referencia a metodo)
                                        Es una forma abreviada de escribir una expresión lambda cuando esta solo llama a un metodo existente
        SALIDA:
            AMIGO
            API
            ARCO
        */
    }


}
