/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaadministrativonetcax;
import java.util.ArrayList;

/**
 *
 * @author Edward
 */
public class ControladorContenido {
    private ArrayList<Audiovisual> listaContenido = new ArrayList();
    
    public void agregarAudiovisual(Audiovisual av){
        listaContenido.add(av);
    }
    
    public void listarAudiovisual() {
        for (Audiovisual av : listaContenido) {
            if (av instanceof Pelicula) {
                System.out.println("ID: " + av.getId() + " Nombre: " + av.getNombre() + " Idioma: " + av.getIdioma() + " Fecha Lanzamiento: " + ((Pelicula) av).getFechaLanzamiento());
            }
            if (av instanceof VideoMusical) {
                System.out.println("ID: " + av.getId() + " Nombre: " + av.getNombre() + " Idioma: " + av.getIdioma() + " Autor: " + ((VideoMusical) av).getAutor());
            }
        }
    }
    
    public void buscarAudiovisual(String id) {
        Audiovisual avaux = null;
        for (Audiovisual av : listaContenido) {
            if (av.getId().equals(id)) {
                avaux = av;
            }
        }
        if (avaux instanceof Pelicula) {
            Pelicula p = (Pelicula) avaux;
            p.verDatos();
            return;
        }
        if (avaux instanceof VideoMusical) {
            VideoMusical vm = (VideoMusical) avaux;
            vm.verDatos();
        }
    }
    
}
