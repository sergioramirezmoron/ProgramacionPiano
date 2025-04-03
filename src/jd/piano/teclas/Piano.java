package jd.piano.teclas;

import javax.swing.text.Position;
import java.awt.*;

public abstract class Piano implements ElementoVisual {
    private int teclaFinal;
    private int teclaInicial;
    private Position posicion;
    private Graphics graphics;

    public Piano() {
        this.teclaInicial = 0;
        this.teclaFinal = 0;
        this.posicion = null;
        this.graphics = null;
    }

    public abstract Tecla getTecla(int canal, int nota);

    public int getTeclaFinal() {
        return teclaFinal;
    }

    public int getTeclaInicial() {
        return teclaInicial;
    }
}


