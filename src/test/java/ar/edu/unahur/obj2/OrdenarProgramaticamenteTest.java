package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class OrdenarProgramaticamenteTest {
    Rectangulo rectangulo;
    Circulo circulo;
    Semicirculo semicirculo;
    Triangulo triangulo;



    @BeforeTest
    public void setUp() {
        rectangulo = new Rectangulo("Violeta", 10.0, 20.0);
        circulo = new Circulo("Amarillo", 10);
        semicirculo = new Semicirculo("Verde",10);
        triangulo = new Triangulo("Azul",10.0,20.0);
    }

    @Test
    public void ordenarProgramaticamente() {

        //List<Figura> figuras1 = Stream.of(rectangulo,circulo,triangulo,semicirculo).collect(Collectors.toList());
        //System.out.println(figuras);

        List<Figura> figuras = Stream.of(triangulo,semicirculo,rectangulo,circulo).collect(Collectors.toList());
        figuras.stream().map(f -> f.area()).sorted().forEach(System.out::println);

        //assertEquals();
    }


}















