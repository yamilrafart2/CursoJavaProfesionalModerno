public class ParametrosRetornoDeValores {

    // Definición (prámetros)
    public static void saludarPersona(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // Definición (retorno)
    public static int sumar(int a, int b){
        return a + b;
    }

    // Definición (sin retorno)
    public static void saludar(){
        System.out.println("Hola desde un método");
    }

    // UN METODO void PUEDE USAR return, PERO SOLO PARA TERMINAR SU EJECUCIÓN
    public void validarEdad(int edad) {
        if (edad < 0){
            System.out.println("Edad inválida");
            return; // Sale del metodo sin hacer lo demas
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {

     // Llamda (argumento)
     saludarPersona("Tatiana");

     // Llamada (argumrntos + retorno)
     int resultado = sumar(5, 3); // resultado = 8

    // Llamada (sin retorno)
    saludar();

    }

}
