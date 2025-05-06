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
public class ControladorEstudiantes {

    ArrayList<Estudiante> lista_estudiantes = new ArrayList();
    ArrayList<Curso> lista_cursos = new ArrayList();
    boolean encontrado;

    ControladorEstudiantes() {
        lista_estudiantes = new ArrayList();
        lista_cursos = new ArrayList();
    }

    public void AgregarEstudiante(Estudiante e) {
        lista_estudiantes.add(e);
    }

    public void AgregarCurso(Curso c) {
        lista_cursos.add(c);
    }

    public Estudiante BuscarEstudiantePorId(String id_estudiante_a_buscar) {
        for (Estudiante e : lista_estudiantes) {
            if (e.getId_estudiante().equals(id_estudiante_a_buscar)) {
                return e;
            }
            break;
        }
        return null;
    }

    public Curso BuscarCursoPorId(String id_curso_a_buscar) {
        for (Curso c : lista_cursos) {
            if (c.getId_curso().equals(id_curso_a_buscar)) {
                return c;
            }
            break;
        }
        return null;
    }

    public void AsignarEstudianteACurso(String id_estudiante_asignar, Estudiante e, Curso c) {
        if (c.getMax_estudiante() != 0) {
            c.MatricularEstudiante(e);
            c.setMax_estudiante();
        } else {
            System.out.println("Limite de estudiantes en este curso alcanzado...");
        }
        /*encontrado = false;
        for (Estudiante estudiante : lista_estudiantes) {
            if (estudiante.getId_estudiante().equals(id_estudiante_asignar)) {
                encontrado = true;
                if (c.getMax_estudiante() != 0) {
                    c.MatricularEstudiante(e);
                    c.setMax_estudiante();
                } else {
                    System.out.println("Limite de estudiantes en este curso alcanzado...");
                }
                break;
            } 
        }
        if(!encontrado){
            System.out.println("Id de estudiante inexistente, ingrese otro...");
        }*/
    }

    public void AsignarCursoAEstudiante(String id_curso_asignar, Estudiante e, Curso c) {
        encontrado = false;
        for (Curso cursos : lista_cursos) {
            if (cursos.getId_curso().equals(id_curso_asignar)) {
                encontrado = true;
                e.MatricularCurso(c);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Id de curso inexistente, ingrese otro...");
        }
    }

    public boolean ValidarRepeticionNumeroDocumeto(String num_doc_validar) {
        if (lista_estudiantes.isEmpty()) {
            return true;
        }
        for (Estudiante e : lista_estudiantes) {
            if (e.getNum_doc().equals(num_doc_validar)) {
                return false;
            }
        }
        return true;
    }

    public boolean ValidarRepeticionIdCurso(String id_curso_validar) {
        if (lista_cursos.isEmpty()) {
            return true;
        }
        for (Curso c : lista_cursos) {
            if (c.getId_curso().equals(id_curso_validar)) {
                return false;
            }
        }
        return true;
    }

    public boolean ValidarRepeticionIdEstudiante(String id_estudiante_validar) {

        if (lista_estudiantes.isEmpty()) {
            return true;
        }

        for (Estudiante e : lista_estudiantes) {

            if (e.getId_estudiante().equals(id_estudiante_validar)) {
                return false;
            }
        }
        return true;
    }
}
