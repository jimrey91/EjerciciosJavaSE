/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class ClienteCooperativa {
    private String noNit;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    public void imprimirAtributos(){
        System.out.println("Numero de Nit: "+ getNoNit());
        System.out.println("Nombre del Cliente: " + getNombreCliente());
        System.out.println("Direccion de Cliente: " + getDireccionCliente());
        System.out.println("Telefono de Cliente: " + getTelefonoCliente());
    }
}
