/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oyarce.mavenproject1;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author pv-alumno
 */
public class Mavenproject1 {

    private static final ArrayList<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {

        boolean ejecutando = true;

        while (ejecutando) {
            try {
                System.out.println("\n=== SISTEMA DE GESTIÓN FERREMASTER ===");
                System.out.println("1. Ingresar producto");
                System.out.println("2. Eliminar producto por nombre");
                System.out.println("3. Buscar producto por nombre");
                System.out.println("4. Listar todos los productos");
                System.out.println("5. Cambiar nombre, garantía y propiedad eléctrica del producto");
                System.out.println("6. Salir");

                int op = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese una opción: ");

                switch (op) {
                    case 1 -> {
                        // 1. Solicitar el nombre y validar duplicados
                        String nombre = UtilidadesFerreteria.solicitarTexto("Ingrese el nombre del producto: ");

                        boolean existe = false;
                        for (Producto p : inventario) {
                            if (p.getNombre().equalsIgnoreCase(nombre)) {
                                existe = true;
                                break;
                            }
                        }

                        if (existe) {
                            UtilidadesFerreteria.mostrarMensaje("Error: Ya existe un producto registrado con ese nombre.");
                            break;
                        }

                        // 2. Meses de garantía
                        int garantia = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese los meses de garantía: ");

                        // 3. Selección de categoría desde el diccionario
                        Map<Integer, String> categorias = UtilidadesFerreteria.obtenerDiccionarioCategorias();
                        UtilidadesFerreteria.mostrarMensaje("Seleccione la categoría:");

                        for (Map.Entry<Integer, String> entry : categorias.entrySet()) {
                            System.out.println(entry.getKey() + ". " + entry.getValue());
                        }

                        int opcionCategoria = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese el número de la categoría:");

                        if (!categorias.containsKey(opcionCategoria)) {
                            throw new Exception("Opción de categoría inválida.");
                        }

                        String categoriaSeleccionada = categorias.get(opcionCategoria);

                        // 4. Datos comunes restantes
                        int anio = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese el año de fabricación: ");
                        boolean electrico = UtilidadesFerreteria.solicitarBooleano("Indique si el producto es eléctrico");
                        double calificacion = UtilidadesFerreteria.solicitarNumeroDecimal("Ingrese una calificación de 0 a 10: ");

                        // 5. Selección del tipo de producto e instanciación
                        System.out.println("1. Profesional");
                        System.out.println("2. Liquidación");
                        System.out.println("3. Estándar");
                        int tipo = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese el tipo de producto:");

                        Producto articulo = null;

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("1. Industrial");
                                System.out.println("2. Comercial");
                                int opcionCert = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese el nivel de certificación:");

                                String certificacion;
                            switch (opcionCert) {
                                case 1 -> certificacion = "Industrial";
                                case 2 -> certificacion = "Comercial";
                                default -> throw new Exception("Opción de certificación inválida.");
                            }

                                articulo = new HerramientaProfesional(nombre, garantia, categoriaSeleccionada, anio, electrico, calificacion, certificacion);
                            }
                            case 2 -> {
                                int anioOriginal = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese el año del lote original: ");
                                articulo = new ProductoLiquidacion(nombre, garantia, categoriaSeleccionada, anio, electrico, calificacion, anioOriginal);
                            }
                            case 3 -> {
                                articulo = new ArticuloEstandar(nombre, garantia, categoriaSeleccionada, anio, electrico, calificacion);
                            }
                            default -> throw new Exception("Tipo de producto no válido.");
                        }

                        inventario.add(articulo);
                        UtilidadesFerreteria.mostrarMensaje("Producto ingresado correctamente.");
                    }

                    case 2 -> {
                        if (inventario.isEmpty()) {
                            UtilidadesFerreteria.mostrarMensaje("El inventario está vacío.");
                            break;
                        }

                        String nombreEliminar = UtilidadesFerreteria.solicitarTexto("Ingrese el nombre del producto a eliminar:");
                        boolean removido = inventario.removeIf(p -> p.getNombre().equalsIgnoreCase(nombreEliminar));

                        if (removido) {
                            UtilidadesFerreteria.mostrarMensaje("Producto eliminado correctamente.");
                        } else {
                            UtilidadesFerreteria.mostrarMensaje("No se encontró ningún producto con ese nombre.");
                        }
                    }

                    case 3 -> {
                        if (inventario.isEmpty()) {
                            UtilidadesFerreteria.mostrarMensaje("El inventario está vacío.");
                            break;
                        }

                        String nombreOriginal = UtilidadesFerreteria.solicitarTexto("Ingrese el nombre del producto a buscar:");
                        Producto productoEncontrado = null;

                        for (Producto p : inventario) {
                            if (p.getNombre().equalsIgnoreCase(nombreOriginal)) {
                                productoEncontrado = p;
                                break;
                            }
                        }

                        if (productoEncontrado != null) {
                            UtilidadesFerreteria.mostrarMensaje("Producto encontrado:");
                            System.out.println(productoEncontrado);

                            // Si posee interfaz de soporte técnico, mostrar guía
                            if (productoEncontrado instanceof ISoporteTecnico soporte) {
                                soporte.mostrarGuiaDeUsoSeguro();
                            }
                        } else {
                            UtilidadesFerreteria.mostrarMensaje("No se encontró ningún producto con ese nombre.");
                        }
                    }

                    case 4 -> {
                        if (inventario.isEmpty()) {
                            UtilidadesFerreteria.mostrarMensaje("El inventario está vacío.");
                            break;
                        }

                        System.out.println("\n========== LISTADO DE PRODUCTOS ==========");
                        int totalGarantiaAcumulada = 0;
                        int cantHerramientasProf = 0;
                        Producto productoMayorGarantia = inventario.get(0);

                        for (int i = 0; i < inventario.size(); i++) {
                            Producto p = inventario.get(i);
                            System.out.println((i + 1) + ". " + p);

                            totalGarantiaAcumulada += p.getGarantiaMeses();

                            if (p.getGarantiaMeses() > productoMayorGarantia.getGarantiaMeses()) {
                                productoMayorGarantia = p;
                            }

                            if (p instanceof HerramientaProfesional) {
                                cantHerramientasProf++;
                            }
                        }

                        System.out.println("\n--- RESUMEN DEL INVENTARIO ---");
                        System.out.println("• Total de meses de garantía acumulados: " + totalGarantiaAcumulada + " meses");
                        System.out.println("• Producto con mayor garantía: " + productoMayorGarantia.getNombre() + " (" + productoMayorGarantia.getGarantiaMeses() + " meses)");
                        System.out.println("• Cantidad de herramientas profesionales: " + cantHerramientasProf);
                        System.out.println("==========================================");
                    }

                    case 5 -> {
                        if (inventario.isEmpty()) {
                            UtilidadesFerreteria.mostrarMensaje("El inventario está vacío.");
                            break;
                        }

                        String nombreBuscar = UtilidadesFerreteria.solicitarTexto("Ingrese el nombre del producto a modificar:");
                        Producto productoEncontrado = null;

                        for (Producto p : inventario) {
                            if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                productoEncontrado = p;
                                break;
                            }
                        }

                        if (productoEncontrado != null) {
                            String nuevoNombre = UtilidadesFerreteria.solicitarTexto("Ingrese el nuevo nombre:");

                            if (!nuevoNombre.equalsIgnoreCase(productoEncontrado.getNombre())) {
                                for (Producto p : inventario) {
                                    if (p.getNombre().equalsIgnoreCase(nuevoNombre)) {
                                        throw new Exception("Ya existe otro producto registrado con el nuevo nombre.");
                                    }
                                }
                            }

                            int nuevaGarantia = UtilidadesFerreteria.solicitarNumeroEntero("Ingrese los nuevos meses de garantía:");
                            boolean nuevoElectrico = UtilidadesFerreteria.solicitarBooleano("Indique si es eléctrico");

                            productoEncontrado.setNombre(nuevoNombre);
                            productoEncontrado.setGarantiaMeses(nuevaGarantia);
                            productoEncontrado.setEsElectrico(nuevoElectrico);

                            UtilidadesFerreteria.mostrarMensaje("Producto modificado correctamente.");
                        } else {
                            UtilidadesFerreteria.mostrarMensaje("No se encontró ningún producto con ese nombre.");
                        }
                    }

                    case 6 -> {
                        UtilidadesFerreteria.mostrarMensaje("Saliendo del sistema FerreMaster...");
                        ejecutando = false;
                    }

                    default -> UtilidadesFerreteria.mostrarMensaje("Opción inválida. Intente de nuevo.");
                }
            } catch (Exception ex) {
                UtilidadesFerreteria.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}