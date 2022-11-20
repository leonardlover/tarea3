package tarea3;
import java.awt.*;
import javax.swing.*;

class Ventana extends JFrame {
    public Ventana() {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");

        PanelPrincipal pp = new PanelPrincipal();
        this.add(pp);
        Botones b = new Botones(pp);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}
