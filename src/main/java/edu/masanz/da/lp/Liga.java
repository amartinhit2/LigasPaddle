package edu.masanz.da.lp;

/**
 * Clase que gestiona una liga de equipos.
 * En principio la liga está formada por cuatro equipos.
 * Utiliza una instancia de la clase PartidosLiga.
 */
public class Liga {

    private String nombreLiga;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private String equipo4;
    private PartidosLiga partidosLiga;

    /**
     * Método constructor de una liga. Inicializa los atributos e instancia partidosLiga.
     * @param nombreLiga Nombre de la liga
     * @param equipo1 Nombre del primer equipo
     * @param equipo2 Nombre del segundo equipo
     * @param equipo3 Nombre del tercer equipo
     * @param equipo4 Nombre del cuarto equipo
     */
    public Liga(String nombreLiga, String equipo1, String equipo2, String equipo3, String equipo4) {
        // TODO 31: Inicializa todos los atributos de la clase
        this.nombreLiga = nombreLiga;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
        this.equipo4 = equipo4;
        this.partidosLiga = new PartidosLiga(equipo1, equipo2, equipo3, equipo4);
    }

    /**
     * Obtiene el nombre de la liga
     * @return Nombre de la liga
     */
    public String getNombreLiga() {
        // TODO 32: Devuelve el nombre de la liga
        return nombreLiga;
    }

    /**
     * Obtiene el nombre de i-ésimo equipo
     * @param i Número del equipo [1-4]
     * @return Nombre del equipo o cadena vacía si i es inválido
     */
    public String getEquipo(int i) {
        // TODO 33: Devuelve el nombre del equipo correspondiente o sino cadena vacía
        switch (i){
            case 1:
                return equipo1;
            case 2:
                return equipo2;
            case 3:
                return equipo3;
            case 4:
                return equipo4;
            default:
                return null;
        }
    }

    /**
     * Obtiene el marcador del partido indicado mediante partidosLiga
     * @param k Número del marcador [1-3]
     * @param i Número asociado al primer equipo [1-4]
     * @param j Número asociado al segundo equipo [1-4]
     * @return Representación textual del marcador facilitada por partidosLiga
     */
    public String getMarcadorPartido(int k, int i, int j) {
        // TODO 34: Devuelve el marcador k del partido entre el equipo i y j
        return partidosLiga.getTextoMarcadorPartido(k,i,j);

    }

    /**
     * Obtiene el nombre del equipo campeón de la liga en ese momento.
     * Si varios equipos son los campeones concatena sus nombres separados por un espacio.
     * @return Nombre del equipo que más veces ha ganado (o de los equipos si hay más de uno)
     */
    public String getEquipoCampeon() {
        // TODO 35: Devuelve el nombre del o de los campeones de la liga
        String nombreCampeon = "";
        String equipo = "";
        int numPartidosGanadosMax = -1;
        int numPartidosGanados = 0;
        for (int i = 1; i <= 4; i++) {
            equipo = getEquipo(i);
            numPartidosGanados = partidosLiga.partidosGanados(equipo);
            if (numPartidosGanados > numPartidosGanadosMax) {
                numPartidosGanadosMax = numPartidosGanados;
                nombreCampeon = equipo;
            }else if (numPartidosGanados == numPartidosGanadosMax) {
                nombreCampeon += " " + equipo;
            }
        }
        return nombreCampeon;
    }

    /**
     * Fija el marcador indicado del partido entre dos equipos de la liga
     * utilizando partidosLiga
     * @param numEquipo1 Número del primer equipo [1-4]
     * @param numEquipo2 Número del segundo equipo [1-4]
     * @param numMarcador Número del marcador [1-3]
     * @param v1 Valor del marcador del primer equipo
     * @param v2 Valor del marcador del segundo equipo
     */
    public void setMarcadorPartido(int numEquipo1, int numEquipo2, int numMarcador, int v1, int v2) {
        // TODO 36: Fija los valores del marcador del encuentro entre los equipos
        partidosLiga.setMarcadorPartido(numEquipo1,numEquipo2,numMarcador,v1,v2);

    }
}
