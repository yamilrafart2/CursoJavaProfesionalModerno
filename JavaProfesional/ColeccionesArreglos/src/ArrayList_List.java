import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_List {

    /*
    List
        Es una interfaz de Java Collection Framework.
        Representa una colección ordenada de elementos.
        También llamada (secuencia).

    ArrayList
        Es una implementación de List.
        Se basa en un arreglo dinámico que puede crecer o reducirse según sea necesario.
    */

    /*
    ¿CUÁNDO USAMOS CADA UNA?
        List es el contrato (qué puede hacer una lista).
        ArrayList es la herramienta concreta.

        Declarar con List y crear con ArrayList es la mejor práctica.
    */

    /*
    List (interfaz): Se usa en la declaración para escribir código más flexible y desacoplado.
    */
    //List<String> nombres = new ArrayList<>();
    // Esto permite más adelante cambiar a una LinkedList o a un Vector o a un Stack:
    //List<String> nombres = new LinkedList<>();
    // El código que lo usa no necesita saber qué tipo específico es, solo que se comporta como una lista

    /*
    ArrayList (implementación)
        *   Tiene tamaño dinámico (crece o se reduce)
        *   Admite solo objetos (usa wrappers como Integer)
        *   Iteración rápida
        *   Posee métodos útiles como add(), remove(), contains(), get(index), size(), etc.
        *   Es más lento en cuanto a rendimiento (pero más flexible)
    */
    // Forma de declarar un ArrayList
    List<String> nombres = new ArrayList<>(); // Recomendado (uso de interfaz)
    ArrayList<Integer> numeros = new ArrayList<>(); // También válido

}
