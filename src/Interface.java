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

    TextField textFieldNmb = new TextField();
    JOptionPane message = new JOptionPane();
    Label textLabelNmb = new Label("Please input your guess number:");
    ResetButton resetButton = new ResetButton();
    GuessButton guessButton = new GuessButton();
    ExitButton_Num exitButton_NUM = new ExitButton_Num();


    JFrame JframeCNT = new JFrame();

    Button guess = new Button("Guess");
    Button exitnub = new Button("exit");
    Button reset = new Button("reset");

    Window window = new Window();
    Window windowCNT = new Window();

    GuessnubDialog guessnubDialog = new GuessnubDialog();
    GuesscntDialog guesscntDialog = new GuesscntDialog();
    CopyrightStatement copyrightStatement = new CopyrightStatement();
    GameExplain gameExplain = new GameExplain();

    ContinueButton continueButton = new ContinueButton();
    Button ctinu = new Button("contiue");
    Button exitcnt = new Button("exit");
    ExitButton_Cnt exitButton_CNT = new ExitButton_Cnt();



    TextField textFieldcnt = new TextField();
    Label textLabelcnt = new Label("please input cnt" +
            "-number in 1~99(from int)");
    JFrame jframeCNT = new JFrame();
    Panel panelCNT = new Panel();
//    GuesscntDialog guesscntDialog = new GuesscntDialog();
}
