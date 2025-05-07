/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaderegistrodeempleadoyproyecto;

import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class SistemaDeRegistroDeEmpleadoYProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("GESTION DE PROYECTOS Y EMPLEADOS");
        Controlador ctrl = new Controlador();
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("INGRESE UNA OPCIÓN:");
            System.out.println("1. REGISTRAR NUEVO EMPLEADO");
            System.out.println("2. REGISTRAR NUEVO PROYECTO");
            System.out.println("3. MOSTRAR EMPLEADOS REGISTRADOS");
            System.out.println("4. MOSTRAR PROYECTOS REGISTRADOS");
            System.out.println("5. ASIGNAR EMPLEADO A PROYECTO");
            System.out.println("6. BUSCAR EMPELADO POR ID");
            System.out.println("7. BUSCAR PROYECTO POR ID");
            System.out.println("8. MOSTRAR EMPLEADOS POR PROYECTO");
            System.out.println("9. SALIR");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    String id_empleado;
                    String cargo;
                    double salario;
                    String correo;
                    String nombre_empleado;
                    String apellido;
                    String tipo_doc;
                    String num_doc;
                    byte edad;

                    do {
                        System.out.println("Ingrese un ID para el empleado:");
                        id_empleado = sc.nextLine();
                    } while (id_empleado.isEmpty());

                    do {
                        System.out.println("Ingrese un CARGO para el empleado:");
                        cargo = sc.nextLine().toUpperCase();
                    } while (cargo.isEmpty());

                    while (true) {
                        System.out.println("Ingrese un SALARIO para el empleado:");
                        String input = sc.nextLine();

                        if (!input.isEmpty()) {
                            try {
                                salario = Double.parseDouble(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada no valida, se debe ingresar un numero.");
                            }
                        } else {
                            System.out.println("Debes ingresar un dato.");
                        }
                    }

                    do {
                        System.out.println("Ingrese el CORREO del empleado:");
                        correo = sc.nextLine();
                    } while (correo.isEmpty());

                    do {
                        System.out.println("Ingrese el NOMBRE del empleado:");
                        nombre_empleado = sc.nextLine();
                    } while (nombre_empleado.isEmpty());

                    do {
                        System.out.println("Ingrese el APELLIDO del empleado:");
                        apellido = sc.nextLine();
                    } while (apellido.isEmpty());

                    do {
                        System.out.println("Ingrese el TIPO DE DOCUMENTO del empleado: (DNI - PASAPORTE - ND)");
                        tipo_doc = sc.nextLine().toUpperCase();
                    } while (tipo_doc.isEmpty());

                    do {
                        System.out.println("Ingrese el NUMERO DE DOCUMENTO del empleado:");
                        num_doc = sc.nextLine();
                    } while (num_doc.isEmpty());

                    while (true) {
                        System.out.println("Ingrese la EDAD del empleado:");
                        String input = sc.nextLine();

                        if (!input.isEmpty()) {
                            try {
                                edad = Byte.parseByte(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada no valida, se debe ingresar un numero.");
                            }
                        } else {
                            System.out.println("Debes ingresar un dato.");
                        }
                    }
                    ctrl.RegistrarNuevoEmpleado(id_empleado, cargo, salario, correo, nombre_empleado, apellido, tipo_doc, num_doc, edad);

                    break;
                case "2":
                    String id_proyecto;
                    String nombre_proyecto;

                    do {
                        System.out.println("Ingrese un ID para el proyecto:");
                        id_proyecto = sc.nextLine();
                    } while (id_proyecto.isEmpty());

                    do {
                        System.out.println("Ingrese un NOMBRE para el proyecto:");
                        nombre_proyecto = sc.nextLine();
                    } while (nombre_proyecto.isEmpty());

                    ctrl.RegistrarNuevoProyecto(id_proyecto, nombre_proyecto);
                    break;
                case "3":
                    ctrl.ListarEmpleados();
                    break;
                case "4":
                    ctrl.ListarProyectos();
                    break;
                case "5":
                    String id_empleado_a_asignar;
                    String id_proyecto_destino;
                    do{
                        System.out.println("Ingrese el ID del empleado a asignar:");
                        id_empleado_a_asignar = sc.nextLine();
                    }while(id_empleado_a_asignar.isEmpty());
                    
                    do{
                        System.out.println("Ingrese el ID del cargo destino:");
                        id_proyecto_destino = sc.nextLine();
                    }while(id_proyecto_destino.isEmpty());
                    
                    ctrl.AsignarEmpleadoAProyectos(id_empleado_a_asignar, id_proyecto_destino);
                    break;
                case "6":
                    String id_empleado_a_buscar;
                    
                    do{
                        System.out.println("Ingrese el ID del empleado a buscar:");
                        id_empleado_a_buscar = sc.nextLine();
                    }while(id_empleado_a_buscar.isEmpty());
                    ctrl.BuscarEmpleadoPorId(id_empleado_a_buscar);
                    break;
                case "7":
                    String id_proyecto_a_buscar;
                    
                    do{
                        System.out.println("Ingrese el ID del proyecto a buscar:");
                        id_proyecto_a_buscar = sc.nextLine();
                    }while(id_proyecto_a_buscar.isEmpty());
                    ctrl.BuscarEmpleadoPorId(id_proyecto_a_buscar);
                    break;
                case "8":
                    String id_proyecto_a_mostrar_empleados;
                    
                    do{
                        System.out.println("Ingrese el ID del proyecto a mostrar sus empelados asignados:");
                        id_proyecto_a_mostrar_empleados = sc.nextLine();
                    }while(id_proyecto_a_mostrar_empleados.isEmpty());
                    ctrl.VerEmpleadosPorProyecto(id_proyecto_a_mostrar_empleados);
                    break;
                case "9":
                    System.out.println(">>> SALIENDO DEL PROGRAMA... <<<");
                    break;
                default:
                    break;
            }

        } while (opcion != "7");

    }

}
