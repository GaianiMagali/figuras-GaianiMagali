package ar.edu.unahur.obj2;

public class FiguraAgujereada extends Figura {
    private Figura figura;

    public FiguraAgujereada(String color, Figura figura) {
        super(color);
        this.figura = figura;
    }

    public Double area() {
        return figura.area()/3;
    }
}
