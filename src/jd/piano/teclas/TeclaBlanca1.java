package jd.piano.teclas;

public class TeclaBlanca1 extends TeclaBlanca {
    TeclaBlanca1(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int x = this.posicion.x;
        int n = TeclaNegra.ANCHURA;
        int b = TeclaBlanca.ANCHURA;
        return new int[]{x,x+b-n/2,x+b-n/2,x+b,x+b,x};
    }

    @Override
    protected int[] getVerticesY() {
        int y = this.posicion.y;
        return new int[]{y,y,y+TeclaNegra.ALTURA,y+TeclaNegra.ALTURA,y+TeclaBlanca.ALTURA,y+TeclaBlanca.ALTURA};
    }
}
