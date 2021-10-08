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

import static java.awt.FlowLayout.CENTER;

public class FrameDesign extends Window implements Interface {

    public void layout() {
        flowLayout.setAlignment(CENTER);
        panelNUM.setLayout(flowLayout);

        panelNUM.add(textLabelNmb);
        textFieldNmb.setColumns(10);//NMB
        panelNUM.add(textFieldNmb);

        jframeNUM.add(panelNUM);
    }

}

