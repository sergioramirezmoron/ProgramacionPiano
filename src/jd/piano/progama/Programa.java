package jd.piano.progama;

import bpc.daw.consola.*;

import java.awt.*;
import java.io.File;

public class Programa {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo capaFondo = consola.getCapaFondo();
        FondoColorSolido fondoColorSolido = new FondoColorSolido(0, 0, 70);
        capaFondo.setFondo(fondoColorSolido);

        CapaTexto capaTexto = consola.getCapaTexto();
        capaTexto.print("Introduce la ruta del archivo midi: ");
        String ruta = consola.getTeclado().leerCadenaCaracteres();
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            capaTexto.print("El archivo no existe");
        } else {
            capaTexto.print("¿Donde desea reproducir la cancion? (1/2):\n");
            capaTexto.print("1) Piano Sencillo\n");
            capaTexto.print("2) Piano Multi\n");

            try {
                int eleccion = consola.getTeclado().leerNumeroEntero();
                if (eleccion == 1) {
                    PianoSencillo piano = new PianoSencillo(24, 108);
                    piano.setPosicion(120, 90);
                    CapaCanvas capaCanvas = consola.getCapaCanvas();
                    Graphics graphics = capaCanvas.getGraphics();
                    piano.setGraphics(graphics);
                    ReproductorMidi reproductor = new ReproductorMidi();
                    reproductor.conectar(piano);
                    reproductor.reproducir(ruta);
                } else if (eleccion == 2) {
                    MultiPiano piano = new MultiPiano(24, 108);
                    piano.setPosicion(120, 90);
                    CapaCanvas capaCanvas = consola.getCapaCanvas();
                    Graphics graphics = capaCanvas.getGraphics();
                    piano.setGraphics(graphics);
                    ReproductorMidi reproductor = new ReproductorMidi();
                    reproductor.conectar(piano);
                    reproductor.reproducir(ruta);
                } else {
                    capaTexto.print("Elección no válida");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
