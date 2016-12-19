/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class Factura {
    private int noFactura;
    private String nombreCliente;
    private int telefonoCliente;
    private String direccionCliente;
    private double montoTotal;
    private String banderaCliente;
    private double impuestoIva;

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getBanderaCliente() {
        return banderaCliente;
    }

    public void setBanderaCliente(String banderaCliente) {
        this.banderaCliente = banderaCliente;
    }

    public double getImpuestoIva() {
        return impuestoIva;
    }

    public void setImpuestoIva() {
        this.impuestoIva = montoTotal * 0.13;
    }
    
    public void datosPrincipales(){
        System.out.println("Nombre, telefono y direccion del cliente: "+ getNombreCliente()+"; "
                + getTelefonoCliente()+"; "+ getDireccionCliente());
    }
    
    public void imprimirDatos(){
        System.out.println("Numero de Factura: "+ getNoFactura());
        System.out.println("Nombre del cliente: "+ getNombreCliente());
        System.out.println("Telefono del cliente: "+ getTelefonoCliente());
        System.out.println("Direccion del cliente: "+ getDireccionCliente());
        System.out.println("Monto Total: "+ getMontoTotal());
        System.out.println("Bandera de cliente: "+ getBanderaCliente());
        System.out.println("Impuesto del IVA: "+ getImpuestoIva());
    }
    
    
}
