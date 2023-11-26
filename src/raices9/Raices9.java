
package raices9;



import servicios.Servicios;

public class Raices9 {
    
    public static void main(String[] args) {

        Servicios ecuacion = new Servicios();
        ecuacion.cargarEcuacion();
        ecuacion.MostrarEcuacion();
        System.out.println("discriminante: " + ecuacion.getDiscriminante());
        System.out.println("Tiene raices: " + ecuacion.tieneRaices());
        System.out.println("Tiene raiz: " + ecuacion.tieneRaiz());
        ecuacion.calcularSoluciones();

    }


}
