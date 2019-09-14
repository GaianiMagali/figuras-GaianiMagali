package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static org.testng.Assert.*;

public class RectanguloTest {
    Rectangulo r1;
    Rectangulo r2;
    Rectangulo r3;
    Rectangulo r4;
    FiguraAgujereada f1;
    DecimalFormat dosDigitos;

    @BeforeTest
    public void setUp() {
        r1 = new Rectangulo("Violeta",10.0,20.0);
        r2 = new Rectangulo("Violeta",10.0,20.0);
        f1 = new FiguraAgujereada("Azul",r1);
        dosDigitos = new DecimalFormat("#.0");
        r3 = new Rectangulo("Verde",10.0,20.0);
        r4 = new Rectangulo("Violeta",10.0,20.0);
    }

    @Test
    public void areaRectangulo() {
        Double area = r1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"200,0");
    }

    @Test
    public void rectanguloAgujereado() {
        Double area = f1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"66,7");
    }


    @Test
    public void compararObjetosIguales() {
        assertTrue(r1.equals(r2));
    }

    @Test
    public void compararObjetosDistintos() {
        assertFalse(r3.equals(r4));
    }

}
