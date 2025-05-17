/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistroempleadosyobreros;

import java.text.DateFormatSymbols;
import java.time.YearMonth;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class ControladorTrabajador {

    private ArrayList<Trabajador> lista_trabajadores = new ArrayList();

    public ArrayList<Trabajador> getLista_trabajadores() {
        return lista_trabajadores;
    }

    public void RegistrarEmpleado(YearMonth fecha_ingreso, String id_trabajador, String nombre, String apellido_paterno, String apellido_materno, String tipo_doc, String num_doc) {
        Empleado e = new Empleado(fecha_ingreso, id_trabajador, nombre, apellido_paterno, apellido_materno, tipo_doc, num_doc);
        lista_trabajadores.add(e);
    }

    public void RegistrarObrero(YearMonth fecha_ingreso, String id_trabajador, String nombre, String apellido_paterno, String apellido_materno, String tipo_doc, String num_doc) {
        Obrero o = new Obrero(fecha_ingreso, id_trabajador, nombre, apellido_paterno, apellido_materno, tipo_doc, num_doc);
        lista_trabajadores.add(o);
    }

    public void ListarTrabajadores() {
        for (Trabajador t : lista_trabajadores) {
            if (t instanceof Empleado) {
                t.VerDatos();
            }
            if (t instanceof Obrero) {
                t.VerDatos();
            }
        }
    }

    public void BuscarTrabajadorPorIdParaMostrar(String id_trabajador_buscar) {
        Trabajador tr = null;
        for (Trabajador t : lista_trabajadores) {
            if (t.getId_trabajador().equals(id_trabajador_buscar)) {
                tr = t;
            }
        }
        if (tr instanceof Empleado) {
            Empleado e = (Empleado) tr;
            e.VerDatos();
            return;
        }
        if (tr instanceof Obrero) {
            Obrero o = (Obrero) tr;
            o.VerDatos();
        }
    }

    private Trabajador BuscarTrabajadorPorId(String id_trabajador_buscar) {
        for (Trabajador t : lista_trabajadores) {
            if (t.getId_trabajador().equals(id_trabajador_buscar)) {
                return t;
            }
        }
        return null;
    }

    private int[] SolicitarAsistenciaAnualObrero() {
        int[] meses_trabajados = new int[12];
        String[] meses = new DateFormatSymbols().getMonths();

        for (int i = 0; i < 12; i++) {
            meses_trabajados[i] = SistemaDeRegistroEmpleadosYObreros.AsistenciaPorMes(meses[i]);
        }
        return meses_trabajados;
    }

    public int[] SolicitarInasistenciaPorSemestreEmpleado() {
        int[] inasistencia_anual = new int[2];
        inasistencia_anual = SistemaDeRegistroEmpleadosYObreros.InasistenciaPorSemestre();
        return inasistencia_anual;
    }

    public void AsignarAguinaldoAObrero(String id_trabajador_aguinaldo) {
        Trabajador t = BuscarTrabajadorPorId(id_trabajador_aguinaldo);
        if (t != null && t instanceof Obrero o) {
            int[] asistencia_anual = SolicitarAsistenciaAnualObrero();
            o.CalcularAguinaldo(asistencia_anual);
            System.out.println("AGUINALDO JULIO: \n" + o.getAguinaldo_julio());
            System.out.println("AGUINALDO DICIEMBRE: \n " + o.getAguinaldo_diciembre());
        } else {
            System.out.println("OBRERO NO ENCONTRADO EN REGISTROS");
        }
    }

    public void AsignarGratificacionAEmpleado(String id_empleado_gratificación) {
        Trabajador t = BuscarTrabajadorPorId(id_empleado_gratificación);
        if (t != null && t instanceof Empleado e) {
            int[] inasistencia_semestral = SistemaDeRegistroEmpleadosYObreros.InasistenciaPorSemestre();
            e.setInasistencias_1er_semestre(inasistencia_semestral[1]);
            e.setInasistencias_2do_semestre(inasistencia_semestral[2]);
            e.CalcularGratificacion();
            System.out.println("GRATIFICACION JULIO: \n" + e.getGratificacion_julio());
            System.out.println("GRATIFICACION DICIEMBRE: \n" + e.getGratificacion_diciembre());

        } else {
            System.out.println("EMPLEADO NO ENCONTRADO EN REGISTROS");
        }
    }

    public void CalcularSueldoDelMes(String id_trabajador, int asistencia) {
        Trabajador t = BuscarTrabajadorPorId(id_trabajador);
        if (t instanceof Empleado e) {
            e.setInasistencias_este_mes(asistencia);
            e.CalcularPagoMensual();
            e.VerSueldoNetoMensual();
            return;
        }
        if (t instanceof Obrero o) {
            o.setDias_asistidos(asistencia);
            o.CalcularPagoMensual();
            o.VerSueldoNetoMensual();
        }
    }

    public void CalcularPagoDelAñoDeTrabajador(String id_trabajador) {
        Trabajador t = BuscarTrabajadorPorId(id_trabajador);
        if (t != null) {
            if (t instanceof Obrero o) {

            } else if (t instanceof Empleado e) {

            }
        } else {
            System.out.println("TRABAJADOR NO ENCONTRADO");
        }
    }
}
