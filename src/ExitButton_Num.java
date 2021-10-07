import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton_Num extends ButtonDefine implements Interface {

    @Override
    public void action() {
        panel.add(exitnub);

        exitnub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        });

    }
}
