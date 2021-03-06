package boletin11;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Tiempo {
private Date fechaI;
    private Date fechaF;
    
    private String frase;

    public Tiempo() {

        do {
            fechaI = new Date();
            frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: ");

            fechaF = new Date();

            long transcurrido = fechaF.getTime() - fechaI.getTime();
            long segundos = (transcurrido / 1000) % 60;
            long minutos = (transcurrido / (60 * 1000)) % 60;
            long horas = (transcurrido / (3600 * 1000)) % 60;

            DecimalFormat formato = new DecimalFormat("00");

            JOptionPane.showMessageDialog(null, "TARDACHES " + formato.format(horas) + "-" + formato.format(minutos) + "-" + formato.format(segundos) + " TEMPO EN ESCRIBIR A FRASE");

        } while (!"fin".equalsIgnoreCase(frase));
    }
}