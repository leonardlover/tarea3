package tarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class DepositoVuelto extends JPanel {
    private ArrayList<Moneda> vuelto;
    private int id;

    public DepositoVuelto() {
        vuelto = new ArrayList<Moneda>();
        id = 0;
    }

    public void addMoneda(Moneda m) {
        vuelto.add(m);
    }

    public Moneda getMoneda() {
        if (vuelto.size() == 0) {
            return null;
        } else {
            return vuelto.remove(0);
        }
    }

    public int getId() {
        return id++;
    }

    public void paint(Graphics g) {
        if (!vuelto.isEmpty()) {
            for (int i = 0; i < vuelto.size() && i < 5; i++) {
                vuelto.get(i).setBounds(this.getX(), this.getY() + 25 * i, 25, 25);
                vuelto.get(i).paint(g);
            }
        }
    }
}
