package jd.piano.teclas;

public class TeclaBlanca3 extends TeclaBlanca{
    TeclaBlanca3(int n) {
        super(n);
    }

    @Override
    protected int[] getVerticesX() {
        int x = this.posicion.x;
        int n = TeclaNegra.ANCHURA;
        int b = TeclaBlanca.ANCHURA;
        return new int[]{x+b-n/2,x+b,x+b,x,x,x+b-n/2};
    }

    @Override
    protected int[] getVerticesY() {
        int y = this.posicion.y;
        return new int[]{y,y,y+TeclaBlanca.ALTURA,y+TeclaBlanca.ALTURA,y+TeclaNegra.ALTURA,y+TeclaNegra.ALTURA};
    }
}
