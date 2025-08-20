public class Operadores {

    public static void main(String[] args) {

        /*
        OPERADORES ARITMÉTICOS
            SUMA +
            RSTA -
            MULTIPLICACIÓN *
            DIVISIÓN /
            RESTO %
        */
        int suma = 5 + 3; // 8
        int resto = 10 % 3; // 1 (módulo)
        double division = 10.0 / 3; // 3.333...

        /*
        OPERADORES DE COMPARACIÓN
            IGUALDAD ==
            DESIGUALDAD !=
            MAYOR QUE >
            MENOR QUE <
            MAYOR O IGUAL QUE >=
            MENOR O IGUAL QUE <=
        */
        boolean esIgual = (5 == 5); // true
        boolean esMayor = (10 > 20); // false
        boolean esDiferente = (7 != 3); // true

        /*
        OPERADORES LÓGICOS
            AND &&
            OR ||
            NOT !
        */
        boolean andLogico = (true && false); // false
        boolean orLogico = (true || false); // true
        boolean notLogico = !true; // false

        /*
        OPERADORES DE ASIGNACIÓN
            =
            +=
            -=
            *=
            /=
        */
        int rta = 10; // Asignación básica
        rta += 5; // Equivale a x = x + 5 (x = 15)
        String nombre = "Ana"; // Asignación a Syting

        /*
        OPERADORES DE INCREMENTO/DECREMENTO
            ++
            --
        */
        int contador = 0;
        contador++; // Incrementa a 1 (post-incremento)
        int y = --contador; // Decremento a 0 (pre-incremento)

        /*
        OPERADOR TERNARIO
            ? :
        */
        int edad = 18;
        String mensaje = (edad >= 18) ? "Mayor" : "Menor"; // "Mayor"

    }

}
