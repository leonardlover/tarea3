package tarea3;
import java.awt.*;
import javax.swing.*;

class DepositoCompra extends JPanel {
    private Bebida bebida;

    public DepositoCompra() {
    }

    public void addBebida(Bebida b) {
        bebida = b;
    }

    public Bebida getBebida() {
        Bebida b = bebida;
        bebida = null;

        return b;
    }

    public Boolean isEmpty() {
        return (bebida == null) ? true : false;
    }

    public void paint(Graphics g) {
        if (bebida != null) {
            bebida.setBounds(355, 520, 30, 60);
            bebida.paint(g);
        }
    }
}
