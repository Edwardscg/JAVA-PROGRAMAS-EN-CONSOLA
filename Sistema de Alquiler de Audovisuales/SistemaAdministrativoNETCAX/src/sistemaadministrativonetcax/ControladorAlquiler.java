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
public class ControladorAlquiler {
    private ArrayList<Alquiler> listaAlquiler = new ArrayList();
    
    public void crearAlquiler(Alquiler a){
        listaAlquiler.add(a);
    }
    
    public void listarAlquiler(){
        for(Alquiler a: listaAlquiler){
            a.verDatos();
        }
    }
    
    public void buscarAlquilerPorCliente(String idCliente){
        for(Alquiler a: listaAlquiler){
            if(a.getCliente().getIdCliente().equals(idCliente)){
                System.out.println("Cliente Encontrado:");
                a.verDatos();
            }
        }
    }
}
