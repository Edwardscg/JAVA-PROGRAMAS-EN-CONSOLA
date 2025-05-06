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
public class Curso {
    private String id_curso;
    private String nombre_curso;
    private int max_estudiante = 5;
    private ArrayList<Estudiante> estudiantes_matriculados;
    
    Curso(){
        this.estudiantes_matriculados = new ArrayList();   
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        if(id_curso.length()==6){
            this.id_curso = id_curso;
        }else {
            System.out.println("El id de curso debe tener 6 digitos...");
        }
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getMax_estudiante() {
        return max_estudiante;
    }

    public void setMax_estudiante() {
        this.max_estudiante -=1;
    }
    
    public void MatricularEstudiante(Estudiante e){
        this.estudiantes_matriculados.add(e);
    }
    
    public void verEstudiantesMatriculados(){
        for(Estudiante e:estudiantes_matriculados){
            e.VerEstudiante();
        }
    }
    
    public void VerCurso(){
        System.out.println("\tId: " + this.id_curso + "\tNombre: " + this.nombre_curso);
    }
    
    
}
