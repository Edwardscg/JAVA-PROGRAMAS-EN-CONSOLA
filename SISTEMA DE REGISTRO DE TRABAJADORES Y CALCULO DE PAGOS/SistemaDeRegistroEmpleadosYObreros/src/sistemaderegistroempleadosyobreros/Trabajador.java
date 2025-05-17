/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistroempleadosyobreros;

/**
 *
 * @author Edward
 */
public class Trabajador {
    protected String id_trabajador;
    protected String nombre;
    protected String apellido_paterno;
    protected String apellido_materno;
    protected String tipo_doc;
    protected String num_doc;

    public Trabajador(String id_trabajador, String nombre, String apellido_paterno, String apellido_materno, String tipo_doc, String num_doc) {
        this.id_trabajador = id_trabajador;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
    }

    public String getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(String id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        if(tipo_doc.equals("DNI") || tipo_doc.equals("PASAPORTE")){
           this.tipo_doc = tipo_doc;
        }else {
            System.out.println("TIPO DE DOCUMENTO NO EXISTENTE.");
        }       
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        if(tipo_doc.equals("DNI")){
            if(num_doc.length()==8){
                this.num_doc = num_doc;
                return;
            }else{
                System.out.println("CANTIDAD DE DIGITOS INCORRECTOS.");
            }
        }
        if(tipo_doc.equals("PASAPORTE")){
            if(num_doc.length()==11){
                this.num_doc = num_doc;
            }else{
                System.out.println("CANTIDAD DE DIGITOS INCORRECTOS.");
            }
        } 
    }
    
    public void VerDatos(){
        System.out.println("PERSONA: NOMBRE: " + this.nombre + " APELLIDO PATERNO: " + this.apellido_paterno + " APELLIDO MATERNO: " + this.apellido_materno+ " TIPO DOCUMENTO: " + this.tipo_doc + " NUMERO DOCUMENTO: " + this.num_doc);
    }
}
