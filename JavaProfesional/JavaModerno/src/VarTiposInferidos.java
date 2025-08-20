import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarTiposInferidos {

    /*
    La inferencia de tipos en Java es la capacidad del compilador de determinar automáticamente
    el tipo de una variable, expresión o metodo sin que el programador lo especifique explícitamente.
    En versiones recientes de Java, se ha introducido la palabra clave var.
     */

    public static void main(String[] args) {

        // ANTES
        Map<String, List<Integer>> mapaComplejo = new HashMap<>();
        // CON var
        var mapaComplejoNew = new HashMap<String, List<Integer>>();

        // CLÁSICO
        int numero = 10;
        // MODERNO
        var numeroNew = 10;

        // Solo se puede usar cuando se inicializa la variable
        var nombre = "Tatiana"; // String
        var lista = new ArrayList<String>(); // ArrayList<String>
        // No puede ser null
        // var edad; // NO COMPILA
        /*
        var NO ES DINÁMICO
         */

    }

}
