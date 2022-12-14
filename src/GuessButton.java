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

public class GuessButton extends ButtonDefine implements Interface {//按钮动作
    private int i;
    private int s;
    private int cnt=0;
    private int r = new RandomNumber().getRandom();

    public int getR() {
        return r;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    @Override
    public void action() {
        continueButton.action();
        panelNUM.add(guess);

        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if (Integer.parseInt(textFieldNmb.getText())<0 ||
                            Integer.parseInt(textFieldNmb.getText())>=100) {
                        JOptionPane.showMessageDialog(null, "输入有误！");
                    }
                    else {
                        s++;

                        if (i - s <= 0) {
                            JOptionPane.showMessageDialog(null, "Sorry,I regret to inform you:\n" +
                                    "you are fail!");
                            JOptionPane.showMessageDialog(null, "机会用尽\n请单击set按钮重置次数以重新开始," +
                                    "或单击exit按钮退出程序");
                        }

                        if (i - s > 0) {
                            cnt = resetButton.getCnt();

                            if (r == Integer.parseInt(textFieldNmb.getText())) {
                                JOptionPane.showMessageDialog(null, "Congratulations on your!\nYou" +
                                        "are successfully!\n" + "you guessed " + (s + cnt * i) + " number of times \n");
                                JOptionPane.showMessageDialog(null, "Program is about to end, " +
                                        "thank you for using.\nLet's see you next time.");
                                System.exit(0);
                            } else if (r < Integer.parseInt(textFieldNmb.getText())) {
                                JOptionPane.showMessageDialog(null, "Sorry,You are guess is so big.\n" +
                                        "Don't lose heart. Please try again!");
                                JOptionPane.showMessageDialog(null, "友情提示:你的剩余次数还有 " + (i - s) +
                                        " 次,祝你好运");
                            } else {

                                JOptionPane.showMessageDialog(null, "Sorry,You are guess is so small.\n" +
                                        "Don't lose heart. Please try again!");
                                JOptionPane.showMessageDialog(null, "友情提示:你的剩余次数还有 " + (i - s) +
                                        " 次,祝你好运");

                            }
                        }
                    }

                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "输入有误！");

                }

            }
        });
    }
}
