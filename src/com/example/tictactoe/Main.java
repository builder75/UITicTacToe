package com.example.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    static String[][] table = new String[3][3];


    public static void tictactoeLogic() {

        {
            if (Objects.equals(table[0][0], "o") &&
                    Objects.equals(table[0][1], "o") &&
                    Objects.equals(table[0][2], "o") ||
                    Objects.equals(table[1][0], "o") &&
                            Objects.equals(table[1][1], "o") &&
                            Objects.equals(table[1][2], "o") ||
                    Objects.equals(table[2][0], "o") &&
                            Objects.equals(table[2][1], "o") &&
                            Objects.equals(table[2][2], "o") ||
                    Objects.equals(table[0][0], "o") &&
                            Objects.equals(table[1][0], "o") &&
                            Objects.equals(table[2][0], "o") ||
                    Objects.equals(table[0][1], "o") &&
                            Objects.equals(table[1][1], "o") &&
                            Objects.equals(table[2][1], "o") ||
                    Objects.equals(table[0][2], "o") &&
                            Objects.equals(table[1][2], "o") &&
                            Objects.equals(table[2][2], "o") ||
                    Objects.equals(table[0][0], "o") &&
                            Objects.equals(table[1][1], "o") &&
                            Objects.equals(table[2][2], "o") ||
                    Objects.equals(table[0][2], "o") &&
                            Objects.equals(table[1][1], "o") &&
                            Objects.equals(table[2][0], "o")
            ) {
                JFrame jFrame = new JFrame();

                JOptionPane.showMessageDialog(jFrame, "o wins");

            } else if (Objects.equals(table[0][0], "x") &&
                    Objects.equals(table[0][1], "x") &&
                    Objects.equals(table[0][2], "x") ||
                    Objects.equals(table[1][0], "x") &&
                            Objects.equals(table[1][1], "x") &&
                            Objects.equals(table[1][2], "x") ||
                    Objects.equals(table[2][0], "x") &&
                            Objects.equals(table[2][1], "x") &&
                            Objects.equals(table[2][2], "x") ||
                    Objects.equals(table[0][0], "x") &&
                            Objects.equals(table[1][0], "x") &&
                            Objects.equals(table[2][0], "x") ||
                    Objects.equals(table[0][1], "x") &&
                            Objects.equals(table[1][1], "x") &&
                            Objects.equals(table[2][1], "x") ||
                    Objects.equals(table[0][2], "x") &&
                            Objects.equals(table[1][2], "x") &&
                            Objects.equals(table[2][2], "x") ||
                    Objects.equals(table[0][0], "x") &&
                            Objects.equals(table[1][1], "x") &&
                            Objects.equals(table[2][2], "x") ||
                    Objects.equals(table[0][2], "x") &&
                            Objects.equals(table[1][1], "x") &&
                            Objects.equals(table[2][0], "x")) {
                JFrame jFrame = new JFrame();

                JOptionPane.showMessageDialog(jFrame, "x wins");
            }

        }

    }


    static int x = 2;

    public static void main(String[] args) {


        Runnable guiCreator = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("TicTacToe");

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(3, 3));

                JButton button1 = new JButton("1");
                JButton button2 = new JButton("2");
                JButton button3 = new JButton("3");
                JButton button4 = new JButton("4");
                JButton button5 = new JButton("5");
                JButton button6 = new JButton("6");
                JButton button7 = new JButton("7");
                JButton button8 = new JButton("8");
                JButton button9 = new JButton("9");

                frame.add(button1);
                frame.add(button2);
                frame.add(button3);
                frame.add(button4);
                frame.add(button5);
                frame.add(button6);
                frame.add(button7);
                frame.add(button8);
                frame.add(button9);


                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button1.setText("x");
                            table[0][0] = "x";
                        } else {
                            button1.setText("o");
                            table[0][0] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button1.setEnabled(false);
                    }
                });

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button2.setText("x");
                            table[0][1] = "x";
                        } else {
                            button2.setText("o");
                            table[0][1] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button2.setEnabled(false);
                    }
                });

                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button3.setText("x");
                            table[0][2] = "x";
                        } else {
                            button3.setText("o");
                            table[0][2] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button3.setEnabled(false);
                    }
                });

                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button4.setText("x");
                            table[1][0] = "x";
                        } else {
                            button4.setText("o");
                            table[1][0] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button4.setEnabled(false);
                    }
                });

                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button5.setText("x");
                            table[1][1] = "x";
                        } else {
                            button5.setText("o");
                            table[1][1] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button5.setEnabled(false);
                    }
                });

                button6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button6.setText("x");
                            table[1][2] = "x";
                        } else {
                            button6.setText("o");
                            table[1][2] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button6.setEnabled(false);
                    }
                });

                button7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button7.setText("x");
                            table[2][0] = "x";
                        } else {
                            button7.setText("o");
                            table[2][0] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button7.setEnabled(false);
                    }
                });

                button8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button8.setText("x");
                            table[2][1] = "x";
                        } else {
                            button8.setText("o");
                            table[2][1] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button8.setEnabled(false);
                    }
                });

                button9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (x % 2 == 0) {
                            button9.setText("x");
                            table[2][2] = "x";
                        } else {
                            button9.setText("o");
                            table[2][2] = "o";
                        }
                        tictactoeLogic();
                        x++;
                        button9.setEnabled(false);
                    }
                });

                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(guiCreator);

    }

}
