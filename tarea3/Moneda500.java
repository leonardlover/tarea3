package tarea3;
import java.awt.*;
import javax.swing.*;

class Moneda500 extends Moneda {
    public Moneda500(int s) {
        super(s);
    }

    public int getValor() {
        return 500;
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);
        g.fillOval(this.getX(), this.getY(), 20, 20);
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), 20, 20);

        g.setColor(Color.white);
        g.drawString(super.getSerie(), this.getX() + 6, this.getY() + 15);
    }
}
