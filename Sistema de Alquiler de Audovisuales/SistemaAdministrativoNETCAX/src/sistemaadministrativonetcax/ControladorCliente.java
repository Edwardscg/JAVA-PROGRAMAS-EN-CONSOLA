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
public class ControladorCliente {
    private ArrayList<Cliente> listaCliente = new ArrayList();
    
    public void agregarCliente(Cliente c){
        listaCliente.add(c);
    }
    
    public void buscarCliente(String id){
        for(Cliente c: listaCliente){
            if(c.getIdCliente().equals(id)){
                System.out.println("Encontrado:");
                c.verDatos();
            }else{
                System.out.println("Cliente no existente.");
            }
        }
    }
    
    public void listarClientes(){
        for(Cliente c: listaCliente){
            c.verDatos();
        }
    }
    
    public void consultaUsuario(String id, String consulta){
        System.out.println("Id de Cliente: " + id + " Consulta: " + consulta);
        
    }
}
