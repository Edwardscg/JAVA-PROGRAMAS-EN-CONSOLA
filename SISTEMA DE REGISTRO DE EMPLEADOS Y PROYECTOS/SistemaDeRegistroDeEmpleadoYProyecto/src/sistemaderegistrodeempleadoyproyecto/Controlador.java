/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistrodeempleadoyproyecto;

import java.util.HashSet;

/**
 *
 * @author Edward
 */
public class Controlador {

    private HashSet<Empleado> lista_empleados_registrados;
    private HashSet<Proyecto> lista_proyectos_registrados;

    public void RegistrarNuevoEmpleado(String id_empleado, String cargo, double salario, String correo, String nombre_empleado, String apellido_empleado, String tipo_doc, String num_doc, byte edad) {
        Empleado e = new Empleado(id_empleado, cargo, salario, nombre_empleado, apellido_empleado, tipo_doc, num_doc, edad, correo);
        lista_empleados_registrados.add(e);
    }

    public void RegistrarNuevoProyecto(String id_proyecto, String nombre_proyecto) {
        Proyecto p = new Proyecto(id_proyecto, nombre_proyecto);
        lista_proyectos_registrados.add(p);
    }

    public void ListarEmpleados() {
        byte num_empleados = 1;
        if (!lista_empleados_registrados.isEmpty()) {
            System.out.println("Empleados:");
            for (Empleado e : lista_empleados_registrados) {
                System.out.println("Empleado N° " + num_empleados + ":");
                num_empleados += 1;
                e.VerDatos();
            }
        } else {
            System.out.println("Aun no hay empleados en nuestros registros.");
        }

    }

    public void ListarProyectos() {
        byte num_proyectos = 1;
        if (!lista_proyectos_registrados.isEmpty()) {
            System.out.println("Proyectos en Progreso:");
            for (Proyecto p : lista_proyectos_registrados) {
                System.out.println("Proyecto N° " + num_proyectos + ":");
                num_proyectos += 1;
                p.VerDatos();
            }
        } else {
            System.out.println("Aun no hay proyectos en nuestros registros.");
        }

    }

    public void AsignarEmpleadoAProyectos(String id_empleado_asignado, String id_proyecto) {
        Empleado e = null;
        Proyecto p = null;
        if (lista_empleados_registrados.isEmpty()) {
            System.out.println("No hay empleados disponibles");
            return;
        }

        for (Empleado empleado : lista_empleados_registrados) {
            if (empleado.getId_empleado().equals(id_empleado_asignado)) {
                e = empleado;
            }

        }

        for (Proyecto proyecto : lista_proyectos_registrados) {
            if (proyecto.getId_proyecto().equals(id_proyecto)) {
                p = proyecto;
            }
        }
        p.setLista_empleados(e);
    }

    public void VerEmpleadosPorProyecto(String id_proyecto) {
        if (!lista_empleados_registrados.isEmpty() || !lista_proyectos_registrados.isEmpty()) {
            for (Proyecto p : lista_proyectos_registrados) {
                if (!p.getLista_empleados_asignados().isEmpty()) {
                    p.VerDatos();
                    p.VerLista_empleados();
                } else {
                    System.out.println("No hay empleados asignados a este proyecto.");
                }
            }
        }else if(lista_proyectos_registrados.isEmpty()){
            System.out.println("Aun no hay PROYECTOS en nuestro registro");
            System.out.println("<<< Recuerde primero REGISTRAR EMPLEADOS Y PROYECTOS >>>");
        }
    }

    public void BuscarEmpleadoPorId(String id_empleado_a_buscar) {
        boolean encontrado = false;
        for (Empleado e : lista_empleados_registrados) {
            if (e.getId_empleado().equals(id_empleado_a_buscar)) {
                e.VerDatos();
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Empleado no existente en nuestros registros.");
        }
    }

    public void BuscarProyectoPorId(String id_proyecto_a_buscar) {
        boolean encontrado = false;
        for (Proyecto p : lista_proyectos_registrados) {
            if (p.getId_proyecto().equals(id_proyecto_a_buscar)) {
                p.VerDatos();
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Proyecto no existente en nuestros registros.");
        }
    }

}
