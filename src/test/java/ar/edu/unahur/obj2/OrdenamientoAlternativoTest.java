package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class OrdenamientoAlternativoTest {
    Circulo circulo;
    Rectangulo rectangulo;
    Semicirculo semicirculo;
    Triangulo triangulo;
    Semicirculo semicirculo2;

    @BeforeTest
    public void setUp() {
        circulo = new Circulo("Amarillo",10);
        rectangulo = new Rectangulo("Azul",20.0,20.4);
        semicirculo = new Semicirculo("Rojo",20);
        semicirculo2 = new Semicirculo("Celeste",10);
        triangulo = new Triangulo("Verde",10.5,10.5);
    }


    @Test
    public void ordenamientoAlternativo1() {
        List<Figura> figuras = Arrays.asList(circulo,rectangulo,semicirculo,triangulo);

        List<Figura> figurasOrdenColor = figuras.stream()
                .sorted((f1,f2) -> f1.getColor().compareTo(f2.getColor()))
                .collect(Collectors.toList());

        figurasOrdenColor.stream().forEach(System.out::println);

        Assert.assertEquals(figurasOrdenColor.get(0), circulo);
        Assert.assertEquals(figurasOrdenColor.get(figuras.size()-1), triangulo);
    }

    @Test
    public void ordenamientoAlternativo2() {
        List<Figura> figuras = Arrays.asList(rectangulo,semicirculo,triangulo,circulo);

        Comparator<Figura> comparacion = Comparator.comparing(Figura::getColor);
        Collections.sort(figuras,comparacion);
        figuras.forEach(System.out::println);

        Assert.assertEquals(figuras.get(0), circulo);
        Assert.assertEquals(figuras.get(figuras.size()-1), triangulo);
    }

    @Test
    public void ordenamientoTipoArea() {
        List<Figura> figuras = Arrays.asList(rectangulo, semicirculo, triangulo, circulo,semicirculo2);

        Comparator<Figura> comparacion = Comparator.comparing(Figura::regular).thenComparing(Figura::area);
        Collections.sort(figuras, comparacion);
        figuras.forEach(System.out::println);
    }
    }
