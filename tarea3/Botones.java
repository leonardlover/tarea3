package tarea3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Botones {
    public Botones(PanelPrincipal pp) {
        JButton coin1 = new JButton();

        coin1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getComprador().setCoin(1);
                pp.repaint();
            }
        });

        coin1.setBounds(88, 15, 50, 50);
        coin1.setOpaque(false);
        coin1.setContentAreaFilled(false);
        pp.add(coin1);

        JButton coin2 = new JButton();

        coin2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getComprador().setCoin(2);
                pp.repaint();
            }
        });

        coin2.setBounds(225, 15, 50, 50);
        coin2.setOpaque(false);
        coin2.setContentAreaFilled(false);
        pp.add(coin2);

        JButton coin3 = new JButton();

        coin3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getComprador().setCoin(3);
                pp.repaint();
            }
        });

        coin3.setBounds(362, 15, 50, 50);
        coin3.setOpaque(false);
        coin3.setContentAreaFilled(false);
        pp.add(coin3);

        JButton coca = new JButton();

        coca.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    pp.getExpendedor().comprarBebida(pp.getComprador().getMoneda(), 1);
                    pp.getComprador().setCoin(0);
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                pp.repaint();
            }
        });

        coca.setBounds(357, 150, 25, 25);
        coca.setOpaque(false);
        coca.setContentAreaFilled(false);
        pp.add(coca);

        JButton sprite = new JButton();

        sprite.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    pp.getExpendedor().comprarBebida(pp.getComprador().getMoneda(), 2);
                    pp.getComprador().setCoin(0);
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                pp.repaint();
            }
        });

        sprite.setBounds(357, 200, 25, 25);
        sprite.setOpaque(false);
        sprite.setContentAreaFilled(false);
        pp.add(sprite);

        JButton fanta = new JButton();

        fanta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    pp.getExpendedor().comprarBebida(pp.getComprador().getMoneda(), 3);
                    pp.getComprador().setCoin(0);
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                pp.repaint();
            }
        });

        fanta.setBounds(357, 250, 25, 25);
        fanta.setOpaque(false);
        fanta.setContentAreaFilled(false);
        pp.add(fanta);

        JButton agarrar = new JButton();

        agarrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getComprador().addBebida(pp.getExpendedor().getDepositoCompra().getBebida());
                pp.repaint();
            }
        });

        agarrar.setBounds(340, 500, 60, 100);
        agarrar.setOpaque(false);
        agarrar.setContentAreaFilled(false);
        pp.add(agarrar);

        JButton refill = new JButton();

        refill.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getExpendedor().refill();
                pp.repaint();
            }
        });

        refill.setBounds(100, 100, 240, 500);
        refill.setOpaque(false);
        refill.setContentAreaFilled(false);
        pp.add(refill);

        JButton drink = new JButton();

        drink.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pp.getComprador().drink();
                pp.repaint();
            }
        });

        drink.setBounds(100, 625, 355, 70);
        drink.setOpaque(false);
        drink.setContentAreaFilled(false);
        pp.add(drink);
    }
}
