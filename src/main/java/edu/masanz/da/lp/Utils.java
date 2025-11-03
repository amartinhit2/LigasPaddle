package edu.masanz.da.lp;

/**
 * Clase de métodos útiles para gestionar cadenas.
 */
public class Utils {

    /**
     * Obtiene la subcadena indicada de la cadena de palabras dada
     * @param cadenaPalabras Cadena de palabras de la que se obtiene la subcadena. Ej. "A,B,C,D"
     * @param separador Carácter separador de las subcadenas. Ej. ','
     * @param numPalabra Número de la subcadena a obtener (>=1). Ej. 1
     * @return Subcadena indica. Ej. "A"
     */
    public static String getSubcadena(String cadenaPalabras, char separador, int numPalabra) {
        int idxDesde = buscaIdxSeparador(cadenaPalabras, separador, numPalabra - 1) + 1;
        int idxHasta = buscaIdxSeparador(cadenaPalabras, separador, numPalabra);
        return cadenaPalabras.substring(idxDesde, idxHasta);
    }

    /**
     * Obtiene cuántas subcadenas hay en la cadena de palabras es base al separador dado
     * @param cadenaPalabras Cadena de palabras de la que se obtiene la subcadena. Ej. "A,B,C,D"
     * @param separador Carácter separador de las subcadenas. Ej. ','
     * @return Cantidad de subpalabras que hay. Ej. 4
     */
    public static int contarSubcadenas(String cadenaPalabras, char separador) {
        int i = 1;
        while (buscaIdxSeparador(cadenaPalabras, separador, i) < cadenaPalabras.length()) {
            i++;
        }
        return i;
    }

    /**
     * Busca el índice de la ubicación del carácter buscado en una cadena la cantidad de vez indicada
     * @param cadenaPalabras Cadena de palabras de la que se obtiene la subcadena. Ej. "A,B,C,D"
     * @param car Carácter que se busca. Ej. ','
     * @param vez Cantidad de vez buscada. Ej. 2
     * @return Posición (>=0) de la ubicación o -1 si no se encuentra. Ej. 3
     */
    private static int buscaIdxSeparador(String cadenaPalabras, char car, int vez) {
        if (vez == 0) {
            return -1;
        }
        int i = 0;
        for (int j = 0; j < cadenaPalabras.length(); j++) {
            if (cadenaPalabras.charAt(j) == car) {
                i++;
                if (i == vez) {
                    return j;
                }
            }
        }
        return cadenaPalabras.length();
    }

    /**
     * Método para probar la clase
     * @param args Parámtros de entrada (no se usan)
     */
    public static void main(String[] args) {
        String cadena = "Uno dos tres cuatro cinco";
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": '" + getSubcadena(cadena, ' ', i) + "'");
        }
        System.out.println("Num palabras ' ': " + contarSubcadenas(cadena, ' '));
        System.out.println("Num palabras '#': " + contarSubcadenas(cadena, '#'));
    }

}
