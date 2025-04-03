package jd.piano.teclas;

public class TeclaFactory {
    private TeclaFactory() {
    }

    public static Tecla crearTecla(int nota) {
        int resto = nota % 12;
        Tecla tecla = null;

        switch (resto) {
            case 1, 3, 6, 8, 10 ->  tecla = new TeclaNegra(nota);
            case 0, 5 -> tecla = new TeclaBlanca1(nota);
            case 2, 7, 9 ->  tecla = new TeclaBlanca2(nota);
            case 4, 11 -> tecla = new TeclaBlanca3(nota);
            default -> System.out.println("No existe");
        }
        return tecla;
    }
}

