package tarea3;
import java.awt.*;
import javax.swing.*;

class CocaCola extends Bebida {
    public CocaCola(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "CocaCola";
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getY(), 30, 60);
        g.setColor(Color.black);
        g.drawRect(this.getX(), this.getY(), 30, 60);

        g.setColor(Color.white);
        g.drawString(super.getSerie(), this.getX() + 10, this.getY() + 35);
    }
}
