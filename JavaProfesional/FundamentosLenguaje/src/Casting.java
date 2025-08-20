public class Casting {

    public static void main(String[] args) {
        /*
        CASTING ENTRE TIPOS NUMÉRICOS PRIMITICOS
        */

        // IMPLÍCITO
        int x = 10;
        double y = x; // ok

        // EXPLÍCITO
        double z = 10.5;
        int n = (int) z; // n = 10

        /*
        CASTING ENTRE CLASES
            UPCASTING (AUTOMÁTICO)
            DOWNCASTING (EXPLÍCITO)
        */

        /*
        CONVERSIÓN
            ENTRE STRING Y TIPOS NUMÉRICOS
        */
        String edadTexto = "25";
        int edad = Integer.parseInt(edadTexto);

        int numero = 123;
        String texto = String.valueOf(numero);
        System.out.println(texto); // "123"
    }

}
