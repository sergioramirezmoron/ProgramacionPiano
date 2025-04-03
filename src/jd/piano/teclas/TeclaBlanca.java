package jd.piano.teclas;

import java.awt.*;

public abstract class TeclaBlanca extends Tecla{
    public static final int ANCHURA = 25;
    public static final int ALTURA = 100;
    TeclaBlanca(int n) {
        super(n);
    }

    @Override
    public Color getColorNoPulsado() {
        return Color.WHITE;
    }

    @Override
    public int getAltura() {
        return this.ALTURA;
    }

    @Override
    public int getAnchura() {
        return this.ANCHURA;
    }

    @Override
    protected int[] getVerticesX(){
        throw new UnsupportedOperationException("Sin programar");
    }

    @Override
    protected int[] getVerticesY() {
        throw new UnsupportedOperationException("Sin programar");
    }
}
