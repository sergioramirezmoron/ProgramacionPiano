package jd.piano.progama;

import jd.piano.teclas.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.midi.*;

public class ReproductorMidi implements Receiver {
    private static final Color[] COLORES = {
            new Color(0, 0, 0),
            new Color(255, 0, 0),
            new Color(0, 255, 0),
            new Color(0, 0, 255),
            new Color(255, 255, 0),
            new Color(255, 0, 255),
            new Color(0, 255, 255),
            new Color(192, 192, 192),
            new Color(128, 128, 128),
            new Color(128, 0, 0),
            new Color(128, 128, 0),
            new Color(0, 128, 0),
            new Color(0, 0, 128),
            new Color(128, 0, 128),
            new Color(0, 128, 128),
            new Color(255, 165, 0)
    };
    private PianoMidi piano;

    public ReproductorMidi() {
        this.piano = null;
    }

    public void conectar(Piano p) {
    }

    public void reproducir(String ruta) {
        File archivo = new File(ruta);
        try {
            Sequence secuencia = MidiSystem.getSequence(archivo);
            Sequencer secuenciador = MidiSystem.getSequencer();

            secuenciador.open();
            secuenciador.setSequence(secuencia);

            Transmitter transmitter = secuenciador.getTransmitter();

            transmitter.setReceiver(this);

            secuenciador.open();

            long tiempo = secuenciador.getMicrosecondLength();
            long tiempoEnMilisegundos = tiempo / 1000;
            Thread.sleep(tiempoEnMilisegundos);

            secuenciador.close();
            transmitter.close();

        } catch (InvalidMidiDataException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } catch (MidiUnavailableException e) {
            e.getMessage();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    @Override
    public void send(MidiMessage message, long timeStamp) {
        if (message instanceof ShortMessage) {
            ShortMessage shortMessage = (ShortMessage) message;
            int canal = shortMessage.getChannel();
            if (canal == 9) {
                return;
            }
            int nota = shortMessage.getData1();

            Tecla tecla = this.piano.getTecla(nota);

            if (tecla == null) {
                return;
            }

            int comando = shortMessage.getCommand();

            if (comando == ShortMessage.NOTE_ON) {
                int volume = shortMessage.getData2();

                if (volume > 0) {
                    tecla.setColorPulsado(COLORES[canal % this.COLORES.length]);
                    tecla.pulsar();
                } else {
                    tecla.soltar();
                }
            } else if (comando == ShortMessage.NOTE_OFF) {
                tecla.soltar();
            }
            tecla.dibujar();
        }
    }
    @Override
    public void close() {
    }
}