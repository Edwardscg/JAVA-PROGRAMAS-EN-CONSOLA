/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistrodeempleadoyproyecto;

/**
 *
 * @author Edward
 */
public class Empleado extends Persona {

    private String id_empleado;
    private String cargo;
    private double salario;
    private String correo;
    
    Empleado(String id_empleado, String cargo, double salario, String nombre_empleado, String apellido_empleado, String tipo_doc, String num_doc, byte edad, String correo){
        super(nombre_empleado, apellido_empleado, tipo_doc, num_doc, edad);
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.salario = salario;
        this.correo = correo;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if(correo.contains("@")){
            this.correo = correo;
        }else{
            System.out.println("Correo Invalido");
        }
        
    }
    
    

    @Override
    public String VerDatos() {
        return "ID Empleado: " + this.id_empleado + " Cargo: " + this.cargo + " Salario: " + this.salario + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " Tipo Docuemnto: " + this.tipo_doc
                + " N° Documento: " + this.num_doc + " Correo: " + this.correo + " Edad: " + this.edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado e = (Empleado) o;
        return this.id_empleado.equals(e.id_empleado);
    }
    
    @Override
    public int hashCode(){
        return id_empleado.hashCode();
    }

}
