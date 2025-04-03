package jd.piano.progama.test;

import jd.piano.progama.PianoSencillo;
import jd.piano.teclas.ElementoVisualTester;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoSencilloTest {
    @Test
    public void test1(){
        PianoSencillo piano = new PianoSencillo(36, 72);
        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(piano);
        assertFalse(elementoVisualTester.hacerPrueba());
        fail("hay que poner una barra roja");
    }
    @Test
    public void test2(){
        PianoSencillo piano = new PianoSencillo(36, 48);
        assertEquals(100, piano.getAltura());
        assertEquals(325, piano.getAnchura());

    }

}