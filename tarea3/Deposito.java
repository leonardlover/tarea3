package tarea3;
import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> stock;
    private int id;

    public Deposito() {
        stock = new ArrayList<Bebida>();
        id = 0;
    }

    public void addBebida(Bebida b) {
        stock.add(b);
    }

    public Bebida getBebida() {
        if (stock.size() == 0) {
            return null;
        } else {
            return stock.remove(0);
        }
    }

    public int getSize() {
        return stock.size();
    }

    public int getId() {
        return id++;
    }
}
