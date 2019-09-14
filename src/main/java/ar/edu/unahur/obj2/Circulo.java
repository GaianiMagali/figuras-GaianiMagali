package ar.edu.unahur.obj2;

public class Circulo extends Figura {

    private Integer radio;

    public Circulo(String color, Integer radio) {
        super(color);
        if (radio==null || radio<=0)
                throw new RuntimeException("Las dimensiones no pueden ser menores o iguales a 0 (cero)");
        else{
            this.radio = radio;
        }
    }

    public Double area() {
        return  Math.PI*Math.pow(radio,2);
    }

    public Double perimetro() {
        return 2*Math.PI*radio;
    }

    public Boolean regular() {
        return true;
    }




}

