/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

/**
 *
 * @author Reyes
 */
public class Empleado {
  private int noNit;
  private String apellidos;
  private String nombres;
  private String dirección;
  private double salarioDevengado;
  private double salarioDescuento;
  private char banderaEmpleado;

    public char getBanderaEmpleado() {
        return banderaEmpleado;
    }

    public void setBanderaEmpleado(char banderaEmpleado) {
        this.banderaEmpleado = banderaEmpleado;
    }

    public int getNoNit() {
        return noNit;
    }

    public void setNoNit(int noNit) {
        this.noNit = noNit;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String Nombres) {
        this.nombres = Nombres;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String Dirección) {
        this.dirección = Dirección;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioDescuento() {
        return salarioDescuento;
    }

    public void setSalarioDescuento() {
        this.salarioDescuento = salarioDevengado * 0.10;
    }
    
    public void nombreCompleto(){
        System.out.println("Nombre Completo: " + nombres +" "+ apellidos); 
    }

}
