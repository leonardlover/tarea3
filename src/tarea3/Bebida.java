package tarea3;
import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel {
    private int serie;

    public Bebida(int s) {
        serie = s;
    }

    public String getSerie() {
        return String.valueOf(serie);
    }

    public void setSerie(int s) {
        serie = s;
    }

    public String beber() {
        return "sabor: ";
    }

    public void paint(Graphics g) {
    }
}
