/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;

/**
 *
 * @author Edward
 */
public class Alquiler {
    private String id;
    private String fechaInicio;
    private String fechaFin;
    private Cliente cliente;
    private Audiovisual audiovisual;
    private double costoServicio;

    public Alquiler(String id, String fechaInicio, String fechaFin, Cliente cliente, Audiovisual audiovisual, double costoServicio) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.audiovisual = audiovisual;
        this.costoServicio = costoServicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Audiovisual getAudiovisual() {
        return audiovisual;
    }

    public void setAudiovisual(Audiovisual audiovisual) {
        this.audiovisual = audiovisual;
    }

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }
    
    public void verDatos(){
        System.out.println("Id: " + this.id + " Fecha Inicio: " + this.fechaInicio + " Fecha Fin: " + this.fechaFin +" Cliente: " + this.cliente.getIdCliente() + " Costo: " + this.costoServicio);
    }
}
