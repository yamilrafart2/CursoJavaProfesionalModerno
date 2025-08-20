public class Condicionales {

    public static void main(String[] args) {

        int edad = 27;
        int nota = 10;

        /*
        IF
         */
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }

        /*
        IF ELSE
        */
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad.");
        }

        /*
        ELSE IF
        */
        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
