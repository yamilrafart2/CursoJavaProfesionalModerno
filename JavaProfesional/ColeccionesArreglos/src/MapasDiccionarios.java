import java.util.HashMap;
import java.util.Map;

public class MapasDiccionarios {

    /*
    MAPAS Y DICCIONARIOS BÁSICOS (HashMap)
        Los mapas (o diccionarios) son estructuras de datos que almacenan par clave-valor, donde cada clave es única.

    HashMap
        Es una estructura de datos que implementa la interfaz Map.
        Permite almacenar pares de clave-valor, donde cada clave es única y se mapea a un valor específico
        Al igual que List, implementa:
            *   TreeMap
            *   LinkedHashMap
            *   ConcurrentHashMap
    */

    /*
    CARACTERÍSTICAS CLAVES
        1.  Par clave-valor:
                Almacena datos como pares donde cada clave única está asociada a un valor específico.
        2.  Rendimiento eficiente:
                Proporciona un rendimiento en tiempo constante para las operaciones de búsqueda, inserción y eliminación de elementos.
        3.  No garantiza el orden de los elementos:
                La ordenación de los elementos no está garantizada, lo que significa que el orden en que se insertan puede ser diferente al orden en que se recogen.
        4.  Permite claves y valores nulos:
                Puede contener una clave nula y múltiples valores nulos.
        5.  No es sincronizado:
                Lo que significa que no es thread-safe (seguro para hilos) se refiere a código o estructuras de datos que pueden ser usados por múltiples hilos (threads) simultáneamente sin causar inconsistencias, errores o corrupción de datos.
    */

    public static void main(String[] args) {

        // Ejemplo básico
        HashMap<String, String> telefonos = new HashMap<>();
        telefonos.put("Mamá", "1122334455");
        telefonos.put("Tatiana", "1199887766");
        System.out.println(telefonos.get("Tatiana"));

        // ¿Cómo recorrerlos?
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Carlos", 30);
        edades.put("María", 28);
        // Metodo más eficiente (acceso a clave y valor)
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " años");
        }
        /*
        SALIDA:
            Ana: 25 años
            Carlos: 30 años
            María: 28 años
        */

        /*
         OPERACIONES COMUNES
            put(clave, valor) --> Añade o actualiza
                map.put("llave");
            get(clave) --> Obtiene valor
                map.get("llave");
            remove(clave) --> Elimina entrada
                map.remove("llave");
            containsKey(clave) --> Verifica existencia
                map.containsKey("llave")
            KeySet() --> Devuelve todos los valores
                map.keySet();
            entrySet() --> Devuelve pares clave-valor
                map.entrySet();
        */


    }

}
