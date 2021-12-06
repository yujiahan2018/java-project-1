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

public class ResetButton extends ButtonDefine implements Interface {
    private final int n = 0;
    private int cnt = 0;

    public int getCnt() {
        return cnt;
    }

    @Override
    public void action() {
        panelNUM.add(reset);

        reset.addActionListener(e -> {

            if(guessButton.getI()-guessButton.getS()<=0) {
                JOptionPane.showMessageDialog(null,"Reset succeed！\nPlease continue " +
                        "game！\n" +
                        "Have a good time!");
                guessButton.setS(n);
                cnt++;
            }
            else
                JOptionPane.showMessageDialog(null,"chance is not use up!\nPlease is continue!");

        });

    }
}
