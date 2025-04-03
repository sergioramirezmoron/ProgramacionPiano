package jd.piano.teclas;

import java.util.Map;

public class PianoSencillo extends Piano {
    private Map<Integer, Tecla> teclas;
    public PianoSencillo(int TeclaInicial, int TeclaFinal) {
    }

    @Override
    public Tecla getTecla(int canal, int nota) {
        return null;
    }
}
