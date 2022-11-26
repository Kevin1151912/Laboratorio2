
package DTO;

import java.util.Objects;
import javax.swing.JTextField;

public class Feligres{
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estrato;
    private String estado;
    private int diezmo;
    private int totalizar;
    private int cont;

    public Feligres() {
        
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado, int diezmo, int totalizar, int cont) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
        this.diezmo = diezmo;
        this.totalizar = totalizar;
        this.cont = cont;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDiezmo() {
        return diezmo;
    }
    
    public int validarDiesmo(String estrato1) {
        switch(estrato1){
            case  "1":
                    diezmo = 250000;
                    break;
                    
            case  "2":
                    diezmo = 500000;
                    break;
                    
            case  "3":
                    diezmo = 1000000;
                    break;
        }
        return diezmo;
    }

    public void setDiezmo(int diezmo) {
        this.diezmo = diezmo;
    }

    public int getTotalizar() {
        return totalizar;
    }

    public void setTotalizar(int totalizar) {
        this.totalizar = totalizar;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public int Pagar(String estado1){ 
         switch(estado1){
            case  "Duedor":
                    cont++;
                    totalizar += diezmo;
                    setEstado("Cumplid0");
                    break;
                    
            case  "Cumplido":
                    totalizar = totalizar;
                    System.out.println("Estas al Dia con la iglesia");
                    break;
         }
        return totalizar;
    }
        
    
    
}
