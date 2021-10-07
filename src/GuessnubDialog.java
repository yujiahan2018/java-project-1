public class GuessnubDialog extends DialogDefine implements Interface{
    public void create(){
        window.createFrame(jframe);//创建窗体
        window.layout();//创建控件
        window.close(jframe);//窗体关闭

        panel.add(textLabelNmb);
        textFieldNmb.setColumns(10);
        panel.add(textFieldNmb);
        panel.setLayout(flowLayout);

        resetButton.action();//reset按钮
        guessButton.action();//guess按钮
        exitButton_NUM.action();//exit按钮


        jframe.add(panel);

    }
}
