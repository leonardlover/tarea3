package tarea3;
import java.util.ArrayList;

class DepositoVuelto {
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
}
