public class ArraysMultidimensionales {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3]; // Matriz 3x3
        String[][] nombreApellidos = {{"Ana", "Pérez"}, {"Juan", "Gómez"}};

        matriz[0][0] = 1; // Primera fila, primera columna
        matriz[1][2] = 5; // Segunda fila, tercera columna

        int[][] calificaciones = {
                {8, 9, 7},
                {6, 10, 9}
        };
        /*
        Representa una tabla de notas:
            Fila 0: [8, 9, 7]
            Fila 1: [6, 10, 9]
        */

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("clasificaciones[" + i + "][" + j + "] = " + calificaciones[i][j]);
            }
        }
        /*
        SALIDA:
            clasificaciones[0][0] = 8;
            clasificaciones[0][1] = 9;
            clasificaciones[0][2] = 7;
            clasificaciones[1][0] = 6;
            clasificaciones[1][1] = 10;
            clasificaciones[1][2] = 9;
        */

    }

}
