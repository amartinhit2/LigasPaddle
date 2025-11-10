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
        Liga nuevaliga = new Liga(nombreLiga,equipo1,equipo2,equipo3,equipo4);
        switch (numLiga){
            case 1:
                liga1 = nuevaliga;
                break;
            case 2:
                liga2 = nuevaliga;
                break;
            case 3:
                liga3 = nuevaliga;
                break;
            case 4:
                liga4 = nuevaliga;
                break;
            default:
                break;
        }
    }

    /**
     * Devuelve la liga correspondiente al número proporcionado.
     * @param numLiga Número de la liga (1-4).
     * @return Liga correspondiente o null si el número es inválido.
     */
    public Liga getLiga(int numLiga) {
        // TODO 22: devuelve la liga correspondiente al número proporcionado.
        switch (numLiga){
            case 1:
                return liga1;
            case 2:
                return liga2;
            case 3:
                return liga3;
            case 4:
                return liga4;
            default:
                return null;
        }
    }

    /**
     * Devuelve el nombre de la liga correspondiente al número proporcionado.
     * @param numLiga Número de la liga (1-4).
     * @return Nombre de la liga.
     */
    public String getNombreLiga(int numLiga) {
        // TODO 23: devuelve el nombre de la liga correspondiente al número proporcionado.
        return getLiga(numLiga).getNombreLiga();
    }

    /**
     * Devuelve el nombre del equipo correspondiente al número de liga y número de equipo proporcionados.
     * @param numLiga Número de la liga (1-4).
     * @param numEquipo Número del equipo (1-4).
     * @return Nombre del equipo.
     */
    public String getEquipo(int numLiga, int numEquipo) {
        // TODO 24: devuelve el nombre del equipo correspondiente al número de liga y número de equipo proporcionados.
        Liga liga = getLiga(numLiga);
        return liga.getEquipo(numEquipo);
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
        getLiga(numLiga).setMarcadorPartido(numEquipo1,numEquipo2,numMarcador,v1,v2);
    }

    /**
     * Devuelve una lista formateada de las ligas disponibles.
     * @return Lista de ligas.
     */
    public String getListaLigas() {
        // TODO 26: devuelve una lista formateada de las ligas disponibles.
        // Ej. 1. A       2. B       3. C       4. D
        String s = "";
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d. %-8s", i, getLiga(i).getNombreLiga());
        }
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
        for (int i = 1; i <= 4 ; i++) {
            System.out.printf("%d. %-8s", i, getLiga(numLiga).getEquipo(i));
        }
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
        for (int i = 1; i <= 4 ; i++) {
            Liga liga = getLiga(i);
            System.out.printf("%4d. %-8s %-8s\n", i, liga.getNombreLiga(), liga.getEquipoCampeon());
        }
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

        Liga liga = getLiga(numLiga);
        String txt = "-".repeat(4*6+1) + "\n";
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 3; k++) {
                txt += "|";
                for (int j = 1; j <= 4; j++) {
                    txt += " " + liga.getMarcadorPartido(k, i, j) + " |";
                }
                txt += "\n";
            }
            txt += "-".repeat(4*6+1) + "\n";
        }
        return txt;



    }

}
