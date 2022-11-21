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
                    if (coca.isEmpty()) {
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
                    if (sprite.isEmpty()) {
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
                    if (fanta.isEmpty()) {
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
        if (coca.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                coca.addBebida(new CocaCola(coca.getId()));
            }
        }
        if (sprite.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                sprite.addBebida(new Sprite(sprite.getId()));
            }
        }
        if (fanta.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                fanta.addBebida(new Fanta(fanta.getId()));
            }
        }
    }

    public DepositoCompra getDepositoCompra() {
        return compra;
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(200, 40, 40));
        g.fillRect(this.getX() + 100, this.getY() + 100, 300, 500);

        g.setColor(new Color(100, 100, 100));
        g.fillRect(this.getX() + 340, this.getY() + 500, 60, 100);

        coca.setBounds(105, 105, 135, 460);
        coca.paint(g);
        sprite.setBounds(185, 105, 135, 460);
        sprite.paint(g);
        fanta.setBounds(265, 105, 135, 460);
        fanta.paint(g);

        g.setColor(new Color(141, 219, 242, 64));
        g.fillRect(this.getX() + 100, this.getY() + 100, 240, 500);

        g.setColor(Color.black);
        g.drawRect(this.getX() + 100, this.getY() + 100, 240, 500);
        g.drawRect(this.getX() + 340, this.getY() + 500, 60, 100);
        g.drawRect(this.getX() + 340, this.getY() + 100, 60, 400);

        compra.paint(g);
    }
}
