/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DAO.FeligresDAO;
import DTO.Feligres;
import Servicios.Conexion;


public class Control{
    
    private FeligresDAO fe = new FeligresDAO();
    
    public void Guardar(Feligres a) {

        try {

            fe.GuardarFeligres(Conexion.obtener(), a);
        } catch (Exception e) {

        }

    }
    
    public Feligres Consultar(String cedula) {

        try {
            return fe.ConsultarDiezmo(Conexion.obtener(), cedula);
        } catch (Exception e) {

        }
        return null;

    }
    
    /*public Feligres Totalizar(String cedula) {

        try {
            return fe.TotalizarDiezmo(Conexion.obtener(), cedula);
        } catch (Exception e) {

        }
        return null;

    }*/
    
    public Feligres Pagar(String cedula) {

        try {
            return fe.PagarDiezmo(Conexion.obtener(), cedula);
        } catch (Exception e) {

        }
        return null;

    }

    public void Actualizar(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            fe.actualizar(Conexion.obtener(), cedula, nombre, direccion, telefono, estrato, estado);
        } catch (Exception e) {

        }
        
    }
    
    public Feligres Buscar(String cedula) {
        
        try {
            return fe.buscar(Conexion.obtener(), cedula);
        } catch (Exception e) {

        }
        return null;
        
    }
    
    public void Eliminar(String cedula){
        
        try{
            //RegistrarProducto rp=new RegistrarProducto();
            fe.eliminar(Conexion.obtener(), cedula);
        }catch(Exception e){
            
        }
        
    }
    
}
