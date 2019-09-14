package ar.edu.unahur.obj2;

public class Rectangulo extends Figura {
    private Double base;
    private Double altura;

    public Rectangulo(String color, Double base, Double altura) {
        super(color);
        if ((base==null || base<=0) && (altura==null) || (altura<=0))
        throw new RuntimeException("Las dimensiones no pueden ser menores o iguales a 0 (cero)");
        else{
            this.base = base;
            this.altura = altura;
        }
    }

    public Double area() {
        return base * altura;
    }

    public Boolean regular() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo)) return false;
        Rectangulo that = (Rectangulo) o;
        return getColor().equals(that.getColor());

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
