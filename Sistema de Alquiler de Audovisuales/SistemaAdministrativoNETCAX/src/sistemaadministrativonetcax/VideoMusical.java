/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;

/**
 *
 * @author Edward
 */
public class VideoMusical extends Audiovisual{
    private String estilo;
    private String vocalista;
    private String autor;
    private String letra;

    public VideoMusical(String estilo, String vocalista, String autor, String letra, String id, String nombre, String duracion, String idioma) {
        super(id, nombre, duracion, idioma);
        this.estilo = estilo;
        this.vocalista = vocalista;
        this.autor = autor;
        this.letra = letra;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getVocalista() {
        return vocalista;
    }

    public void setVocalista(String vocalista) {
        this.vocalista = vocalista;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
    public void verDatos(){
        System.out.println("Nombre: " + this.nombre + " Autor: " + this.autor + " Letra: " + this.letra);
    }
    
}
