
package DTO;

import java.util.Objects;

public class Feligres{
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estrato;
    private String estado;
    private String diezmo;
    private static Integer totalizar = 0;
    private int cont = 0;

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

    
    
    
    public Feligres(String cedula, String nombre, String direccion, String telefono, String estrato, String estado, String diezmo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
        this.diezmo=diezmo;

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

    public String getDiezmo(String estrato1) {
        
        
        switch(estrato1){
            case  "1":
                    diezmo = "250000";
                    break;
                    
            case  "2":
                    diezmo = "500000";
                    break;
                    
            case  "3":
                    diezmo = "1000000";
                    break;
        }
        return diezmo;
    }

    public void setDiezmo(String diezmo) {
        this.diezmo = diezmo;
    }

    public Integer getTotalizar() {
        return totalizar;
    }

    public void setTotalizar(Integer totalizar) {
        this.totalizar = totalizar;
    }

    /*public String pagarDiezmo() {
        
        StringBuffer sb = new StringBuffer("PAGOS DE DIEZMO IGLESIA SAGRADA FAMILIA\n");
        if(getEstado()== "Deudor"){
        cont++;
        totalizar = totalizar + Integer.valueOf(diezmo);
        sb.append("Feligres: " + nombre + " Pago: " + diezmo + " N° de pago:" + cont);
        this.setEstado("Cumplido");
        }else{
            sb.append("Esta al dia con la iglesia");
        }
        return sb.toString();

    }*/
    
}
