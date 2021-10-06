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

        frameDesign.createFrame();//创建窗体
        frameDesign.layout();//创建控件
        frameDesign.close();//窗体关闭

        resetButton.action();//reset按钮
        guessButton.action();//guess按钮
        exitButton.action();//exit按钮


        jframe.pack();


    }
}
