package Pertemuan15;

import javax.swing.*;

// Latihan 1-1
public class HelloWorldForm1 extends JFrame //1 
{ 
    private JLabel label; //2

    //3
    public HelloWorldForm1() {
        label = new JLabel(); 
        label.setText("Hello World");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
