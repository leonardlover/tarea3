package tarea3;
import java.awt.*;
import javax.swing.*;

abstract class Moneda extends JPanel {
    private int serie;

    public Moneda(int s) {
        serie = s;
    }

    public String getSerie() {
        return String.valueOf(serie); 
    }

    public void setSerie(int s) {
        serie = s;
    }

    public abstract int getValor();

    public void paint(Graphics g) {
    }
}
