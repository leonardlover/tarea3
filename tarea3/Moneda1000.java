package tarea3;
import java.awt.*;
import javax.swing.*;

class Moneda1000 extends Moneda {
    public Moneda1000(int s) {
        super(s);
    }

    public int getValor() {
        return 1000;
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.blue);
        g.fillOval(this.getX(), this.getY(), 20, 20);
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), 20, 20);

        g.setColor(Color.white);
        g.drawString(super.getSerie(), this.getX() + 6, this.getY() + 15);
    }
}
