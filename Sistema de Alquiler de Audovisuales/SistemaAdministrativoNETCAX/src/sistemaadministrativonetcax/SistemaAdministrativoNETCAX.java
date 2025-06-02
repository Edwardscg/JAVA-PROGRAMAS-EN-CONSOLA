/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaadministrativonetcax;

import java.util.Scanner;

/**
 *
 * @author Edward
 */
public class SistemaAdministrativoNETCAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ControladorContenido conCon = new ControladorContenido();
        ControladorCliente conCli = new ControladorCliente();
        ControladorAlquiler conAlq = new ControladorAlquiler();
        
        Pelicula p1 = new Pelicula("Romance", "Nose de que trata", "Mañana", "1", "Titanic", "2 horas", "español");
        Pelicula p2 = new Pelicula("Romance", "Nose de que trata", "Mañana", "2", "Titanic", "2 horas", "español");

        VideoMusical vm1 = new VideoMusical("Panzer", "Easy e", "EazyE", "wasaaa", "2", "rap", "2 minutos", "ingles");
        VideoMusical vm2 = new VideoMusical("Panzer", "Easy e", "EazyE", "wasaaa", "1", "rap", "2 minutos", "ingles");
        
        conCon.agregarAudiovisual(p1);
        conCon.agregarAudiovisual(p2);
        conCon.agregarAudiovisual(vm1);
        conCon.agregarAudiovisual(vm2);
        
        Cliente c1 = new Cliente("1", "yo", "DNI", "88888888", "ddd", "ddd", "864893489", "Sabado@gmail.com");
        Cliente c2 = new Cliente("2", "yo", "DNI", "88888888", "ddd", "ddd", "864893489", "Sabado@gmail.com");

        conCli.agregarCliente(c1);
        conCli.agregarCliente(c2);
        
        Audiovisual av1 = (Audiovisual)p1;
        Alquiler a1 = new Alquiler("1", "hoy", "mañana", c1, av1, 20);
        
        conAlq.crearAlquiler(a1);
        conAlq.listarAlquiler();
        
        
    }
    
}
