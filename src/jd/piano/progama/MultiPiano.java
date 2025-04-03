package jd.piano.progama;

import jd.piano.teclas.Piano;
import jd.piano.teclas.Tecla;
import jd.piano.teclas.TeclaFactory;

import java.awt.*;
import java.util.List;

public class MultiPiano extends Piano {
    private List<PianoSencillo> pianos;
    public MultiPiano(int ti, int tf){

    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return null;
    }

    @Override
    public void setPosicion(int x, int y) {

    }

    @Override
    public void setGraphics(Graphics g) {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public int getAnchura() {
        return 0;
    }

    @Override
    public int getAltura() {
        return 0;
    }
}
