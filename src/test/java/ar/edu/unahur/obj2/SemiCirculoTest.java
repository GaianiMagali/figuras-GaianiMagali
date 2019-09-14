package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static org.testng.Assert.assertEquals;

public class SemiCirculoTest {
    Semicirculo s1;
    DecimalFormat dosDigitos;

    @BeforeTest
    public void setUp() {
        s1 = new Semicirculo("Verde",10);
        dosDigitos = new DecimalFormat("#.00");
    }

    @Test
    public void areaSemiCirculo() {
        double area = s1.area().doubleValue();
        assertEquals(dosDigitos.format(area),"157,08");
    }
}
