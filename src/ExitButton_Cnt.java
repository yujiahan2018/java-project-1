import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton_Cnt extends ButtonDefine implements Interface{
    @Override
    public void action() {
        panelCNT.add(exitcnt);
        exitcnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"exit!" );
                System.exit(0);
            }
        });
    }
}
