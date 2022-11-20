package tarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class Expendedor extends JPanel {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;

    private DepositoVuelto vuelto;
    private DepositoCompra compra;

    private ArrayList<Moneda> income;

    private int precio;
    private int stock;
 
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();

        vuelto = new DepositoVuelto();
        compra = new DepositoCompra();

        income = new ArrayList<Moneda>();

        precio = 100 * precioBebidas; // debe ser un multiplo de 100
        stock = numBebidas;

        for(int i = 0; i < stock; i++) {
            coca.addBebida(new CocaCola(coca.getId()));
            sprite.addBebida(new Sprite(sprite.getId()));
            fanta.addBebida(new Fanta(fanta.getId()));
        }
    }

    public void comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        if (m == null) {
            throw new PagoIncorrectoException();
        }
        else if (m.getValor() < precio) {
            vuelto.addMoneda(m);
            throw new PagoInsuficienteException();
        }
        else {
            switch (cual) {
                case 1: // cocacola
                    if (coca.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    if (compra.isEmpty()) {
                        income.add(m);
                        compra.addBebida(coca.getBebida());
                        for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                            vuelto.addMoneda(new Moneda100(vuelto.getId()));
                        }
                    }
                    else {
                        vuelto.addMoneda(m);
                    }

                    break;
                    
                case 2: // sprite
                    if (sprite.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    if (compra.isEmpty()) {
                        income.add(m);
                        compra.addBebida(sprite.getBebida());
                        for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                            vuelto.addMoneda(new Moneda100(vuelto.getId()));
                        }
                    }
                    else {
                        vuelto.addMoneda(m);
                    }

                    break;
                
                case 3: // fanta
                    if (fanta.getSize() == 0) {
                        vuelto.addMoneda(m);
                        throw new NoHayBebidaException();
                    }

                    if (compra.isEmpty()) {
                        income.add(m);
                        compra.addBebida(fanta.getBebida());
                        for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                            vuelto.addMoneda(new Moneda100(vuelto.getId()));
                        }
                    }
                    else {
                        vuelto.addMoneda(m);
                    }

                    break;
                
                default:
                    vuelto.addMoneda(m);
                    throw new NoHayBebidaException();
            }
        }
    }

    public Moneda getVuelto() {
        return vuelto.getMoneda();
    }

    public void refill() {
        if (coca.getSize() == 0) {
            for (int i = 0; i < stock; i++) {
                coca.addBebida(new CocaCola(coca.getId()));
            }
        }
        if (sprite.getSize() == 0) {
            for (int i = 0; i < stock; i++) {
                sprite.addBebida(new Sprite(sprite.getId()));
            }
        }
        if (fanta.getSize() == 0) {
            for (int i = 0; i < stock; i++) {
                fanta.addBebida(new Fanta(fanta.getId()));
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(200, 40, 40));
        g.fillRect(this.getX() + 100, this.getY() + 100, 300, 500);
    }
}
