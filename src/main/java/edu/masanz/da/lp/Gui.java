package edu.masanz.da.lp;

import java.util.Scanner;

/**
 * Clase que gestiona las entradas y salidas de la interfaz gráfica de usuario.
 * Todas las lecturas y escrituras se deben realizar mediante los métodos de esta clase.
 * En otras clases se puede definir el formato del texto que devuelven (pero no imprimen).
 */
public class Gui {

    /**
     * Muestra el menú de la aplicación.
     */
    public static void mostrarMenu() {
        System.out.println("*****************************************");
        System.out.println("*        L I G A S    P A D D L E       *");
        System.out.println("*****************************************");
        System.out.println(" 1. Listar equipos ligas");
        System.out.println(" 2. Mostrar tabla resultados de una liga");
        System.out.println(" 3. Listar campeones ligas");
        System.out.println(" 4. Anotar marcadores partido a una liga");
        System.out.println(" 0. Salir de la aplicación");
        System.out.println("*****************************************");
    }

    /**
     * Lee un valor numérico entero mostrando un mensaje.
     * Controla que sea un valor entero.
     * @param txt Texto que se muestra en la misma línea.
     */
    public static int leerNumero(String txt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        int n = -1;
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine().trim());
                return n;
            } catch (NumberFormatException e) { }
        }
    }

    /**
     * Muestra un texto pasado como parámetro.
     * @param msg Texto del mensaje que se muestra.
     */
    public static void mostrarTexto(String msg) {
        System.out.println(msg);
    }

    /**
     * Muestra un mensaje para ser confirmado.
     * La respuesta del usuario debe empezar con el texto indicado en el segundo parámetro.
     * Habitualmente yes="s" y si la respuesta empieza por "s" o "S" se devuelve true.
     * @param txt Mensaje que se muestra en la misma línea. Ej. "Desea continuar (s/n)"
     * @param yes Inicio de la respuesta que se utiliza para confirmar. Ej. "s"
     * @return true si la respuesta del usuario empieza con el parámetro yes.
     */
    public static boolean confirmar(String txt, String yes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        return scanner.nextLine().trim().toLowerCase().startsWith(yes.toLowerCase());
    }

    /**
     * Lee un texto mostrando un mensaje.
     * Elimina espacios a los lados de la respuesta.
     * @param txt Texto que se muestra en la misma línea.
     */
    public static String leerTexto(String txt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        return scanner.nextLine().trim();
    }

}
