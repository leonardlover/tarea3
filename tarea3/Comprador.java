package tarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class Comprador extends JPanel {
    private int coin;
    private int id;
    private Moneda moneda;
    private ArrayList<Moneda> monedas;
    private ArrayList<Bebida> bebidas;

    public Comprador() {
        coin = 0;
        id = 0;
        moneda = null;
        monedas = new ArrayList<Moneda>();
        bebidas = new ArrayList<Bebida>();
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int c) {
        coin = c;

        switch (coin) {
            case 1:
                moneda = new Moneda100(id++);
                break;
            case 2:
                moneda = new Moneda500(id++);
                break;
            case 3:
                moneda = new Moneda1000(id++);
                break;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int n) {
        id = n;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda m) {
        moneda = m;

        if (moneda.getValor() == 100) {
            coin = 1;
        }
        else if(moneda.getValor() == 500) {
            coin = 2;
        }
        else {
            coin = 3;
        }
    }

    public void comprarBebida(int cual, Expendedor exp) {
        try {
            exp.comprarBebida(moneda, cual);
        }
        catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        catch (NoHayBebidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getVuelto(Expendedor exp) {
        Moneda m = exp.getVuelto();

        if (m != null) {
            monedas.add(m);
        }
    }

    public void drink() {
        if (!bebidas.isEmpty()) {
            bebidas.remove(0);
        }
    }

    public void addBebida(Bebida b) {
        bebidas.add(b);
    }

    public void addMoneda(Moneda m) {
        monedas.add(m);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.yellow);
        g.fillOval(this.getX() + 10, this.getY() + 650, 80, 80);
        g.setColor(Color.black);
        g.drawOval(this.getX() + 10, this.getY() + 650, 80, 80);
        g.setColor(Color.black);
        g.fillOval(this.getX() + 32, this.getY() + 665, 15, 30);
        g.setColor(Color.black);
        g.fillOval(this.getX() + 52, this.getY() + 665, 15, 30);
        g.setColor(Color.black);
        g.fillRect(this.getX() + 30, this.getY() + 705, 40, 10);

        g.setColor(new Color(170, 0, 255));
        g.fillRect(this.getX() + 100, this.getY() + 625, 355, 70);
        g.setColor(Color.black);
        g.drawRect(this.getX() + 100, this.getY() + 625, 355, 70);
        g.setColor(new Color(250, 250, 0));
        g.fillRect(this.getX() + 100, this.getY() + 720, 355, 30);
        g.setColor(Color.black);
        g.drawRect(this.getX() + 100, this.getY() + 720, 355, 30);

        if (!bebidas.isEmpty()) {
            for (int i = 0; i < bebidas.size() && i < 10; i++) {
                bebidas.get(i).setBounds(this.getX() + 105 + 35 * i, this.getY() + 630, 30, 60);
                bebidas.get(i).paint(g);
            }
        }

        if (!monedas.isEmpty()) {
            for (int i = 0; i < monedas.size() && i < 14; i++) {
                monedas.get(i).setBounds(this.getX() + 105 + 25 * i, this.getY() + 725, 30, 60);
                monedas.get(i).paint(g);
            }
        }

        g.setColor(Color.red);
        g.fillRect(this.getX() + 88, this.getY() + 15, 50, 50);
        g.setColor(Color.black);
        g.drawRect(this.getX() + 88, this.getY() + 15, 50, 50);
        g.setColor(Color.white);
        g.drawString("$100", this.getX() + 96, this.getY() + 45);

        g.setColor(Color.green);
        g.fillRect(this.getX() + 225, this.getY() + 15, 50, 50);
        g.setColor(Color.black);
        g.drawRect(this.getX() + 225, this.getY() + 15, 50, 50);
        g.setColor(Color.white);
        g.drawString("$500", this.getX() + 233, this.getY() + 45);

        g.setColor(Color.blue);
        g.fillRect(this.getX() + 362, this.getY() + 15, 50, 50);
        g.setColor(Color.black);
        g.drawRect(this.getX() + 362, this.getY() + 15, 50, 50);
        g.setColor(Color.white);
        g.drawString("$1000", this.getX() + 366, this.getY() + 45);

        g.setColor(Color.yellow);

        switch (coin) {
            case 1:
                g.fillPolygon(new int[] {102, 126, 114}, new int[] {95, 95, 70}, 3);
                break;
            case 2:
                g.fillPolygon(new int[] {239, 263, 251}, new int[] {95, 95, 70}, 3);
                break;
            case 3:
                g.fillPolygon(new int[] {376, 400, 388}, new int[] {95, 95, 70}, 3);
                break;
        }
    }
}
