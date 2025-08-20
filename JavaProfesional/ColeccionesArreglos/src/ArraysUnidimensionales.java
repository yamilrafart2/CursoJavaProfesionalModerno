public class ArraysUnidimensionales {

    public static void main(String[] args) {

        // DECLARACIÓN E INICIALIZACIÓN
        int[] numeros1;

        int[] numeros2 = new int[5];

        int[] numeros3 = {1, 2, 3, 4, 5};

        // ACCESO A LOS ELEMENTOS
        numeros2[0] = 10;

        /*
        CARACTERÍSTICAS
            *   Tamaño fijo (no se puede cambiar después de la creación)
            *   Acceso por índice (comienza en 0)
            *   Propiedad length para obtener el tamaño
            *   Tipo de dato NO primitivo
        */
        int[] numeros = {10, 20, 30}; // Forma simplificada
        String[] palabras = new String[3]; // Forma con tamaño definido
        palabras[0] = "Hola";
        System.out.println(numeros[1]); // 20

        // EJEMPLO
        int[] edades = new int[3];
        edades[0] = 25;
        edades[2] = 30;
        edades[3] = 22;

        // Recorrido tradicional
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + i + ": " + edades[i]);
        }
        /*
        SALIDA:
            Edad 0: 25
            Edad 1: 30
            Edad 2: 22
         */

    }

}
