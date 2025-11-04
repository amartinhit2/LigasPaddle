package edu.masanz.da.lp;

/**
 * Clase para gestionar múltiples ligas de paddle, en principio hasta 4 ligas.
 * Utiliza la clase Liga para gestionar cada liga individualmente.
 * Utiliza String.format para formatear las cadenas de texto que devuelven los métodos.
 */
public class GestorLigas {
    private Liga liga1;
    private Liga liga2;
    private Liga liga3;
    private Liga liga4;


    /**
     * Crea una nueva liga con los equipos proporcionados.
     * @param numLiga
     * @param nombreLiga
     * @param equipo1
     * @param equipo2
     * @param equipo3
     * @param equipo4
     */
    public void crearLiga(int numLiga, String nombreLiga, String equipo1, String equipo2, String equipo3, String equipo4) {
        // TODO 21: instancia una nueva liga y asígnala al atributo correspondiente.

    }

    /**
     * Devuelve la liga correspondiente al número proporcionado.
     * @param numLiga Número de la liga (1-4).
     * @return Liga correspondiente o null si el número es inválido.
     */
    public Liga getLiga(int numLiga) {
        // TODO 22: devuelve la liga correspondiente al número proporcionado.











        return null;
    }

    /**
     * Devuelve el nombre de la liga correspondiente al número proporcionado.
     * @param numLiga Número de la liga (1-4).
     * @return Nombre de la liga.
     */
    public String getNombreLiga(int numLiga) {
        // TODO 23: devuelve el nombre de la liga correspondiente al número proporcionado.
        return "";
    }

    /**
     * Devuelve el nombre del equipo correspondiente al número de liga y número de equipo proporcionados.
     * @param numLiga Número de la liga (1-4).
     * @param numEquipo Número del equipo (1-4).
     * @return Nombre del equipo.
     */
    public String getEquipo(int numLiga, int numEquipo) {
        // TODO 24: devuelve el nombre del equipo correspondiente al número de liga y número de equipo proporcionados.

        return "";
    }

    /**
     * Establece el marcador de un partido entre dos equipos en una liga específica.
     * @param numLiga número de liga
     * @param numEquipo1 número del equipo 1
     * @param numEquipo2 número del equipo 2
     * @param numMarcador valor del marcador (1-3)
     * @param v1 puntos del equipo 1
     * @param v2 puntos del equipo 2
     */
    public void setMarcadorPartido(int numLiga, int numEquipo1, int numEquipo2, int numMarcador, int v1, int v2) {
        // TODO 25: establece el marcador de un partido entre dos equipos en una liga específica.

    }

    /**
     * Devuelve una lista formateada de las ligas disponibles.
     * @return Lista de ligas.
     */
    public String getListaLigas() {
        // TODO 26: devuelve una lista formateada de las ligas disponibles.
        // Ej. 1. A       2. B       3. C       4. D
        String s = "1.A   2.B  3.C";




        return s;
    }

    /**
     * Devuelve una lista formateada de los equipos de una liga específica.
     * @param numLiga Número de la liga (1-4).
     * @return Lista de equipos de la liga.
     */
    public String getListaEquipos(int numLiga) {
        // TODO 27: devuelve una lista formateada de los equipos de una liga específica.
        // EJ. 1. A1      2. A2      3. A3      4. A4
        String s = "";



        return s;
    }

    /**
     * Devuelve un listado formateado de los campeones de cada una de las ligas.
     * @return Listado de campeones de las ligas.
     */
    public String getListadoCampeonesLigas() {
        // TODO 28: devuelve un listado formateado de los campeones de cada una de las ligas.
        // Ej.
        //        1. A        A2
        //        2. B        B4
        //        3. C        C3
        //        4. D        D1
        //
        String txt = "";




        return txt;
    }

    /**
     * Devuelve la tabla de resultados de una liga específica.
     * @param numLiga Número de la liga (1-4).
     * @return Tabla de resultados de la liga.
     */
    public String getTablaResultadosLiga(int numLiga) {
        // TODO 29: devuelve la tabla de resultados de una liga específica.
        // Ej.
        // -------------------------
        // | XXX |     |     | 3-6 |
        // | XXX |     |     | 5-7 |
        // | XXX |     |     |     |
        // -------------------------
        // | 6-4 | XXX |     |     |
        // | 6-2 | XXX |     |     |
        // |     | XXX |     |     |
        // -------------------------
        // |     |     | XXX | 5-7 |
        // |     |     | XXX | 6-3 |
        // |     |     | XXX | 0-6 |
        // -------------------------
        // | 6-0 | 1-6 |     | XXX |
        // | 6-2 | 2-6 |     | XXX |
        // |     |     |     | XXX |
        // -------------------------
        //












        return "X";
    }

}
