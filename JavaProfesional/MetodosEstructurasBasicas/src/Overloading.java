public class Overloading {

    /*
    OVERLOADING
        Es la sobre carga de metodos
        Se pueden declarar muchas veces el mismo metodo, simpre y cuendo tengan dif cant de parámetros
    */

    public class Calculadora {

        public static int sumar(int a, int b) {
            return a + b;
        }

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static int sumar(int a, int b, int c) {
            return a + b + c;
        }

        /*
        Overloading erroneo
        */
        //public static int restar(int a, int b) { return a - b; }
        //public static double restar(int a, int b) { return a - b; } // ERROR

    }

}
