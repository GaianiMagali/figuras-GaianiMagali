package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static org.testng.Assert.assertEquals;

public class TrianguloTest {
    Triangulo t1;
    FiguraAgujereada f1;
    DecimalFormat dosDigitos;

    @BeforeTest
    public void setUp() {
        t1 = new Triangulo("Azul",10.0,20.0);
        f1 = new FiguraAgujereada("Azul",t1);
        dosDigitos = new DecimalFormat("#.0");
    }

    @Test
    public void areaTriangulo() {
        Double area = t1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"100,0");
    }

    @Test
    public void trianguloAgujereado() {
        Double area = f1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"33,3");
    }

}
