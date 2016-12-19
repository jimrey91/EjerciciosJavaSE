/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class Vehiculo {
    private String placaVehiculo;
    private String noMotor;
    private String noVin;
    private String color;
    private String estado;
    private double valor;
    private String banderaVehiculo;
    private double depreciacion;

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getNoMotor() {
        return noMotor;
    }

    public void setNoMotor(String noMotor) {
        this.noMotor = noMotor;
    }

    public String getNoVin() {
        return noVin;
    }

    public void setNoVin(String noVin) {
        this.noVin = noVin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBanderaVehiculo() {
        return banderaVehiculo;
    }

    public void setBanderaVehiculo(String banderaVehiculo) {
        this.banderaVehiculo = banderaVehiculo;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion() {
        this.depreciacion = valor / 5;
    }
    
}
