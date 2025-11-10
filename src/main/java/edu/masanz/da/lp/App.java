package edu.masanz.da.lp;

import java.util.Scanner;

/**
 * Clase principal para ejecutar la aplicación de gestión de ligas de paddle.
 * Utiliza la clase GestorLigas para gestionar las ligas y la clase Gui para la interacción con el usuario.
 */
public class App {

    private GestorLigas gestorLigas;

    /**
     * Constructor de la clase App.
     */
    public App() {
        // TODO 11: instancia el GestorLigas e inicializa las ligas utilizando la clase Init
        gestorLigas = new GestorLigas();
        Init.crearLigas(gestorLigas);

    }

    /**
     * Método principal para ejecutar la aplicación.
     */
    public void run() {
        // TODO 12: en un bucle muestra el menú, lee la opción y ejecuta la opción hasta que se elija salir.
        while (true){
            Gui.mostrarMenu();
            String texto = "";
            int num = Gui.leerNumero(texto);
            ejecutarOpcion(num);
        }

    }

    /**
     * Ejecuta la opción seleccionada del menú.
     * @param numOpc Número de opción seleccionada.
     */
    private void ejecutarOpcion(int numOpc) {
        // TODO 13: implementa la ejecución de las opciones del menú utilizando un switch.
        // Llama a los métodos correspondientes para cada opción.
        switch (numOpc){
            case 1:
                listarEquiposLigas();
                break;
            case 2:
                mostrarTablaResultadosLiga();
                break;
            case 3:
                listarCampeonesLigas();
                break;
            case 4:
                anotarMarcadoresLiga();
                break;
            case 0:
                salir();
                System.exit(0);
        }

    }

    /**
     * Lista los equipos de las ligas disponibles.
     */
    private void listarEquiposLigas() {
        // TODO 14: muestra la lista de ligas, lee el número de liga y muestra la lista de equipos de la liga seleccionada.
        Gui.mostrarTexto("Ligas Disponibles");
        Gui.mostrarTexto(gestorLigas.getListaLigas());
        int numliga = Gui.leerNumero("Numero liga: ");
        Gui.mostrarTexto("Equipos de la liga");
        Gui.mostrarTexto(gestorLigas.getListaEquipos(numliga));
    }

    /**
     * Lista los campeones de las ligas.
     */
    private void listarCampeonesLigas() {
        // TODO 15: muestra el listado de campeones de todas las ligas.
        Gui.mostrarTexto(gestorLigas.getListadoCampeonesLigas());
    }

    /**
     * Muestra la tabla de resultados de una liga seleccionada.
     */
    private void mostrarTablaResultadosLiga() {
        // TODO 16: muestra la lista de ligas, lee el número de liga y muestra la tabla de resultados de la liga seleccionada.
        Gui.mostrarTexto("Elige una liga");
        Gui.mostrarTexto(gestorLigas.getListaLigas());
        int numliga = Gui.leerNumero("Numero liga: ");
        mostrarTablaResultadosLiga(numliga);
    }

    /**
     * Muestra la tabla de resultados de una liga específica.
     * @param numLiga Número de la liga.
     */
    private void mostrarTablaResultadosLiga(int numLiga) {
        // TODO 17: muestra la tabla de resultados de la liga indicada.
        Gui.mostrarTexto(gestorLigas.getTablaResultadosLiga(numLiga));
    }

    /**
     * Anota los marcadores de los partidos de una liga seleccionada.
     */
    private void anotarMarcadoresLiga() {
        // TODO 18: Para anotar los marcadores de los partidos de una liga seleccionada,
        // muestra la lista de ligas, lee el número de liga, muestra la lista de equipos,
        // permite al usuario seleccionar dos equipos y anotar los marcadores de sus partidos.
        // Muestra la tabla de resultados antes y después de anotar los marcadores.
        // Permite repetir el proceso hasta que el usuario decida salir.
        Gui.mostrarTexto(gestorLigas.getListaLigas());
        int numLiga = Gui.leerNumero("Elige una liga");
        Gui.mostrarTexto("Equipos de la liga");
        Gui.mostrarTexto(gestorLigas.getListaEquipos(numLiga));
        boolean continuar = true;
        while (continuar) {
            mostrarTablaResultadosLiga(numLiga);
            Gui.mostrarTexto("Selecciona el número de los dos equipos del partido:");
            int equipo1 = Gui.leerNumero("Número equipo fila    (1-4): ");
            int equipo2 = Gui.leerNumero("Número equipo columna (1-4): ");
            for (int k = 1; k <= 3; k++) {
                int v1 = Gui.leerNumero(String.format("\tMarcador %d equipo %-4s: ", k, gestorLigas.getEquipo(numLiga, equipo1)));
                int v2 = Gui.leerNumero(String.format("\tMarcador %d equipo %-4s: ", k, gestorLigas.getEquipo(numLiga, equipo2)));
                gestorLigas.setMarcadorPartido(numLiga, equipo1, equipo2, k, v1, v2);
            }
            mostrarTablaResultadosLiga(numLiga);
            continuar = Gui.confirmar("Desea modificar otro marcador (s/n): ", "s");
        }

    }

    /**
     * Muestra un mensaje de salida: "Saliendo...".
     */
    private void salir() {
        Gui.mostrarTexto("Saliendo...");
    }

    /**
     * Muestra un mensaje de opción no válida: "Opción no válida".
     */
    private void opcionNoValida() {
        Gui.mostrarTexto("Opción no válida");
    }


}
