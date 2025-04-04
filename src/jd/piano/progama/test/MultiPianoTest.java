package jd.piano.progama.test;

import jd.piano.progama.MultiPiano;
import jd.piano.teclas.ElementoVisualTester;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiPianoTest {
    @Test
    public void test1(){
        MultiPiano multiPiano = new MultiPiano(36, 72);
        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(multiPiano);
        assertFalse(elementoVisualTester.hacerPrueba());
        fail("hay que poner una barra roja");
    }

}