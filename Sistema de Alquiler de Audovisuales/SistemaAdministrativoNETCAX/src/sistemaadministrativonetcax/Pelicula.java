/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;

/**
 *
 * @author Edward
 */
public class Pelicula extends Audiovisual{
    private String generoCinematrografico;
    private String sinopsis;
    private String fechaLanzamiento;

    public Pelicula(String generoCinematrografico, String sinopsis, String fechaLanzamiento, String id, String nombre, String duracion, String idioma) {
        super(id, nombre, duracion, idioma);
        this.generoCinematrografico = generoCinematrografico;
        this.sinopsis = sinopsis;
        this.fechaLanzamiento = fechaLanzamiento;
    }
    

    public String getGeneroCinematrografico() {
        return generoCinematrografico;
    }

    public void setGeneroCinematrografico(String generoCinematrografico) {
        this.generoCinematrografico = generoCinematrografico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    public void verDatos(){
        System.out.println("Nombre: " + this.nombre + " Sinopsis: " + this.sinopsis + " Fecha Lanzamiento: " + this.fechaLanzamiento);
    }
    
    
}
