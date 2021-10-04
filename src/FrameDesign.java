/*
 * -----------------------------------------------------------------------------------------------------------------------
 * 版权信息
 * Copyright (c) 2021.
 * Worker:JiahanYu./于家汉
 * Date:2021/10/2 上午9:43
 * 侵权必究
 * -----------------------------------------------------------------------------------------------------------------------
 *
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDesign implements Interface {

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
                JOptionPane.showMessageDialog(null,"The random-number is " + guessButton.getR());
                System.exit(0);
            }
        });

    }
}
