package jd.piano.progama;

import jd.piano.teclas.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;

    public PianoSencillo(int teclaInicial, int teclaFinal) {
        this.teclas = new HashMap<>();
        for (int i = teclaInicial; i <= teclaFinal; i++) {
            this.teclas.put(i, TeclaFactory.crearTecla(i));
        }
    }

    @Override
    public void setGraphics(Graphics g) {
        for (Tecla t : this.teclas.values()) {
            t.setGraphics(g);
        }
    }

    @Override
    public void dibujar() {
        for (Tecla t : this.teclas.values()){
            t.dibujar();
        }
    }

    @Override
    public void setPosicion(int x, int y) {
        int x1 = x;
        int y1 = x;

        for (Tecla t : this.teclas.values()){
            if (t instanceof TeclaBlanca){
                t.setPosicion(x1,y1);
                x1+=t.getAnchura();
            }else if(t instanceof TeclaNegra){
                t.setPosicion(x1-TeclaNegra.ANCHURA/2,y1);
            }
        }
        this.dibujar();
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return this.teclas.get(nota);
    }

    @Override
    public int getAnchura() {
        int anchura = 0;
        for (int i = 0; i < this.teclas.size(); i++) {
            Tecla t = this.teclas.get(i);
            if (t instanceof TeclaBlanca){
                anchura+=t.getAnchura();
            }
        }
        return anchura;

    }

    @Override
    public int getAltura() {
        int altura = 0;
        for (int i = 0; i < this.teclas.size(); i++) {
            Tecla t = this.teclas.get(i);
            if (t instanceof TeclaBlanca){
                altura = t.getAltura();
            }
        }
        return altura;
    }
}