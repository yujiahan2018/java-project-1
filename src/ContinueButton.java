import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContinueButton extends ButtonDefine implements Interface{
    private String string;
    private int i;
    @Override
    public void action() {
        panelCNT.add(ctinu);
        ctinu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    string = textFieldcnt.getText();
                    i = Integer.parseInt(string);
                    if (i>0) {
                        guessButton.setS(0);
                        guessButton.setI(i);
                        guessnubDialog.create();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "输入有误！");
                }catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "输入有误！");

                }

            }
        });

    }

}
