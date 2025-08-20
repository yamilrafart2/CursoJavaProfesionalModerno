public class OperadorTernario {

    public static void main(String[] args) {

        int edad = 27;

        /*
        OPERADOR TERNARIO
            ____ ? ____ : ____
            condición ? valorSiVerdadero : valorSiFalso;
        */
        String estado = (edad >= 18) ? "Adulto" : "Menor";
        System.out.println(estado); // "Adulto"
    }

}
