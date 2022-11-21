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
