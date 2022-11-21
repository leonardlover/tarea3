package tarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class Deposito extends JPanel {
    private ArrayList<Bebida> stock;
    private int id;

    public Deposito() {
        stock = new ArrayList<Bebida>();
        id = 0;
    }

    public void addBebida(Bebida b) {
        stock.add(b);
    }

    public Boolean isEmpty() {
        return stock.isEmpty();
    }

    public Bebida getBebida() {
        if (stock.size() == 0) {
            return null;
        } else {
            return stock.remove(0);
        }
    }

    public int getId() {
        return id++;
    }

    public void paint(Graphics g) {
        if (!stock.isEmpty()) {
            for (int i = 0; i < stock.size() && i < 14; i++) {
                stock.get(i).setBounds(this.getX() + (i % 2) * 40, this.getY() + 70 * (i / 2), 30, 60);
                stock.get(i).paint(g);
            }
        }
    }
}
