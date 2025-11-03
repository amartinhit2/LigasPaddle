package edu.masanz.da.lp;

/**
 * Clase para gestionar un marcador de un set en un partido.
 * Un marcador tiene dos valores enteros, uno para cada equipo.
 * Permite obtener el ganador del set.
 */
public class Marcador {

    private int v1;
    private int v2;

    /**
     * Constructor vacío. Inicializa ambos valores a 0.
     */
    public Marcador() {
        // TODO 61: inicializa ambos valores a 0.
        // Puedes utilizar this(...) para llamar al otro constructor.

    }

    /**
     * Constructor con valores iniciales.
     * @param v1 Valor para el primer equipo.
     * @param v2 Valor para el segundo equipo.
     */
    public Marcador(int v1, int v2) {
        // TODO 62: inicializa los atributos con los parámetros proporcionados.


    }

    // region getters and setters

    /**
     * Obtiene el valor del primer equipo.
     * @return Valor del primer equipo.
     */
    public int getV1() {
        // TODO 63: devuelve el valor del primer equipo.
        return 0;
    }

    /**
     * Establece el valor del primer equipo.
     * @param v1 Valor del primer equipo.
     */
    public void setV1(int v1) {
        // TODO 64: establece el valor del primer equipo.

    }

    /**
     * Obtiene el valor del segundo equipo.
     * @return Valor del segundo equipo.
     */
    public int getV2() {
        // TODO 65: devuelve el valor del segundo equipo.
        return 0;
    }

    /**
     * Establece el valor del segundo equipo.
     * @param v2 Valor del segundo equipo.
     */
    public void setV2(int v2) {
        // TODO 66: establece el valor del segundo equipo.

    }

    // endregion

    /**
     * Establece ambos valores del marcador.
     * @param v1 Valor del primer equipo.
     * @param v2 Valor del segundo equipo.
     */
    public void setV1V2(int v1, int v2) {
        // TODO 67: establece ambos valores del marcador.


    }

    /**
     * Determina el número del equipo ganador.
     * @return 1 si gana el primer equipo, 2 si gana el segundo, 0 si hay empate.
     */
    public int getGanador() {
        // TODO 68: devuelve el número del equipo ganador.






        return 0;
    }

    /**
     * Devuelve una representación textual del marcador.
     * @return Cadena en formato "v1-v2". Ej. "5-7", "7-5", "0-0"
     */
    @Override
    public String toString() {
        // TODO 69: devuelve una representación textual del marcador.
        return "0-0";
    }

}
