package ar.edu.unahur.obj2;

import org.testng.annotations.Test;


public class ValidacionTest {


    @Test(expectedExceptions = RuntimeException.class)
    public void dimensionInvalidaCirculo() {
        Circulo  circulo = new Circulo("amarillo",-10);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void dimensionInvalidaRectangulo() {
        Rectangulo  rectangulo = new Rectangulo("rosa",-10.0,0.0);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void dimensionInvalidaRectanguloSemicirculo() {
        Semicirculo  semicirculo = new Semicirculo("azul",0);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void dimensionInvalidaRectanguloTriangulo() {
        Triangulo triangulo = new Triangulo("naranja",0.0,0.0);
    }
}
