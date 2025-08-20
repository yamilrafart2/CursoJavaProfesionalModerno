public class Main {
    public static void main(String[] args) {

        // 1. Crear coche con constructor
        Coche miCoche = new Coche("Toyota",2023);

        // 2. Usar getters para leer datos
        System.out.println("Marca: " + miCoche.getMarca()); // Toyota
        System.out.println("Año: " + miCoche.getAnio()); // 2023

        // 3. Usar setters para cambiar datos
        miCoche.setMarca("Ford");
        miCoche.setAnio(2024);

        // 4. Usar getters para leer datos
        System.out.println("Marca: " + miCoche.getMarca()); // Ford
        System.out.println("Año: " + miCoche.getAnio()); // 2024

        // 5. Llamar metodo
        miCoche.arrancar();

        // HERENCIA
        CocheHerencia miCocheHerencia = new CocheHerencia("Toyota", 2020, 4);
        miCocheHerencia.mostrarInfo(); // metodo heredado
        miCocheHerencia.mostrarCantidadDePuertas(); // metodo propio
        /*
        SALIDA:
            Marca: Toyota, Año: 2020
            Puertas: 4
        */

        // POLIMORFISMO
        Vehiculo v1 = new CocheHerencia();
        Vehiculo v2 = new Motocicleta();

        v1.mover(); // "El coche avanza por la carretera."
        v2.mover(); // "La motocicleta acelera entre el tráfico."

        /*
         ABSTRACCIÓN
            Esto es ABSTRACCIÓN + POLIMORFISMO
            Cada vehículo tiene su forma de encender, aunque los llamamos a través del mismo tipo VehiculoAbstraccion
        */
        VehiculoAbstraccion v3 = new CocheAbtraccion();
        VehiculoAbstraccion v4 = new MotocicletaAbstraccion();

        v3.encender(); // "El coche se enciende con la llave."
        v4.encender(); // "La motocicleta se enciende con el botón."

        // INTERFACES
        CocheElectrico tesla = new CocheElectrico();
        tesla.encender();       // hereda de CocheAbstracción --> Vehiculo
        tesla.cargarBateria();  // metodo de la interfaz

    }
}