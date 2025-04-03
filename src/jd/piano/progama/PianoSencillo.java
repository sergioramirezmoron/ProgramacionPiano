package jd.piano.progama;

import jd.piano.teclas.Piano;
import jd.piano.teclas.Tecla;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;
    public PianoSencillo(int TeclaInicial, int TeclaFinal) {
        super(TeclaInicial, TeclaFinal);
        this.teclas = new HashMap<>();

        for (int i = TeclaInicial; i <= TeclaFinal; i++) {}
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
