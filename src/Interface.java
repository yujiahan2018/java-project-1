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
    JFrame jframeNUM = new JFrame();
    JFrame jframeCNT = new JFrame();

    Panel panelNUM = new Panel();
    Panel panelCNT = new Panel();

    Button guess = new Button("Guess");
    Button exitnub = new Button("exit");
    Button reset = new Button("reset");
    Button ctinu = new Button("contiue");
    Button exitcnt = new Button("exit");

    ContinueButton continueButton = new ContinueButton();
    ResetButton resetButton = new ResetButton();
    GuessButton guessButton = new GuessButton();
    ExitButton_Num exitButton_NUM = new ExitButton_Num();
    ExitButton_Cnt exitButton_CNT = new ExitButton_Cnt();

    Window windowNUM = new Window();
    Window windowCNT = new Window();

    GuessnubDialog guessnubDialog = new GuessnubDialog();
    GuesscntDialog guesscntDialog = new GuesscntDialog();

    TextField textFieldNmb = new TextField();
    TextField textFieldcnt = new TextField();

    Label textLabelNmb = new Label("Please input your guess number:");
    Label textLabelcnt = new Label("How many opportunities do you want in game");

    FlowLayout flowLayout = new FlowLayout();//流式布局

    GameExplain gameExplain = new GameExplain();

    CopyrightStatement copyrightStatement = new CopyrightStatement();

}
