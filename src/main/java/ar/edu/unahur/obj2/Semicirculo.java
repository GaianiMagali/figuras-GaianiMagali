package ar.edu.unahur.obj2;

public class Semicirculo extends Circulo{

    public Semicirculo(String color, Integer radio) {
        super(color, radio);
    }

    public Double area() {
        return super.area()/2;
    }

    public Boolean regular() {
        return false;
    }


}
