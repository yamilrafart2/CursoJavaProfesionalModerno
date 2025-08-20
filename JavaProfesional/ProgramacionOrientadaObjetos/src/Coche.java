// CLASE
public class Coche {

    // ATRIBUTOS
    private String marca;
    private int anio;

    // METODO
    void arrancar() {
        System.out.println("El coche arranca.");
    }

    public static void main(String[] args) {
        // OBJETO --> CREAR PRIMERO, ASIGNAR DESPUES
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.anio = 2023;
        miCoche.arrancar(); // "El coche arranca."

        // OBJETO --> CREAR CON TODO LISTO
        Coche otroCoche = new Coche("ciToyota", 2022);
    }

    // CONSTRUCTOR
    public Coche(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }
    public Coche() {

    }

    // GETTERS
    public String getMarca() {
        return marca;
    }
    public int getAnio() {
        return anio;
    }

    // SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}