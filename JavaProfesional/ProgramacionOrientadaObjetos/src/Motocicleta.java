public class Motocicleta extends Vehiculo{

    public Motocicleta(String marca, int anio) {
        super(marca, anio);
    }

    public Motocicleta() {

    }

    @Override
    public void mover() {
        System.out.println("La motocicleta acelera entre el tráfico.");
    }
}
