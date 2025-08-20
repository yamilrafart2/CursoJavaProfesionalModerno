public class ScopeDeVariablesVisibilidad {

    /*
    VARIABLES GLOBALES

    */

    /*
     VATRIABLES LOCALES
        Se declaran dentro de un metodo
        Solo se pueden usar dentro de ese metodo
    */
    public static void saludar() {
        String nombre = "Tatiana";
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {

        /*
        VARIABLES DE BLOQUE
            Tienen un alcance limitado solo al bloque donde se declaran
        */
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // ERROR: i ya no existe


    }

}
