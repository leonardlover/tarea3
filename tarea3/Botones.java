package tarea3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Botones {
    public Botones(PanelPrincipal pp) {
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
