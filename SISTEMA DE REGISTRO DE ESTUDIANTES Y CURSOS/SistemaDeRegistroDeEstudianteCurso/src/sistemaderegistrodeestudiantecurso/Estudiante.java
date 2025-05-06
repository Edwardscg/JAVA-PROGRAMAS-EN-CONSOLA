/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistrodeestudiantecurso;

import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class Estudiante {

    private String id_estudiante;
    private String nombre;
    private String tipo_doc;
    private String num_doc;
    private Byte edad;
    private ArrayList<Curso> cursos_matriculados;

    Estudiante() {
        this.cursos_matriculados = new ArrayList();
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        if (tipo_doc.equals("DNI") || tipo_doc.equals("PASAPORTE")) {
            this.tipo_doc = tipo_doc;
        } else {
            System.out.println("Tipo de Documento no existente...");
        }
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        if (tipo_doc.equals("DNI")) {
            if (num_doc.length() == 8) {
                this.num_doc = num_doc;
            } else {
                System.out.println("El numero de DNI debe tener 8 digitos... ");
            }
        } else {
            if (num_doc.length() == 11) {
                this.num_doc = num_doc;
            } else {
                System.out.println("El numero PASAPORTE debe tener 11 digitos...");
            }
        }
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad >= 17 && edad <= 60) {
            this.edad = edad;
        } else {
            System.out.println("Edad no valida (17 a 60 años)");
        }
    }

    public void MatricularCurso(Curso c) {
        this.cursos_matriculados.add(c);
    }

    public void VerCursosMatriculados() {
        if (!cursos_matriculados.isEmpty()) {
            for (Curso c : cursos_matriculados) {
                c.VerCurso();
            }
        } else {
            System.out.println("Cursos aun no matriculados...");
        }

    }

    public void VerEstudiante() {
        System.out.println("Id: " + this.id_estudiante + "\tNombre: " + this.nombre + "\tTipo de Documento: " + this.tipo_doc + "\tNumero de Documento:" + this.num_doc + "\tEdad:" + this.edad);
    }

}
