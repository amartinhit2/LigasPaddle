package edu.masanz.da.lp;

public class Init {

    private static final char SEP = ',';
    private static final String NOMBRES_LIGAS = "A,B,C,D";
    private static final String EQUIPOS_LIGA_1 = "A1,A2,A3,A4";
    private static final String EQUIPOS_LIGA_2 = "B1,B2,B3,B4";
    private static final String EQUIPOS_LIGA_3 = "C1,C2,C3,C4";
    private static final String EQUIPOS_LIGA_4 = "D1,D2,D3,D4";

    private static GestorLigas gestorLigas;

    /**
     * Crea las ligas que gestiona el gestor de ligas. 
     * Asigna al atributo gestorLigas el gl pasado como parámetro.
     * Mediante la clase Init obtiene el nombre de la liga para cada liga que crea.
     * Los nombres de los equipos de la liga los obtiene mediante getEquipoLiga.
     * Define un número aleatorio de resultados entre el 70 y 90 por ciento del número de partidos por liga.
     * El método randomMarcadores aleatoriza el número de resultados para la liga indicada.
     * @param gl Gestor de ligas
     */
    public static void crearLigas(GestorLigas gl) {
        gestorLigas = gl;
        int n = getNumeroLigas();
        for (int i = 1; i <= n; i++) {
            String nombreLiga = Init.getNombreLiga(i);
            String equipo1 = getEquipoLiga(i, 1);
            String equipo2 = getEquipoLiga(i, 2);
            String equipo3 = getEquipoLiga(i, 3);
            String equipo4 = getEquipoLiga(i, 4);
            gestorLigas.crearLiga(i, nombreLiga, equipo1, equipo2, equipo3, equipo4);
            int x = (int) (getNumeroPartidosPorLiga() * (Math.random()*2 + 7) / 10);
            randomMarcadores(i, x);
        }
    }

    /**
     * Obtiene el número de ligas definido en NOMBRES_LIGAS
     * @return Número de ligas que hay
     */
    private static int getNumeroLigas() {
        return Utils.contarSubcadenas(NOMBRES_LIGAS, SEP);
    }

    /**
     * Obtiene el número de partidos por liga
     * @return Número de partidos por liga
     */
    private static int getNumeroPartidosPorLiga() {
        return 12;
    }

    /**
     * Obtiene el nombre de la liga i-ésima de NOMBRES_LIGAS
     * @param i Número de la liga (>=1)
     * @return Nombre de la liga
     */
    private static final String getNombreLiga(int i) {
        return Utils.getSubcadena(NOMBRES_LIGAS, SEP, i);
    }

    /**
     * Obtiene el nombre del equipo de la liga indicada
     * @param numLiga Número de la liga (>=1)
     * @param numEquipo Número del equipo de la liga (>=1)
     * @return Nombre de la liga
     */
    private static final String getEquipoLiga(int numLiga, int numEquipo) {
        String equipo = "";
        switch (numLiga) {
            case 1:
                equipo = Utils.getSubcadena(EQUIPOS_LIGA_1, SEP, numEquipo);
                break;
            case 2:
                equipo = Utils.getSubcadena(EQUIPOS_LIGA_2, SEP, numEquipo);
                break;
            case 3:
                equipo = Utils.getSubcadena(EQUIPOS_LIGA_3, SEP, numEquipo);
                break;
            case 4:
                equipo = Utils.getSubcadena(EQUIPOS_LIGA_4, SEP, numEquipo);
                break;
        }
        return equipo;
    }

    /**
     * Crea los resultados para el número de partidos en la liga indicada.
     * @param numLiga Número de la liga para la que crear los resultados.
     * @param numPartidos Cantidad de resultados aleatorios a generar.
     */
    private static void randomMarcadores(int numLiga, int numPartidos) {
        int i = 0;
        while (i < numPartidos) {
            int numEquipo1 = (int) (Math.random() * 4) + 1;
            int numEquipo2 = (int) (Math.random() * 4) + 1;
            if (numEquipo1 != numEquipo2) {
                randomMarcadores(numLiga, numEquipo1, numEquipo2);
                i++;
            }
        }
    }

    /**
     * Crea marcadores de paddle aleatorios para los equipos de la liga indicada.
     * Los resultados de un encuentro de paddle pueden tener hasta tres sets.
     * El tercer set solo se juega si los dos anteriores han sido ganados cada uno por un equipo.
     * El tercer set desempata y sirve para determinar el ganador si es necesario.
     * El resultado de los sets se define mediante marcadores que tienen dos valores.
     * El primer valor del marcador se corresponde al número de juegos ganados por el primer equipo.
     * El segundo valor del marcador se corresponde al número de juegos ganados por el segundo equipo.
     * El jugador que gana 6 juegos con una diferencia de dos juegos es el ganador.
     * Si al final de un juego se llega con un resultado de 5-6 o 6-5 se debe jugar hasta el 7o juego.
     * No puede haber un empate a 6 juegos.
     * En los dos primeros sets debe haber un ganador que solo si es distinto hará que se registre el tercer set.
     * Cuando no hace falta jugar un tercer set el marcador del tercer set será 0-0.
     * Para fijar los marcadores de los encuentros se utiliza el método setMarcadorPartido del gestor de ligas.
     * @param numLiga Número de la liga en la que se obtiene los marcadores aleatorios
     * @param numEquipo1 Número del equipo para el cual se establece el primer resultado de los marcadores
     * @param numEquipo2 Número del equipo para el cual se establece el segundo resultado de los marcadores
     */
    private static void randomMarcadores(int numLiga, int numEquipo1, int numEquipo2) {
        int n1, n2, v1, v2, r;
        n1 = 0;
        n2 = 0;
        if (numEquipo1 == numEquipo2) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            r = (int) (Math.random() * 2);
            if (r == 0) {
                v1 = 6;
                v2 = (int) (Math.random() * 7);
            } else {
                v1 = (int) (Math.random() * 7);
                v2 = 6;
            }
            if (v1 == 6 && v2 == 5) {
                v1 = 7;
            }else if (v1 == 5 && v2 == 6) {
                v2 = 7;
            }else if (v1 == 6 && v2 == 6) {
                r = (int) (Math.random() * 2);
                if (r == 0) {
                    v1 = 7;
                    v2 = 5;
                } else {
                    v1 = 5;
                    v2 = 7;
                }
            }
            gestorLigas.setMarcadorPartido(numLiga, numEquipo1, numEquipo2, i, v1, v2);
            if (v1 > v2) {
                n1++;
            } else {
                n2++;
            }
            if ((n1 == 2 || n2 == 2) && i < 3) {
                gestorLigas.setMarcadorPartido(numLiga,  numEquipo1, numEquipo2, 3, 0, 0);
                break;
            }
        }
    }

}
