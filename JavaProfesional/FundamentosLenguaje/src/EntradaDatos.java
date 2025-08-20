import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tu nombre: ");
        String nombre = sc.nextLine();

        /*
        DIFERENTES LECTURAS
            nextLine() -> Línea completa
            next() -> Una sola palabra
            nextInt() -> Entero (int)
            nectDouble() -> Decimal (double)
        */
        //String nombre = sc.nextLine();
        String palabra = sc.next();
        int edad = sc.nextInt();
        double precio = sc.nextDouble();


        sc.close();
    }

}
