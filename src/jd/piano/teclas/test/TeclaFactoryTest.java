package jd.piano.teclas.test;

import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import jd.piano.teclas.ElementoVisual;
import jd.piano.teclas.ElementoVisualTester;
import jd.piano.teclas.Tecla;
import jd.piano.teclas.TeclaFactory;
import org.junit.Test;

import java.awt.*;
import java.io.Console;

import static org.junit.Assert.*;

public class TeclaFactoryTest {
    @Test
    public void test1(){
        Consola consola = new Consola();
        consola.getCapaFondo().setFondo(new FondoColorSolido(Color.GRAY));
        Graphics g = consola.getCapaCanvas().getGraphics();
        ElementoVisualTester elementoVisualTester = new ElementoVisualTester(g);

        for (int nota = 60; nota <= 64; nota++) {
            Tecla tecla = TeclaFactory.crearTecla(nota);

            elementoVisualTester.setElementoVisual(tecla);
            boolean resultado = elementoVisualTester.hacerPrueba();

            if (!resultado) {
                fail("Fallo en la prueba visual de la tecla número " + nota);
            }

            consola.getCapaCanvas().cls();
        }
    }


}