/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class CuentaAhorro extends ClienteCooperativa{
    private int noCuenta;
    private double montoTotalAdeudado;
    private double montoTotalPagado;
    private double saldoCuenta;
    private String banderaCuenta;

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getMontoTotalAdeudado() {
        return montoTotalAdeudado;
    }

    public void setMontoTotalAdeudado(double montoTotalAdeudado) {
        this.montoTotalAdeudado = montoTotalAdeudado;
    }

    public double getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(double montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta() {
        this.saldoCuenta = montoTotalPagado - montoTotalAdeudado;
    }

    public String getBanderaCuenta() {
        return banderaCuenta;
    }

    public void setBanderaCuenta(String banderaCuenta) {
        this.banderaCuenta = banderaCuenta;
    }
    
    public void datosPrincipales(){
        System.out.println("No cuenta: " + getNoCuenta()+" "+"Monto Adeudado: "+ getMontoTotalAdeudado()+
              " " +"Monto Pagado: "+ getMontoTotalPagado());
    }
    
    public void imprimirDatos(){
        System.out.println("Numero de Cuenta: " + getNoCuenta());
        System.out.println("Monto Total Adeudado: "+ getMontoTotalAdeudado());
        System.out.println("Monto Total Pagado: "+ getMontoTotalPagado());
        System.out.println("Saldo de Cuenta: "+ getSaldoCuenta());
        System.out.println("Bandera de Cuenta: "+ getBanderaCuenta());
    }
}
