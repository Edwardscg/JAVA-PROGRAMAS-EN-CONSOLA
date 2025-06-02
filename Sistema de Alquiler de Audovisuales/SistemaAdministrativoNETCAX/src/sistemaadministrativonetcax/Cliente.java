/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;

/**
 *
 * @author Edward
 */
public class Cliente {
    
    private String idCliente;
    private String nombre;
    private String tipoDoc;
    private String numDoc;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private String correo;

    public Cliente(String idCliente, String nombre, String tipoDoc, String numDoc, String apellido_paterno, String apellido_materno, String telefono, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        if (tipoDoc.equals("DNI") || tipoDoc.equals("CARNET DE EXTRANJERIA")) {
            this.tipoDoc = tipoDoc;
        } else {
            System.out.println("El tipo de documento no es correcto");
        }
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        if (tipoDoc.equals("DNI")) {
            if (numDoc.length() == 8) {
                this.numDoc = numDoc;
            } else {
                System.out.println("El DNI debe tener 8 dígitos");
            }
        } else if (tipoDoc.equals("CARNET DE EXTRANJERIA")) {
            if (numDoc.length() == 10) {
                this.numDoc = numDoc;
            } else {
                System.out.println("El Carnet de Extranjería debe tener 10 dígitos");
            }
        }
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    public void verDatos(){
        System.out.println("Id: " + this.idCliente + "\tNombre: " + this.nombre + "\tTipo de Documento: " + this.tipoDoc + "\tNumero de Documento: " + this.numDoc + "\tApellido Paterno: " + this.apellido_paterno + "\tApellido Materno: " + this.apellido_materno + "\tTelefono: " + this.telefono + "\tCorreo: " + this.correo);
    }
    
}
