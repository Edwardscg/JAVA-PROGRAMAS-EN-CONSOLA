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
public class Proyecto {
    private String id_proyecto;
    private String nombre_proyecto;
    private HashSet<Empleado> lista_empleados_asignados;
    
    Proyecto(String id_proyecto, String nombre_proyecto){
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public HashSet<Empleado> getLista_empleados_asignados() {
        return lista_empleados_asignados;
    }

    public void setLista_empleados(Empleado e) {
        this.lista_empleados_asignados.add(e);
    }
    
    public void VerLista_empleados() {
        byte num_empleados = 1;
        System.out.println("Empleados:");
        for(Empleado e: lista_empleados_asignados){
            System.out.println("Empleado N° " + num_empleados + ":");
            num_empleados+=1;
            e.VerDatos();
        }
    }
    
    public String VerDatos(){
        return "ID Proyecto: " + this.id_proyecto + " Nombre del Proyecto: " +this.nombre_proyecto;
    }
    
    
}
