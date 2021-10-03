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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton implements Interface {
    int cnt = 5;

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void action() {
        panel.add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guessButton.setI(cnt);
            }
        });
//        return cnt;
    }
}
