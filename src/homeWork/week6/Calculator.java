package homeWork.week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener{
    private static double a =0;
    private static double b = 0;
    private static double result = 0;
    private static int click = 0;
    private static String action;

    private JButton delButton = new JButton("AC");
    private JButton oneButton = new JButton("1");
    private JButton twoButton = new JButton("2");
    private JButton threeButton = new JButton("3");
    private JButton fourButton = new JButton("4");
    private JButton fifeButton = new JButton("5");
    private JButton sixButton = new JButton("6");
    private JButton sevenButton = new JButton("7");
    private JButton eightButton = new JButton("8");
    private JButton nineButton = new JButton("9");
    private JButton zeroButton = new JButton("0");
    private JButton pointButton = new JButton(".");
    private JButton equalsButton = new JButton("=");
    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JButton clickButton = new JButton("CLICK");
    private JButton percentButton = new JButton("%");
    private JButton twoZeroButton = new JButton("00");
    private JButton cDelButton = new JButton("C");


    private JPanel panelButton = new JPanel();
    private JPanel mainPanel = new JPanel();

    private JTextField textField = new JTextField(20);

    private JRadioButton onButton = new JRadioButton("ON", true);
    private JRadioButton offButton = new JRadioButton("OFF", false);

    public Calculator() throws HeadlessException {
        componentsWindow();
        windowSettings();
        background();
        cursor();
        actionListener();
        type();
    }

    private void componentsWindow(){
        panelButton.setLayout(new GridLayout(5,1));
        panelButton.add(delButton);
        panelButton.add(cDelButton);
        panelButton.add(percentButton);
        panelButton.add(divideButton);
        panelButton.add(sevenButton);
        panelButton.add(eightButton);
        panelButton.add(nineButton);
        panelButton.add(multiplyButton);
        panelButton.add(fourButton);
        panelButton.add(fifeButton);
        panelButton.add(sixButton);
        panelButton.add(minusButton);
        panelButton.add(oneButton);
        panelButton.add(twoButton);
        panelButton.add(threeButton);
        panelButton.add(plusButton);
        panelButton.add(zeroButton);
        panelButton.add(twoZeroButton);
        panelButton.add(pointButton);
        panelButton.add(clickButton);
        panelButton.add(equalsButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(panelButton, BorderLayout.CENTER);
        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(equalsButton, BorderLayout.AFTER_LAST_LINE);

       // mainPanel.add(onButton, BorderLayout.WEST);
        //offButton.setBounds(10,120,60,40);

        JScrollPane scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);



    }
    private void background(){
        divideButton.setBackground(Color.ORANGE);
        multiplyButton.setBackground(Color.ORANGE);
        minusButton.setBackground(Color.ORANGE);
        plusButton.setBackground(Color.ORANGE);
        cDelButton.setBackground(Color.WHITE);
        sevenButton.setBackground(Color.LIGHT_GRAY);
        eightButton.setBackground(Color.LIGHT_GRAY);
        nineButton.setBackground(Color.LIGHT_GRAY);
        fourButton.setBackground(Color.LIGHT_GRAY);
        fifeButton.setBackground(Color.LIGHT_GRAY);
        sixButton.setBackground(Color.LIGHT_GRAY);
        oneButton.setBackground(Color.LIGHT_GRAY);
        twoButton.setBackground(Color.LIGHT_GRAY);
        threeButton.setBackground(Color.LIGHT_GRAY);
        zeroButton.setBackground(Color.LIGHT_GRAY);
        twoZeroButton.setBackground(Color.LIGHT_GRAY);
        pointButton.setBackground(Color.LIGHT_GRAY);
        delButton.setBackground(Color.WHITE);
        percentButton.setBackground(Color.WHITE);
        clickButton.setBackground(Color.ORANGE);
        equalsButton.setBackground(Color.WHITE);
        textField.setBackground(Color.WHITE);

        }
        private void type(){
        Font font = new Font("TimesRoman", Font.ITALIC,20);
             oneButton.setFont(font);
            twoButton.setFont(font);
            threeButton.setFont(font);
            fourButton.setFont(font);
            fifeButton.setFont(font);
            sixButton.setFont(font);
            sevenButton.setFont(font);
            eightButton.setFont(font);
            nineButton.setFont(font);
            zeroButton.setFont(font);
            twoZeroButton.setFont(font);
            equalsButton.setFont(font);
            pointButton.setFont(font);
            plusButton.setFont(font);
            minusButton.setFont(font);
            multiplyButton.setFont(font);
            clickButton.setFont(font);
            divideButton.setFont(font);
            percentButton.setFont(font);
            delButton.setFont(font);
            cDelButton.setFont(font);
            }
        private void cursor(){
            Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
            equalsButton.setCursor(cursor);
            plusButton.setCursor(cursor);
            divideButton.setCursor(cursor);
            multiplyButton.setCursor(cursor);
            minusButton.setCursor(cursor);
            delButton.setCursor(cursor);
            clickButton.setCursor(cursor);
            percentButton.setCursor(cursor);
            oneButton.setCursor(cursor);
            twoButton.setCursor(cursor);
            threeButton.setCursor(cursor);
            fourButton.setCursor(cursor);
            fifeButton.setCursor(cursor);
            sixButton.setCursor(cursor);
            sevenButton.setCursor(cursor);
            eightButton.setCursor(cursor);
            nineButton.setCursor(cursor);
            zeroButton.setCursor(cursor);
            twoZeroButton.setCursor(cursor);
            pointButton.setCursor(cursor);
            cDelButton.setCursor(cursor);
        }
        private void actionListener(){
            equalsButton.addActionListener(this);
            plusButton.addActionListener(this);
            divideButton.addActionListener(this);
            multiplyButton.addActionListener(this);
            minusButton.addActionListener(this);
            delButton.addActionListener(this);
            clickButton.addActionListener(this);
            percentButton.addActionListener(this);
            oneButton.addActionListener(this);
            twoButton.addActionListener(this);
            threeButton.addActionListener(this);
            fourButton.addActionListener(this);
            fifeButton.addActionListener(this);
            sixButton.addActionListener(this);
            sevenButton.addActionListener(this);
            eightButton.addActionListener(this);
            nineButton.addActionListener(this);
            zeroButton.addActionListener(this);
            twoZeroButton.addActionListener(this);
            pointButton.addActionListener(this);
            cDelButton.addActionListener(this);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== oneButton){
            textField.setText(textField.getText().concat("1"));
         }if(e.getSource()== twoButton){
            textField.setText(textField.getText().concat("2"));
        }if(e.getSource()== threeButton){
            textField.setText(textField.getText().concat("3"));
        }if(e.getSource()== fourButton){
            textField.setText(textField.getText().concat("4"));
        }if(e.getSource()== fifeButton){
            textField.setText(textField.getText().concat("5"));
        }if(e.getSource()== sixButton){
            textField.setText(textField.getText().concat("6"));
        }if(e.getSource()== sevenButton){
            textField.setText(textField.getText().concat("7"));
        }if(e.getSource()== eightButton){
            textField.setText(textField.getText().concat("8"));
        }if(e.getSource()== nineButton){
            textField.setText(textField.getText().concat("9"));
        }if(e.getSource()== zeroButton){
            textField.setText(textField.getText().concat("0"));
        }if(e.getSource()== twoZeroButton){
            textField.setText(textField.getText().concat("00"));
        }if(e.getSource()== pointButton){
            textField.setText(textField.getText().concat("."));
        }


            if (e.getSource() == plusButton) {
               a = Double.parseDouble(textField.getText());
               action = "PLUS";
               textField.setText(" ");

            }
            if (e.getSource() == minusButton) {
                a = Double.parseDouble(textField.getText());
                action = "MINUS";
                textField.setText(" ");

            }
            if (e.getSource() == multiplyButton) {
                a = Double.parseDouble(textField.getText());
                action = "MULTIPLY";
                textField.setText(" ");

            }if (e.getSource() == divideButton) {
                a = Double.parseDouble(textField.getText());
                action = "DIVIDE";
                textField.setText(" ");
            }if (e.getSource() == percentButton) {
                a = Double.parseDouble(textField.getText());
                action = "PERCENT";
                textField.setText(" ");

            }if (e.getSource() == equalsButton){
                    b = Double.parseDouble(textField.getText());
                    switch (action){
                        case "PLUS":
                            result = a + b;
                            break;
                        case "MINUS":
                            result = a - b;
                            break;
                        case "MULTIPLY":
                            result = a * b;
                            break;
                        case "DIVIDE":
                            if (b == 0) {
                                try {
                                    System.out.println(a / b);
                                } catch (Exception exeption) {
                                    System.out.println("Error : " + exeption.getMessage());

                                }
                            }
                            result = a / b;
                            break;
                        case "PERCENT":
                            result = (a / 100) * b;
                            break;
                    }
                    textField.setText(" " + String.format("%.7g%n" , result));
                }

                if(e.getSource()== delButton){
                textField.setText(" ");
                }if(e.getSource() == cDelButton){
                String s = textField.getText();
                textField.setText(" ");
                for(int i = 0;i < s.length() - 1;i++){
                    textField.setText(textField.getText() + s.charAt(i));
                }
            }
            if(e.getSource() == clickButton){
            click++;
            textField.setText("Click :" + click);
            if(click == 100){
                textField.setText("YOU'RE COOL :) Click : " + click);
            }if(click == 1000){
                textField.setText("AMAZING :) you made a lot of clicks" + click);
                }
                if(click == 10000){
                textField.setText("YOU'RE CRAZY, it's time to finish it :) Click: " + click);
                }
        }
}

    private void windowSettings(){

        setSize(400, 420);
        setLocation(400, 200);
        setResizable(false);
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }



}
