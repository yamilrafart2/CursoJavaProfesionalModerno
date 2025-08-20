package RutaJavaModerno; // VS Code lo puso automáticamente

/*
    PascalCase - CadaPalabraVaConMayuscula -> Nombre de archivos y nombre de clases

    javac NombreArchivo.java --> Compilar
    java NombreArchivo --> Ejecutar
*/

public class Intro {
    
    // Método Principal
    public static void main(String[] args) {
        
        System.out.println("¡Hoal!"); // Impresión

        // Primitiva - SOLO GUARDAR valor
        int miEntero; // Declarando la variable
        miEntero = 400; // Asignando un valor
        double pi = 3.141592; // Declarando la variable y asignandole un valor
        boolean bool = true; // true o false
        char unCaracter = 'a'; // Un caracter

        // Objeto -> Métodos que ayudan a manipular
        Integer myInteger = 5;
        Double myDouble = 5.99;
        Character myCharacter = 'A';
        String myString = "ABC";

        System.out.println(myString);

        // Cadenas - Strings
        String cadena = "Buenas tardes a todos mis compañeros";
        System.out.println("Cantidad de caracteres: " + cadena.length());

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String x = "Hola";
        String y = "hola";
        System.out.println(x.equals(y)); // Case Sensitive

        // CONDICIONALES
        double otroDouble = 400.00;
        if (miEntero == otroDouble) { // == != > >= < <=
            System.out.println("Números iguales");
        } else {
            System.out.println("Números distintos");
        }

        int edadInfante = 4;
        if(edadInfante < 2) {
            System.out.println("El infante es un bebe");
        } else if(edadInfante <= 4) {
            System.out.println("El infante es un toddler");
        } else {
            System.out.println("El infante es un niño");
        }

        boolean llueve = true;
        int temperatura = 20;
        if (temperatura >= 18 && !llueve) {
            System.out.println("Es un gran día para in paseo en el parque");
        }

        int edad = 16;
        boolean permisoPadres = true;
        if (edad > 18 || permisoPadres) { // O una u otra condicional se cumple
            System.out.println("Puedes obtener tu licencia de conducir");
        }

        System.out.println("------------------");

        // BUCLES
        for (int i = 0; i < 7; i++) {
            System.out.println(i + ": alo?");
        }

        System.out.println("------------------");

        int inicio = 0;
        int fin = 10;
        while (inicio < fin) {
            System.out.println(inicio + ": hola?");
            inicio++;
            fin -= 2;
        }

        System.out.println("------------------");

        int num1 = 10;
        int num2 = 9;
        do {
            System.out.println("Entro?");
        } while (num1 < num2);

        System.out.println("------------------");

        // ARRAY o ARREGLOS
        int[] miArreglo; // Declaración
        miArreglo = new int[5]; // Inicialización
        miArreglo[0] = 4;
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        int[] miArreglo2 = {4, 8, 8, 5, 9};
        System.out.println(miArreglo[3]);
        System.out.println(miArreglo2[4]);

        /*
            En un Array, una vez establecido el tmaño NO puede ser alterado.
            En caso de requerir algo más dinámico usar ArrayList.
        */

        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("[" + i + "] = " + miArreglo[i]);
        }

        System.out.println(miArreglo[miArreglo.length - 1]);

        saludo();
        saludo();
        saludo();

        saludo("Elena de Troya");

    }

    // FUNCIONES - MÉTODOS
    /*
        Modificadores: permisos de la función y si es estática.
            public --> Es una función que se puede usar en otros archivos.
            private --> Es una función que solo se puede usar en su clase.
            protected --> Se usan cuando tenemos una herencia. Dentro de mi misma clase y en mis subclases a las que le estoy heredando.
            static --> El método no pertenece a una instancia, sino que pretenece a la clase completa.
                       Es algo propio de la clase, no de un objeto en específico.
    */
    public static void saludo() {
        System.out.println("¡Hola mundo!");
    }

    // SOBRECARGA
    public static void saludo(String nombre) {
        System.out.println("Hola " + nombre);
    }

}
