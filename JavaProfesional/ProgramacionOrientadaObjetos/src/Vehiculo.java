import javax.swing.plaf.PanelUI;

public class Vehiculo {

    private String marca;
    private int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public Vehiculo() {

    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Anio: " + anio);
    }

    public void mover() {
        System.out.println("El vehículo se mueve.");
    }

}
