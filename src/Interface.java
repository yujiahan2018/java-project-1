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

import javax.swing.*;
import java.awt.*;


public interface Interface {
    JFrame jframe = new JFrame();
    Panel panel = new Panel();
    FlowLayout flowLayout = new FlowLayout();//流式布局
    //    BorderLayout borderLayout = new BorderLayout();//边界布局
//    GridLayout gridLayout = new GridLayout(3,3);//流式布局
    TextField textFieldNmb = new TextField();
    JOptionPane count = new JOptionPane();
    JOptionPane message = new JOptionPane();
    Label textLabelNmb = new Label("Please input your guess number:");
    ResetButton resetButton = new ResetButton();
    GuessButton guessButton = new GuessButton();
    ExitButton exitButton = new ExitButton();

//    RandomNumber randomNumber = new RandomNumber();

    Button guess = new Button("Guess");
    Button exit = new Button("exit");
    Button reset = new Button("reset");
    FrameDesign frameDesign = new FrameDesign();

    CopyrightStatement copyrightStatement = new CopyrightStatement();
    GameExplain gameExplain = new GameExplain();

//    JDialog dialog = new JDialog(jframe,"input");//自定义对话框

}
