package edu.masanz.da.lp;

/**
 * Clase para la gestión de los partidos de una liga.
 */
public class PartidosLiga {

    private Partido partido12;
    private Partido partido13;
    private Partido partido14;

    private Partido partido21;
    private Partido partido23;
    private Partido partido24;

    private Partido partido31;
    private Partido partido32;
    private Partido partido34;

    private Partido partido41;
    private Partido partido42;
    private Partido partido43;


    /**
     * Método constructor. Instancia todos los partidos de una liga.
     * Un equipo no puede jugar contra sí mismo.
     * Dos equipos juegan dos partidos, el equivalente a en casa y fuera de casa.
     * En uno de los dos partidos un equipo será el primer equipo y en el otro el segundo.
     * @param equipo1 Nombre del primer equipo
     * @param equipo2 Nombre del segundo equipo
     * @param equipo3 Nombre del tercer equipo
     * @param equipo4 Nombre del cuarto equipo
     */
    public PartidosLiga(String equipo1, String equipo2, String equipo3, String equipo4) {
        // TODO 41: Instancia todos los atributos de la clase creando los partidos entre los equipos correspondientes.















    }

    /**
     * Obtiene el partido entre dos equipos
     * @param i Número del primer equipo [1-4]
     * @param j Número del segundo equipo [1-4]
     * @return Referencia al objeto que representa el partido o null si i y j no se corresponden con un partido
     */
    public Partido getPartido(int i, int j) {
        // TODO 42: Devuelve la referencia al partido entre los equipos i y j o null si no hay correspondencia
















        return null;
    }

    /**
     * Obtiene el número de partidos ganados por un equipo
     * @param equipo Nombre del equipo
     * @return Número de partidos ganados
     */
    public int partidosGanados(String equipo) {
        int n = 0;
        // TODO 43: Devuelve los partidos ganados por el equipo en la liga.
        // Mediante un doble bucle obtén el partido y comprueba si lo ha ganado el equipo en cuestión.
        // Ten en cuenta que un equipo puede jugar como primer o segundo equipo en un partido.
        // Utiliza los métodos de la clase Partido: getPartido, getEquipo, getGanador














        return n;
    }

    /**
     * Obtiene el texto que representa el número del marcador indicado del partido entre los equipos indicados.
     * @param k Número del marcador [1-3] Ej. 1
     * @param i Número del primer equipo [1-4] Ej. 2
     * @param j Número del segundo equipo [1-4] Ej. 3
     * @return Devuelve el texto que representa o "XXX" si no es posible si i y j son iguales. Ej. 5-7
     */
    public String getTextoMarcadorPartido(int k, int i, int j) {
        // TODO 44: Devuelve el texto del marcador o "XXX" si no es posible.
        // Utiliza los métodos de la clase Partido: getPartido, getTextoMarcador




        return "X".repeat(3);
    }

    /**
     * Fija los valores del marcador de los equipos indicados
     * @param numEquipo1 Número del primer equipo [1-4]
     * @param numEquipo2 Número del segundo equipo [1-4]
     * @param numMarcador Número del marcador [1-3]
     * @param v1 Valor del marcador del primer equipo
     * @param v2 Valor del marcador del segundo equipo
     */
    public void setMarcadorPartido(int numEquipo1, int numEquipo2, int numMarcador, int v1, int v2) {
        // TODO 45: Fija los valores del marcador del encuentro entre los equipos
        // Utiliza el método getPartido para obtener el partido y setMarcadorPartido de la clase partido

    }

}
