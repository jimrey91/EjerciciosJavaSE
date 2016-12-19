package ejercicios.ClasesObjetos;

/**
 *
 * @author Reyes
 */
public class Casa {
    String numeroCasa = "A15";
    int numeroPasaje = 10;
    String nombreCalle = "Calle Sisimiles";
    
    public void imprimirCasa(){
        System.out.println("Numero de Casa: " + numeroCasa);
        System.out.println("Numero de Pasaje: " + numeroPasaje);
        System.out.println("Nombre de Calle: " + nombreCalle);
    }
    
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.imprimirCasa();
        
    }
    
}
