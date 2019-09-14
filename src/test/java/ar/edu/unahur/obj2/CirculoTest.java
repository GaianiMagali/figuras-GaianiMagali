package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static org.testng.Assert.assertEquals;

public class CirculoTest {

    Circulo c1;
    FiguraAgujereada f1;
    DecimalFormat dosDigitos;

    @BeforeTest
    public void setUp() {
         c1 = new Circulo("Amarillo",10);
         f1 = new FiguraAgujereada("Amarillo",c1);
         dosDigitos = new DecimalFormat("#.00");
}

    @Test
    public void areaCirculo() {
        Double area = c1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"314,16");

    }

    @Test
    public void circuloAgujereado() {
        Double area = f1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"104,72");

    }


}
