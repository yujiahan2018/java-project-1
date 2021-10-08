public class GuessnubDialog extends DialogDefine implements Interface{
    public void create(){
        windowNUM.createFrame(jframeNUM);//创建窗体
        windowNUM.layout();//创建控件
        windowNUM.close(jframeNUM);//窗体关闭

        panelNUM.add(textLabelNmb);
        textFieldNmb.setColumns(10);
        panelNUM.add(textFieldNmb);
        panelNUM.setLayout(flowLayout);

        resetButton.action();//reset按钮
        guessButton.action();//guess按钮
        exitButton_NUM.action();//exit按钮

        jframeNUM.add(panelNUM);

    }
}
