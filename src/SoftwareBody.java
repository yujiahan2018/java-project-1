/*
 * -----------------------------------------------------------------------------------------------------------------------
 * 版权信息
 * Copyright (c) 2021.
 * Worker:JiahanYu./于家汉
 * Date:2021/10/2 上午9:44
 * 侵权必究
 * -----------------------------------------------------------------------------------------------------------------------
 *
 */

public class SoftwareBody implements Interface {

    public void run() {
        copyrightStatement.copyright();//版权声明
        gameExplain.explain();//游戏说明

        guesscntDialog.create();
        jframeNUM.pack();


    }
}
