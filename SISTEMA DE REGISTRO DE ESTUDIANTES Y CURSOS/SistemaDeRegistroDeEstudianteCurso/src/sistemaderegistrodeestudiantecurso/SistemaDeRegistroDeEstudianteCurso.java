/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaderegistrodeestudiantecurso;

import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class SistemaDeRegistroDeEstudianteCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorEstudiantes ctrl = new ControladorEstudiantes();
        String input;
        String accion;
        boolean encontrado;

        do {
            System.out.println("Bienvenido Al Sistema de Gestion de Estudiantes y Cursos");
            System.out.println("<<Escoja la accion a realizar>>\n1. Registrar Estudiante\n2. Registrar Curso\n3. Asignar Estudiante A Curso\n"
                    + "4. Asignar Curso A Estudiante\n5. Mostrar Cursos Matriculados Por Estudiante\n6. Mostrar Estudiantes Matriculados Por Curso\n7. Salir");
            accion = sc.nextLine();
            switch (accion) {
                case "1":
                    System.out.println("REGISTRAR DATOS DE ESTUDIANTE:");
                    Estudiante e = new Estudiante();

                    // INGRESO DE ID DEL ESTUDIANTE //
                    do {
                        while (true) {
                            System.out.println("Ingrese el ID del estudiante:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                    } while (!ctrl.ValidarRepeticionIdEstudiante(input));
                    e.setId_estudiante(input);

                    // INGRESO DE NOMBRE DEL ESTUDIANTE //
                    while (e.getNombre() == null) {
                        while (true) {
                            System.out.println("Ingrese el NOMBRE del estudiante:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                        e.setNombre(input);
                    }

                    // INGRESO DE TIPO DE DOCUMENTO DEL ESTUDIANTE //
                    while (e.getTipo_doc() == null) {
                        while (true) {
                            System.out.println("Ingrese el TIPO DE DOCUMENTO del estudiante:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                        e.setTipo_doc(input.toUpperCase());
                    }

                    // INGRESO DE NUMERO DE DOCUMENTO DEL ESTUDIANTE //
                    while (e.getNum_doc() == null) {
                        while (true) {
                            System.out.println("Ingrese el NUMERO DE DOCUMENTO del estudiante:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                        if (ctrl.ValidarRepeticionNumeroDocumeto(input)) {
                            e.setNum_doc(input);
                        }
                    }

                    // INGRESO DE EDAD DEL ESTUDIANTE //
                    while (e.getEdad() == null) {
                        while (true) {
                            System.out.println("Ingrese la EDAD del estudiante:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                        e.setEdad(Byte.parseByte(input));
                    }
                    ctrl.AgregarEstudiante(e);
                    System.out.println("Estudiante Agregado Existosamente");
                    e.VerEstudiante();
                    e.VerCursosMatriculados();
                    break;

                case "2":
                    System.out.println("INGRESO DE DATOS DE CURSO:");
                    Curso c = new Curso();

                    // INGRESO DE ID DEL CURSO //
                    do {
                        while (true) {
                            System.out.println("Ingrese el ID del curso:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                    } while (!ctrl.ValidarRepeticionIdCurso(input));
                    c.setId_curso(input);

                    // INGRESO DE NOMBRE DEL CURSO //
                    while (c.getNombre_curso() == null) {
                        while (true) {
                            System.out.println("Ingrese el NOMBRE del curso:");
                            input = sc.nextLine();
                            if (!input.isEmpty()) {
                                break;
                            } else {
                                System.out.println("No ingresaste un dato...");
                            }
                        }
                        c.setNombre_curso(input);
                    }
                    ctrl.AgregarCurso(c);
                    System.out.println("Curso Agregado Existosamente");
                    c.VerCurso();
                    c.verEstudiantesMatriculados();
                    break;
                case "3":

                    System.out.println("ASIGNACION DE ESTUDIANTE A CURSO");
                    while (true) {
                        String input_estudiante;
                        String input_curso;

                        while (true) {
                            e = null;
                            encontrado = false;
                            System.out.println("Ingrese el ID del ESTUDIANTE a asignar:");
                            input_estudiante = sc.nextLine().toUpperCase();
                            if (!input_estudiante.isEmpty()) {
                                e = ctrl.BuscarEstudiantePorId(input_estudiante);
                                if (e == null) {
                                    System.out.println("ID de estudiante no encontrado...");
                                }
                                break;
                            }
                            if(e==null){break;}
                        }
                        if(e==null){break;}

                        while (true) {
                            c = null;
                            System.out.println("Ingrese el ID del CURSO:");
                            input_curso = sc.nextLine().toUpperCase();
                            if (!input_curso.isEmpty()) {
                                c = ctrl.BuscarCursoPorId(input_curso);
                                if (c == null) {
                                    System.out.println("ID de curso no encontrado...");
                                }
                                break;
                            }
                            if(c==null){break;}
                            
                        }
                        ctrl.AsignarEstudianteACurso(input_estudiante, e, c);
                        break;
                    }
                    break;
                case "4":
                    System.out.println("ASIGNACION DE CURSO A ESTUDIANTE");
                    while (true) {
                        String input_estudiante;
                        String input_curso;
                        while (true) {
                            c = null;
                            encontrado = false;
                            System.out.println("Ingrese el ID del CURSO a asignar:");
                            input_curso = sc.nextLine().toUpperCase();
                            if (!input_curso.isEmpty()) {
                                c = ctrl.BuscarCursoPorId(input_curso);
                                if (c == null) {
                                    System.out.println("ID de curso no encontrado...");
                                }
                                break;
                            }
                            if(c==null){break;}
                        }
                        if(c==null){break;}
                        while (true) {
                            e = null;
                            encontrado = false;
                            System.out.println("Ingrese el ID del ESTUDIANTE:");
                            input_estudiante = sc.nextLine().toUpperCase();
                            if (!input_estudiante.isEmpty()) {
                                e = ctrl.BuscarEstudiantePorId(input_estudiante);
                                if (e == null) {
                                    System.out.println("ID de curso no encontrado, ingrese uno valido...");
                                }
                                break;
                            }
                            if(e==null){break;}
                        }
                        ctrl.AsignarCursoAEstudiante(input_curso, e, c);
                        break;
                    }
                    break;
                case "5":
                    System.out.println("CURSOS MATRICULADOS POR ESTUDIANTE");
                    while (true) {
                        String input_estudiante;
                        
                        e = null;
                        encontrado = false;
                        System.out.println("Ingrese el ID del ESTUDIANTE:");
                        input_estudiante = sc.nextLine().toUpperCase();
                        if (!input_estudiante.isEmpty()) {
                            e = ctrl.BuscarEstudiantePorId(input_estudiante);
                            if (e == null) {
                                System.out.println("ID de estudiante no encontrado...");
                            }
                            break;
                        }
                        if(e==null){break;}
                    }
                    System.out.println("ESTUDIANTE:");
                    e.VerEstudiante();
                    System.out.println("CURSOS:");
                    e.VerCursosMatriculados();

                    break;
                case "6":
                    System.out.println("ESTUDIANTES MATRICULADOS POR CURSO");
                    while (true) {
                        
                        String input_curso;
                        c = null;
                        encontrado = false;
                        System.out.println("Ingrese el ID del CURSO a asignar:");
                        input_curso = sc.nextLine().toUpperCase();
                        if (!input_curso.isEmpty()) {
                            c = ctrl.BuscarCursoPorId(input_curso);
                            if (c == null) {
                                System.out.println("ID de curso no encontrado...");
                            }
                            break;
                        }
                        if(c==null){break;}
                        
                    }
                    System.out.println("CURSO:");
                    c.VerCurso();
                    System.out.println("ESTUDIANTES:");
                    c.verEstudiantesMatriculados();
                    break;
                case "7":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Accion no existente, pruebe con las acciones mostradas...");
            }
        } while (accion!="7");

    }

}
