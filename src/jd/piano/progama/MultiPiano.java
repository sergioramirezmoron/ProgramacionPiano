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
        Tecla tecla = null;
        if (canal >= 0 && canal < this.pianos.size()) {
            tecla = this.pianos.get(canal).getTecla(canal, nota);
        }
        return tecla;

    }

    @Override
    public void setPosicion(int x, int y) {
        for (int i = 0; i < this.pianos.size(); i++) {
            this.pianos.get(i).setPosicion(x, y);
        }
    }

    @Override
    public void setGraphics(Graphics g) {
        for (PianoSencillo p : this.pianos) {
            p.setGraphics(g);
        }
    }

    @Override
    public void dibujar() {
        for (PianoSencillo p : this.pianos) {
            p.dibujar();
        }
    }

    @Override
    public int getAnchura() {
        int ancho = this.pianos.get(0).getAnchura();
        return ancho * 2;
    }

    @Override
    public int getAltura() {
        int altoPiano = this.pianos.get(0).getAltura();
        return altoPiano * 8;
    }
}
