/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;

/**
 *
 * @author Edward
 */
public abstract class Audiovisual {
    
    protected String id;
    protected String nombre;
    protected String duracion;
    protected String idioma;
    protected int desempeño;

    public Audiovisual(String id, String nombre, String duracion, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public Audiovisual(String id, String nombre, String duracion, String idioma, int desempeño) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.idioma = idioma;
        this.desempeño = desempeño;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(int desempeño) {
        this.desempeño = desempeño;
    }
    
    public abstract void verDatos();
    
}
