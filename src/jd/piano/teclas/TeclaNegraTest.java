package jd.piano.teclas;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaNegraTest {
    @Test
    public void test1(){
        TeclaNegra teclaNegra = new TeclaNegra(61);
        teclaNegra.setColorPulsado(Color.BLUE);

        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(teclaNegra);
        assertFalse(elementoVisualTester.hacerPrueba());
        fail("No se deberia haber lanzado");
    }

}