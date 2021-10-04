import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton implements Interface {
    private int k = new RandomNumber().getRandom();

    public void action() {
        panel.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"The random-number is " + k);
                System.exit(0);
            }
        });

    }
}
