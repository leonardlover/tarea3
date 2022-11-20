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
    }
}
