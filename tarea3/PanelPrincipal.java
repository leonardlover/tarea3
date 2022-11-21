package tarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() {
        com = new Comprador();
        exp = new Expendedor(6, 10);

        com.addBebida(new CocaCola(10));
        com.addBebida(new Fanta(0));
        com.addBebida(new Sprite(0));

        com.addMoneda(new Moneda100(0));
        com.addMoneda(new Moneda500(1));
        com.addMoneda(new Moneda1000(2));

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
