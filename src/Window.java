import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.FlowLayout.CENTER;

abstract class Window implements Interface{
    public void layout() {

    }

    public void createFrame() {
        jframe.setTitle("Guess game");
        jframe.setBounds(0, 0, 300, 100);

        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);//窗口居中显示
        jframe.setVisible(true);

    }


    public void close() {
        jframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        });

    }


}
