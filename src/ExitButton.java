import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton implements Interface {


    public void action() {
        panel.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        });

    }
}
