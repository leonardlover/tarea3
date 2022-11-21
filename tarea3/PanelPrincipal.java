package tarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() {
        com = new Comprador();
        exp = new Expendedor(14, 10);
        this.setLayout(null);
        this.setBackground(new Color(128, 128, 128));
    }

    public Comprador getComprador() {
        return com;
    }

    public Expendedor getExpendedor() {
        return exp;
    }

    public void paint(Graphics g) {
        super.paint(g);

        com.paint(g);
        exp.paint(g);
    }
}
