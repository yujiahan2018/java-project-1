import javax.swing.*;

public class GuessDialog implements Interface{
    private int i;

    public void pop(){
        try {
            while (i<=0||i>=100)
            {

                String string = count.showInputDialog(null, "输入猜的次数", "输入对话框", JOptionPane.PLAIN_MESSAGE);
                i = Integer.parseInt(string);
                guessButton.setS(1);
                guessButton.setI(i);

                if(i<=0||i>=100)
                    message.showMessageDialog(null, "输入有误！");

            }

            }
         catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "输入有误！");
            new GuessDialog().pop();
        }
    }


}
