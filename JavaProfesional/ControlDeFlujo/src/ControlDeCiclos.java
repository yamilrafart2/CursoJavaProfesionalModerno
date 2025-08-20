public class ControlDeCiclos {

    public static void main(String[] args) {

        /*
        BREAK
            Esta palabra le indica al programa que debe salir del buvle en el que se encuentra.
        */
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }
        /*
        SALIDA
            0
            1
            2
            3
            4
        */

        /*
        CONTINUE
            Esta palabra le indica al programa que debe saltar la iteración actual del bucle y continuar con la soguiente iteración.
        */
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            System.out.println(i); // se satea el 2
        }
        /*
        SALIDA
            0
            1
            3
            4
         */

    }

}
