import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {

        // 1. Creación de la lista y agregar elementos
        List<String> tareas = new ArrayList<>();
        tareas.add("Estudiar");
        tareas.add("Practicar");
        tareas.add("Descansar");
        System.out.println(tareas);

        // 2. Acceder a elementos y verificar existencia
        System.out.println("---------------");
        System.out.println("Primera tarea: " + tareas.get(0));
        System.out.println("Está 'Practicar'? " + tareas.contains("Practicar"));

        // 3. Insertar en posición específica
        System.out.println("---------------");
        tareas.add(1, "Repasar");
        System.out.println(tareas);

        // 4. Eliminar elemento y mostrar cambios
        System.out.println("---------------");
        tareas.remove("Practicar");
        System.out.println(tareas);
        System.out.println("Cantidad de tareas: " + tareas.size());

        /*
        SALIDA:
        [Estudiar, Practicar, Descansar]
        ---------------
        Primera tarea: Estudiar
        Está 'Practicar'? true
        ---------------
        [Estudiar, Repasar, Practicar, Descansar]
        ---------------
        [Estudiar, Repasar, Descansar]
        Cantidad de tareas: 3
        */

    }

}
