import javax.swing.*;

public class ExitButton_Num extends ButtonDefine implements Interface {

    @Override
    public void action() {
        panelNUM.add(exitnub);

        exitnub.addActionListener(e -> {
                JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        );

    }
}
