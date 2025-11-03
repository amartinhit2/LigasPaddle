package edu.masanz.da.lp;

/**
 * Clase para gestionar un partido entre dos equipos que tiene tres marcadores.
 * En un partido de paddle se pueden jugar hasta tres sets para cada uno se utiliza un marcador.
 * Un equipo gana un partido si ha ganado dos sets.
 * Si un equipo gana los dos primeros sets el tercero no se juega.
 */
public class Partido {

    private String equipo1;
    private String equipo2;

    private Marcador marcador1;
    private Marcador marcador2;
    private Marcador marcador3;

    /**
     * Constructor vacío. Inicializa el nombre de los equipos como "E1" y "E2" e instancia los tres marcadores.
     */
    public Partido() {
        // TODO 51: Instancia todos los atributos. Da a equipo1 el valor "E1" y a equipo2 el valor "E2".





    }

    /**
     * Constructor con los nombres de los equipos.
     * @param equipo1 Nombre del primer equipo del partido.
     * @param equipo2 Nombre del segundo equipo del partido.
     */
    public Partido(String equipo1, String equipo2) {
        // TODO 52: Instancia todos los atributos adecuadamente.





    }

    /**
     * Obtiene el nombre del equipo indicado
     * @param i Número del equipo cuyo nombre se quiere obtener [1-2]
     * @return Devuelve el nombre o cadena vacía si i no es 1 o 2
     */
    public String getEquipo(int i) {
        // TODO 53: Devuelve el nombre del equipo i-ésimo o cadena vacía (utiliza if-else-if-else)






        return "";
    }

    /**
     * Obtiene el marcador indicado del partido
     * @param i Número del marcador [1-3]
     * @return Referencia al objeto marcador o null si i es un valor incorrecto
     */
    public Marcador getMarcador(int i) {
        // TODO 54: Devuelve el marcador i-ésimo o null (utiliza switch)





        return null;
    }

    /**
     * Devuelve el número del equipo ganador
     * @return 1 si gana el primer equipo, 2 si gana el segundo, sino 0
     */
    public int getGanador() {
        // TODO 55: Devuelve el número del equipo ganador en base a los marcadores
        // Utiliza getMarcador y getGanador de la clase Marcador


















        return 0;
    }

    /**
     * Fija los valores del marcador indicado
     * @param numMarcador Número del marcador [1-3]
     * @param v1 Valor del marcador para el equipo1 [0-7]
     * @param v2 Valor del marcador para el equipo2 [0-7]
     */
    public void setMarcadorPartido(int numMarcador, int v1, int v2) {
        // TODO 56: Fija los valores del marcador indicado

    }

    /**
     * Obtiene un texto que representa el marcador.
     * Si el resultado era 0-0 sebe devolver una cadena vacía de tres espacios: "   "
     * @param numMarcador Número del marcador [1-3]
     * @return Representación textual del marcador Ej. "5-6", "7-5", "   "
     */
    public String getTextoMarcador(int numMarcador) {
        // TODO 57: Devuelve la representación textual del marcador
        // Si el resultado era 0-0 sebe devolver una cadena vacía de tres espacios: "   "





        return "   ";
    }

}
