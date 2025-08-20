public class CocheHerencia extends Vehiculo {

    private int puertas;

    public CocheHerencia(String marca, int anio, int puertas) {
        super(marca, anio);
        this.puertas = puertas;
    }

    public CocheHerencia() {
        super();
    }

    public void mostrarCantidadDePuertas() {
        System.out.println("Puertas: " + puertas);
    }

    @Override
    public void mover() {
        System.out.println("El coche avanza por la carretera.");
    }
}
