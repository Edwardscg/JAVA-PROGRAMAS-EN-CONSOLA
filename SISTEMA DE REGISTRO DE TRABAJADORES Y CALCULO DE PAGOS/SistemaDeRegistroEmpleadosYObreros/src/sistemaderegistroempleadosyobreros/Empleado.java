/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistroempleadosyobreros;
import java.time.YearMonth;
/**
 *
 * @author Edward
 */
public class Empleado extends Trabajador {
    private YearMonth fecha_ingreso;
    private YearMonth fecha_actual;
    private int inasistencias_1er_semestre;
    private int inasistencias_2do_semestre;
    private int inasistencias_este_mes;
    private double gratificacion_julio;
    private double gratificacion_diciembre;
    private double pago_mensual_neto = 0;
    public static final double sueldo_mensual = 1750.0;

    public Empleado(YearMonth fecha_ingreso, String id_trabajador, String nombre, String apellido_paterno, String apellido_materno, String tipo_doc, String num_doc) {
        super(id_trabajador, nombre, apellido_paterno, apellido_materno, tipo_doc, num_doc);
        this.fecha_ingreso = fecha_ingreso;
    }

    public YearMonth getFecha_ingreso() {
        return fecha_ingreso;
    }

    public YearMonth getFecha_actual() {
        return fecha_actual;
    }

    public int getInasistencias_1er_semestre() {
        return inasistencias_1er_semestre;
    }

    public void setInasistencias_1er_semestre(int inasistencias_1er_semestre) {
        this.inasistencias_1er_semestre = inasistencias_1er_semestre;
    }

    public int getInasistencias_2do_semestre() {
        return inasistencias_2do_semestre;
    }

    public void setInasistencias_2do_semestre(int inasistencias_2do_semestre) {
        this.inasistencias_2do_semestre = inasistencias_2do_semestre;
    }

    public void setInasistencias_este_mes(int inasistencias_este_mes) {
        this.inasistencias_este_mes = inasistencias_este_mes;
    }

    public int getInasistencias_este_mes() {
        return inasistencias_este_mes;
    }

    public double getGratificacion_julio() {
        return gratificacion_julio;
    }

    public double getGratificacion_diciembre() {
        return gratificacion_diciembre;
    }
    
    public void CalcularPagoMensual(){
        pago_mensual_neto = sueldo_mensual - (getInasistencias_este_mes()*(sueldo_mensual/30));
        
    }
   
    public void CalcularGratificacion(){
        this.gratificacion_julio = sueldo_mensual - ((double)inasistencias_1er_semestre*(sueldo_mensual/30));
        this.gratificacion_diciembre = sueldo_mensual - ((double)inasistencias_2do_semestre * (sueldo_mensual/30));
    }
    
    @Override
    public void VerDatos(){
        System.out.println("EMPLEADO: ID TRABAJADOR: "+ this.id_trabajador + " SUELDO MENSUAL: " + sueldo_mensual +" NOMBRE: " + this.nombre + " APELLIDO PATERNO: " + this.apellido_paterno + " APELLIDO MATERNO: " + this.apellido_materno+ " TIPO DOCUMENTO: " + this.tipo_doc + " NUMERO DOCUMENTO: " + this.num_doc+" FECHA INGRESO: " + this.fecha_ingreso);
    }
    
    public void VerSueldoNetoMensual() {
        System.out.println("EMPLEADO: ID: " + this.id_trabajador + " NOMBRE: " + this.nombre + " SUELDO NETO: " + this.pago_mensual_neto);
    }
}
