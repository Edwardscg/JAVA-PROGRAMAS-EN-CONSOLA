/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaderegistroempleadosyobreros;

import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class SistemaDeRegistroEmpleadosYObreros {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ControladorTrabajador ctrl = new ControladorTrabajador();
        System.out.println("<<<SISTEMA DE REGISTRO, GESTION DE SUELDOS DE TRABAJADORES>>>");
        String accion = "";
        String input = "";
        String tipo_tra;
        do {
            System.out.println("SELECCIONA LA ACCION A REALIZAR:");
            System.out.println("1. REGISTRAR TRABAJADOR");
            System.out.println("2. LISTAR TRABAJADORES");
            System.out.println("3. BUSCAR TRABAJADOR POR ID");
            System.out.println("4. ASIGNAR AGUINALDO A OBRERO");
            System.out.println("5. ASIGNAR GRATIFICACION A EMPLEADO");
            System.out.println("6. CALCULAR SUELDO DEL MES");
            System.out.println("0. Salir");

            accion = sc.nextLine();

            switch (accion) {
                case "1":
                    YearMonth fecha_ingreso;
                    String id_trabajador;
                    String nombre;
                    String apellido_paterno;
                    String apellido_materno;
                    String tipo_doc;
                    String num_doc;

                    System.out.println("INGRESO DE DATOS DE TRABAJADOR:");

                    do {
                        System.out.println("INGRESE EL TIPO DE TRABAJADOR A REGISTRAR: (EMPLEADO / OBRERO)");
                        tipo_tra = sc.nextLine().toUpperCase();
                    } while (tipo_tra.isEmpty() || tipo_tra.equals("EMPLEADO") && tipo_tra.equals("OBRERO"));

                    while (true) {
                        do {
                            System.out.println("INGRESE UN ID PARA EL " + tipo_tra + ":");
                            id_trabajador = sc.nextLine();
                        } while (id_trabajador.isEmpty());

                        do {
                            System.out.println("INGRESE EL NOMBRE:");
                            nombre = sc.nextLine();
                        } while (nombre.isEmpty());

                        do {
                            System.out.println("INGRESE EL APELLIDO PATERNO:");
                            apellido_paterno = sc.nextLine();
                        } while (apellido_paterno.isEmpty());

                        do {
                            System.out.println("INGRESE EL APELLIDO MATERNO:");
                            apellido_materno = sc.nextLine();
                        } while (apellido_materno.isEmpty());

                        do {
                            System.out.println("INGRESE SU TIPO DE DOCUMENTO:");
                            tipo_doc = sc.nextLine();
                        } while (tipo_doc.isEmpty());

                        do {
                            System.out.println("INGRESE EL NUMERO DE DOCUMENTO:");
                            num_doc = sc.nextLine();
                        } while (num_doc.isEmpty());

                        while (true) {
                            System.out.println("INGRESE LA FECHA DE INGRESO DEL  " + tipo_tra + ": (YYYY-MM)");
                            input = sc.nextLine();
                            try {
                                fecha_ingreso = YearMonth.parse(input);
                                break;
                            } catch (Exception e) {
                                System.out.println("FORMATO ERRONEO, EJEMPLO: 2004-12");
                            }
                        }
                        if (tipo_tra == "EMPLEADO") {
                            System.out.println("<<<EMPLEADO REGISTRADO EXITOSAMENTE>>>");
                            ctrl.RegistrarEmpleado(fecha_ingreso, id_trabajador, nombre, apellido_paterno, apellido_materno, tipo_doc, num_doc);
                        } else {
                            System.out.println("<<<OBRERO REGISTRADO EXITOSAMENTE>>>");
                        }
                        break;
                    }
                    break;
                case "2":
                    if (!ctrl.getLista_trabajadores().isEmpty()) {
                        System.out.println("TRABAJADORES REGISTRADOS EN LA EMPRESA:");
                        ctrl.ListarTrabajadores();
                    } else {
                        System.out.println("AUN NO SE HA REGISTRADO TRABAJADORES");
                    }
                    break;
                case "3":
                    do {
                        System.out.println("INGRESE EL ID DEL TRABAJADOR A BUSCAR:");
                        input = sc.nextLine();
                    } while (input.isEmpty());
                    if (!ctrl.getLista_trabajadores().isEmpty()) {
                        System.out.println("TRABAJADORES REGISTRADOS EN LA EMPRESA:");
                        ctrl.BuscarTrabajadorPorIdParaMostrar(input);
                    } else {
                        System.out.println("AUN NO SE HA REGISTRADO TRABAJADORES");
                    }
                    break;
                case "4":
                    do {
                        System.out.println("INGRESE EL ID DEL OBRERO PARA ASIGNAR SU AGUINALDO: ");
                        input = sc.nextLine();
                    } while (input.isEmpty());
                    ctrl.AsignarAguinaldoAObrero(input);
                    break;
                case "5":
                    do {
                        System.out.println("INGRESE EL ID DEL EMPLEADO PARA ASIGNAR SU GRATIFICACION:");
                        input = sc.nextLine();
                    } while (input.isEmpty());
                    ctrl.AsignarGratificacionAEmpleado(input);
                    break;
                case "6":
                    String id_trabajador_sueldo;
                    int asistencia;
                    do {
                        System.out.println("INGRESE EL TIPO DE TRABAJADOR A REGISTRAR: (EMPLEADO / OBRERO)");
                        tipo_tra = sc.nextLine().toUpperCase();
                    } while (tipo_tra.isEmpty() || tipo_tra.equals("EMPLEADO") && tipo_tra.equals("OBRERO"));

                    do {
                        System.out.println("INGRESE EL ID DEL TRABAJADOR PARA CALCULAR SU SUELDO DEL MES:");
                        id_trabajador_sueldo = sc.nextLine();
                    } while (id_trabajador_sueldo.isEmpty());

                    if (tipo_tra.equals("EMPLEADO")) {
                        do {
                            System.out.println("INGRESE LA CANTIDAD DE DIAS FALTADOS ESTE MES:");
                            input = sc.nextLine();
                        } while (input.isEmpty());
                        try{
                            asistencia = Integer.parseInt(input);
                            System.out.println("SUELDO DE ESTE MES DEL EMPLEADO:");
                            ctrl.CalcularSueldoDelMes(id_trabajador_sueldo, asistencia);
                        }catch(NumberFormatException n){
                            System.out.println("INGRESE NO VALIDO, INGRESE UN NUMERO ENTERO");
                        }
                    } else {
                        do{
                            System.out.println("INGRESE LA CANTIDAD DE DIAS ASISTIDOS ESTE MES:");
                            
                        }while(input.isEmpty());
                        try{
                            asistencia = Integer.parseInt(input);
                            System.out.println("SUELDO DE ESTE MES DEL EMPLEADO:");
                            ctrl.CalcularSueldoDelMes(id_trabajador_sueldo, asistencia);
                            
                        }catch(NumberFormatException n){
                            System.out.println("INGRESE NO VALIDO, INGRESE UN NUMERO ENTERO");
                        }
                    }
                    break;
                case "0":
                    System.out.println("SALIENDO DEL PROGRAMA");
                    break;
                default:
                    System.out.println("ACCION NO ENCONTRADA");
                    break;
            }

        } while (accion.equals("0"));
    }

    public static int AsistenciaPorMes(String mes) {
        while (true) {
            System.out.println(mes.toUpperCase() + ":");
            System.out.println("INGRESE 1 PARA MES ASISTIDO / 0 PARA MES NO ASISTIDO:");
            String input = sc.nextLine();
            if (!input.isEmpty()) {
                try {
                    int asistencia = Integer.parseInt(input);
                    if (asistencia == 1 || asistencia == 0) {
                        return asistencia;
                    } else {
                        System.out.println("EL DATO INGRESADO ES INCORRECTO: (1 / 0)");
                    }
                } catch (NumberFormatException n) {
                    System.out.println("DATO NO VALIDO, INGRESE UN NUMERO");
                }

            } else {
                System.out.println("ENTRADA VACIA, INGRESE UN DATO");
            }
        }
    }

    public static int[] InasistenciaPorSemestre() {
        int[] inasistencias = new int[2];
        for (int i = 0; i < 2; i++) {
            while (true) {
                System.out.println("INGRESE SU NUMERO DE INASISTENCIAS EN EL PRIMER SEMESTRE:");
                String input = sc.nextLine();
                if (!input.isEmpty()) {
                    try {
                        int inasistencia = Integer.parseInt(input);
                        inasistencias[i] = inasistencia;

                    } catch (NumberFormatException n) {
                        System.out.println("DATO NO VALIDO, INGRESE UN NUMERO");
                    }
                } else {
                    System.out.println("ENTRADA VACIA, INGRESE UN DATO");
                }
            }
        }
        return inasistencias;
    }

}
