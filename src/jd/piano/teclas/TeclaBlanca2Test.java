package jd.piano.teclas;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaBlanca2Test {
    @Test
    public void test1(){
        TeclaBlanca2 teclaBlanca = new TeclaBlanca2(62);
        teclaBlanca.setColorPulsado(Color.BLUE);

        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(teclaBlanca);
        assertFalse(elementoVisualTester.hacerPrueba());
        fail("No se deberia haber lanzado");
    }

}