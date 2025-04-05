package jd.piano.progama;

import jd.piano.teclas.Piano;
import jd.piano.teclas.Tecla;
import jd.piano.teclas.TeclaFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MultiPiano extends Piano {
    private List<PianoSencillo> pianos;

    public MultiPiano(int ti, int tf) {
        super();
        this.pianos = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            this.pianos.add(new PianoSencillo(ti, tf));
        }
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        if (canal >= 0 && canal < 16) {
            Tecla tecla1 = this.pianos.get(canal).getTecla(canal, nota);
            return tecla1;
        }
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
        int fila = 8;
        int columna = 2;
        for (int i = 0; i < 16; i++) {
            this.pianos.get(i).setPosicion(columna * fila, fila);
        }
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
