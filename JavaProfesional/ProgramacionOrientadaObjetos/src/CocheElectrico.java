public class CocheElectrico extends CocheAbtraccion implements Electrico{

    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería del coche eléctrico...");
    }
}
