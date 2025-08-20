import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {

        /*
        FOR
            USO: Cuando sabes de antemano cuántas veces se repetirá el código

            for (inicialización; condición; actualización){
                // Código a repetir
            }
        */
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + i);
        }
        /*
        SALIDA:
            Iteración 1
            Iteración 2
            Iteración 3
            Iteración 4
            Iteración 5
         */

        /*
        WHILE
            USO: Cuando no conoces cuántas veces se repetirá el código, pero sabes la condición de parada.

            while (condición) {
                // Código a repetir
            }
        */
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        /*
        SALIDA:
            Contador: 1
            Contador: 2
            Contador: 3
            Contador: 4
            Contador: 5
        */

        /*
        DO - WHILE
            USO: Similar al WHILE, pero garantiza al menos una ejecución (la condición se evalúa al final)

            do {
                // Código a repetir
            } while (condición);
        */
        int numero;
        do {
            System.out.println("Ingrese un número positivo: ");
            numero = new Scanner(System.in).nextInt();
        }while (numero <= 0);


    }

}
