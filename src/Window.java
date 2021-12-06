import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.FlowLayout.CENTER;

class Window implements Interface{
    private boolean flag = true;

    public void layout() {
        flowLayout.setAlignment(CENTER);
    }

    public void createFrame(JFrame jframe) {
        jframe.setTitle("Guess game");
        jframe.setBounds(0, 0, 300, 100);

        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);//窗口居中显示
        jframe.setVisible(true);

    }


    public void close(JFrame jframe) {
        jframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (flag)
                    JOptionPane.showMessageDialog(null,"exit!" );
                else
                    JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        });

    }


}
