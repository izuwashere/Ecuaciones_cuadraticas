

package entidad;



public class Entidad {
    
    private double a;
    private double b;
    private double c;

    public Entidad(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Entidad(){}

    // setters

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    // Getters

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

}
