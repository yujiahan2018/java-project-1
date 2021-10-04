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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton implements Interface {
    private int n = 1;
    private int cnt = 0;

    public int getCnt() {
        return cnt;
    }

    public void action() {
        panel.add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(guessButton.getS()%guessButton.getI()==0) {
                    guessButton.setI(n);
                    cnt++;
                }
                else
                    JOptionPane.showMessageDialog(null,"chance is not use up!Please is continue!");

            }
        });

    }
}
