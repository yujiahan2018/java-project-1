import com.sun.deploy.net.MessageHeader;
import sun.font.TextLabel;

import javax.swing.*;
import java.awt.*;

public class GuesscntDialog extends DialogDefine implements Interface{
    private int i;

    @Override
    public void create() {
        windowCNT.createFrame(jframeCNT);//创建窗体
        windowCNT.layout();//创建控件
        windowCNT.close(jframeCNT);//窗体关闭

        panelCNT.add(textLabelcnt);
        textFieldcnt.setColumns(10);
        panelCNT.add(textFieldcnt);

        continueButton.action();
        exitButton_CNT.action();

        jframeCNT.add(panelCNT);

    }


}

