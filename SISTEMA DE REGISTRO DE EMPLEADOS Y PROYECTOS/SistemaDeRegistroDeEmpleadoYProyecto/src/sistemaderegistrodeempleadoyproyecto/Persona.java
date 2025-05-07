/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistrodeempleadoyproyecto;

/**
 *
 * @author Edward
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String tipo_doc;
    protected String num_doc;
    protected byte edad;

    public Persona(String nombre, String apellido, String tipo_doc, String num_doc, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        if (tipo_doc == "DNI" || tipo_doc == "PASAPORTE" || tipo_doc == "ND") {
            this.tipo_doc = tipo_doc;
        }
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        switch (tipo_doc) {
            case "DNI":
                if (num_doc.length() == 8) {
                    this.num_doc = num_doc;
                } else {
                    System.out.println("El N° de DNI debe tener 8 digitos ");
                }
                break;
            case "PASAPORTE":
                if (num_doc.length() == 11) {
                    this.num_doc = num_doc;
                } else {
                    System.out.println("El N° de PASAPORTE debe tener 8 digitos ");
                }
                break;
            case "ND":
                this.num_doc = num_doc;
                break;

        }
        
        // OTRA FORMA DE ASIGNAR EL NUMERO DE DOCUMENTO
        /*if (tipo_doc == "DNI") {
            if (num_doc.length() == 8) {
                this.num_doc = num_doc;
            } else {
                System.out.println("El N° de DNI debe tener 8 digitos ");
            }
        } else if (tipo_doc == "PASAPORTE") {
            if (num_doc.length() == 11) {
                this.num_doc = num_doc;
            } else {
                System.out.println("El N° de PASAPORTE debe tener 8 digitos ");
            }
        } else{
            this.num_doc = tipo_doc;
        }
        */
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        //MOVER A MAIN
        if(edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if(edad>18){
            this.edad = edad;
            System.out.println("Edad correctamente asignada.");//MOVER A MAIN
        }else{
            System.out.println("Edad fuera del rango establecido. (18>=)");
        }        
    }
    
    public String VerDatos(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Tipo Docuemnto: " + this.tipo_doc 
                + " N° Documento: " + this.num_doc + " Edad: " + this.edad;
    } 
    
    

}
