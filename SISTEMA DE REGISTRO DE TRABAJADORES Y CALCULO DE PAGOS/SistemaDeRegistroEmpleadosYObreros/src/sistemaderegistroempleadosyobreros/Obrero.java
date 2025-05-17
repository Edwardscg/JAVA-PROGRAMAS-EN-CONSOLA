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
public class Obrero extends Trabajador {

    private YearMonth fecha_ingreso;
    private YearMonth fecha_actual;
    private int dias_asistidos;
    private double aguinaldo_julio = 0;
    private double aguinaldo_diciembre = 0;
    private double pago_mensual_neto = 0;
    public static final double pago_jornal = 80.0;

    public Obrero(YearMonth fecha_ingreso, String id_trabajador, String nombre, String apellido_paterno, String apellido_materno, String tipo_doc, String num_doc) {
        super(id_trabajador, nombre, apellido_paterno, apellido_materno, tipo_doc, num_doc);
        this.fecha_ingreso = fecha_ingreso;
    }

    public YearMonth getFecha_ingreso() {
        return fecha_ingreso;
    }

    public YearMonth getFecha_actual() {
        return fecha_actual;
    }

    public void setDias_asistidos(int dias_asistidos) {
        this.dias_asistidos = dias_asistidos;
    }

    public int getDias_asistidos() {
        return dias_asistidos;
    }

    public double getAguinaldo_julio() {
        return aguinaldo_julio;
    }

    public double getAguinaldo_diciembre() {
        return aguinaldo_diciembre;
    }

    public void CalcularPagoMensual() {
        this.pago_mensual_neto = pago_jornal * (int) getDias_asistidos();
    }

    public void CalcularAguinaldo(int[] meses_laborados) {

        if (meses_laborados[4] != 0) {
            this.aguinaldo_julio += 100;
        }
        if (meses_laborados[5] != 0) {
            this.aguinaldo_julio += 100;
        }
        if (meses_laborados[6] != 0) {
            this.aguinaldo_julio += 100;
        }

        if (meses_laborados[9] != 0) {
            this.aguinaldo_diciembre += 100;
        }
        if (meses_laborados[10] != 0) {
            this.aguinaldo_diciembre += 100;
        }
        if (meses_laborados[11] != 0) {
            this.aguinaldo_diciembre += 100;
        }
    }

    @Override
    public void VerDatos() {
        System.out.println("OBRERO: ID TRABAJADOR: " + this.id_trabajador + " PAGO POR JORNAL: " + pago_jornal + " NOMBRE: " + this.nombre + " APELLIDO PATERNO: " + this.apellido_paterno + " APELLIDO MATERNO: " + this.apellido_materno + " TIPO DOCUMENTO: " + this.tipo_doc + " NUMERO DOCUMENTO: " + this.num_doc + " FECHA INGRESO: " + this.fecha_ingreso);
    }

    public void VerSueldoNetoMensual() {
        System.out.println("OBRERO: ID: " + this.id_trabajador + " NOMBRE: " + this.nombre + " SUELDO NETO: " + this.pago_mensual_neto);
    }

}
