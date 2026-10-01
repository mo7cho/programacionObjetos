/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oyarce.mavenproject1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pv-alumno
 */
public class UtilidadesFerreteria {

    private static final Scanner scanner = new Scanner(System.in);

    // Método para mostrar mensajes por pantalla de forma limpia
    public static void mostrarMensaje(String mensaje) {

        System.out.println("[FerreMaster]: " + mensaje);

    }

    // Diccionario de categorías obligatorio
    public static Map<Integer, String> obtenerDiccionarioCategorias() {

        Map<Integer, String> categorias = new HashMap<>();

        categorias.put(1, "Herramientas Manuales");

        categorias.put(2, "Herramientas Eléctricas");

        categorias.put(3, "Materiales de Construcción");

        categorias.put(4, "Fijaciones y Adhesivos");

        categorias.put(5, "Pinturas");

        return categorias;

    }

    // Solicitar Texto (String) con throws
    public static String solicitarTexto(String etiqueta) throws Exception {

        mostrarMensaje(etiqueta);

        String texto = scanner.nextLine();

        if (texto == null || texto.trim().isEmpty()) {

            throw new Exception("El texto ingresado no puede estar vacío.");

        }

        return texto.trim();

    }

    // Solicitar Número Entero (int) con throws
    public static int solicitarNumeroEntero(String etiqueta) throws Exception {

        mostrarMensaje(etiqueta);

        try {

            int numero = Integer.parseInt(scanner.nextLine());

            return numero;

        } catch (NumberFormatException e) {

            throw new Exception("Error: Debe ingresar un número entero válido.");

        }

    }

    // Solicitar Número Decimal (double) con throws
    public static double solicitarNumeroDecimal(String etiqueta) throws Exception {

        mostrarMensaje(etiqueta);

        try {

            double decimal = Double.parseDouble(scanner.nextLine());

            return decimal;

        } catch (NumberFormatException e) {

            throw new Exception("Error: Debe ingresar un número decimal válido.");

        }

    }

    // Solicitar Booleano con throws
    public static boolean solicitarBooleano(String etiqueta) throws Exception {

        mostrarMensaje(etiqueta + " (true/false):");

        String entrada = scanner.nextLine().trim().toLowerCase();

        if (entrada.equals("true") || entrada.equals("1") || entrada.equals("sí") || entrada.equals("si")) {
            return true;

        } else if (entrada.equals("false") || entrada.equals("0") || entrada.equals("no")) {

            return false;

        } else {

            throw new Exception("Error: Valor booleano no válido. Ingrese true o false.");

        }

    }

}
