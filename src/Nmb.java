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

import static java.awt.FlowLayout.CENTER;

public class Nmb implements Interface {
    public void create() {
        flowLayout.setAlignment(CENTER);
        panel.setLayout(flowLayout);

        panel.add(textLabelNmb);
        textFieldNmb.setColumns(10);//NMB
        panel.add(textFieldNmb);

        jframe.add(panel);
    }
}
