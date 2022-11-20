package tarea3;
import java.awt.*;
import javax.swing.*;

class Fanta extends Bebida {
    public Fanta(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "Fanta";
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.orange);
        g.fillRect(this.getX(), this.getY(), 30, 60);
    }
}
