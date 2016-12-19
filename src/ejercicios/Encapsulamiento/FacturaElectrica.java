/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class FacturaElectrica {
    private int noCuenta;
    private double lecturaActualM;
    private double lecturaAnteriorM;
    private double multiplicador;
    private double consumoMensual;
    private double consumoDiario;
    private double valorFactura;

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getLecturaActualM() {
        return lecturaActualM;
    }

    public void setLecturaActualM(double lecturaActualM) {
        this.lecturaActualM = lecturaActualM;
    }

    public double getLecturaAnteriorM() {
        return lecturaAnteriorM;
    }

    public void setLecturaAnteriorM(double lecturaAnteriorM) {
        this.lecturaAnteriorM = lecturaAnteriorM;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual() {
        this.consumoMensual = ((lecturaActualM - lecturaAnteriorM) * multiplicador)/30;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario() {
        this.consumoDiario = ((lecturaActualM - lecturaAnteriorM) * multiplicador)/720;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura() {
        this.valorFactura = consumoMensual * 0.20;
    }
    
    public void imprimirDatos(){
        System.out.println("Numero de cuenta: "+ getNoCuenta());
        System.out.println("Lectura actual del medidor: "+ getLecturaActualM());
        System.out.println("Lectura anterior del medidor: "+ getLecturaAnteriorM());
        System.out.println("Multiplicador: "+ getMultiplicador());
        System.out.println("Consumo Mensual: "+ getConsumoMensual());
        System.out.println("Consumo Diario: "+ getConsumoDiario());
        System.out.println("Valor Factura: "+ getValorFactura());        
    }
}
