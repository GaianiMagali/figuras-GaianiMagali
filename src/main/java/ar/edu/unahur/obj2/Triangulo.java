package ar.edu.unahur.obj2;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(String color, Double base, Double altura) {
        super(color);

        if ((base==null || base<=0) && (altura==null) || (altura<=0))
            throw new RuntimeException("Las dimensiones no pueden ser menores o iguales a 0 (cero)");
        else {
            this.base = base;
            this.altura = altura;
        }
    }

    public Double area() {
        return (base * altura) / 2;
    }

    public Boolean regular() {
        return true;
    }
}
