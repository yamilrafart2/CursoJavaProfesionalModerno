public abstract class VehiculoAbstraccion {

    /*
    ¿QUÉ ES LA ABSTRACCIÓN?
        Es el proceso de ocultar los detalles complejos y mostrar solo lo esencial.
        En Java, esto se hace con una clase ABSTRACT, que no se puede instanciar directamente.
    */

    public abstract void encender(); // metodo abstracto

    public void mostrarTipo() {
        System.out.println("Soy un vehículo.");
    }

    /*
    ABSTRACT CLASS --> No se puede crear un Vehiculo directamente

    ABSTRACT VOID ENCENDER() --> No tiene cuerpo, solo define que todos los vehículos deberán implementar su propia forma de encenderse.

    MOSTRARTIPO() --> Es un metodo normal, y puede tener implementación.
    */

}
