/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Feligres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class FeligresDAO {
    
    public static void GuardarFeligres(Connection cn, DTO.Feligres f) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into feligres(cedula,nombre,direccion,telefono,estrato,estado) Values(?,?,?,?,?,?)");
            consulta.setString(1, f.getCedula());
            consulta.setString(2, f.getNombre());
            consulta.setString(3, f.getDireccion());
            consulta.setString(4, f.getTelefono());
            consulta.setString(5, f.getEstrato());
            consulta.setString(6, f.getEstado());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Feligres buscar(Connection cn,String cedula) throws SQLException{
        Feligres a =new Feligres();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select nombre as name , direccion as dir , telefono as tel, estrato as etr , estado as est from feligres where cedula='"+cedula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                a.setNombre(rs.getString("name"));
                a.setDireccion(rs.getString("dir"));
                a.setTelefono(rs.getString("tel"));
                a.setEstrato(rs.getString("etr"));
                a.setEstado(rs.getString("est"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return a;
    }
    
    public static void actualizar(Connection cn,String cedula, String nombre, String direccion, String telefono, String estrato, String estado) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE feligres set nombre='"+nombre+"' , direccion='"+direccion+"' ,telefono='"+telefono+"',estrato='"+estrato+"',estado='"+estado+"' where cedula='"+cedula+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,String cedula) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from feligres where cedula='"+cedula+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
    public static Feligres ConsultarDiezmo(Connection cn,String cedula) throws SQLException{
        Feligres f =new Feligres();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select estrato as etr from feligres where cedula='"+cedula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                f.setEstrato(rs.getString("etr"));
            }
           
        }catch(SQLException e){
            System.out.println("    Error Consulta");
            throw new SQLException(e);
        }
        return f;
    }
    
    public static Feligres TotalizarDiezmo(Connection cn,String cedula) throws SQLException{
        Feligres f =new Feligres();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select estrato as etr from feligres where cedula='"+cedula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                f.setEstrato(rs.getString("etr"));
            }
           
        }catch(SQLException e){
            System.out.println("    Error Consulta");
            throw new SQLException(e);
        }
        return f;
    }
    
    public static Feligres PagarDiezmo(Connection cn,String cedula) throws SQLException{
        Feligres f =new Feligres();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select estado as est from feligres where cedula='"+cedula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                f.setEstado(rs.getString("est"));
            }
           
        }catch(SQLException e){
            System.out.println("    Error Consulta");
            throw new SQLException(e);
        }
        return f;
    }
    
}
