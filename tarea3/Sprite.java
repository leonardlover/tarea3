package tarea3;
import java.awt.*;
import javax.swing.*;

class Sprite extends Bebida {
    public Sprite(int s) {
        super(s);
    }

    public String beber() {
        return super.beber() + "Sprite";
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);
        g.fillRect(this.getX(), this.getY(), 30, 60);
    }
}
