package Pertemuan15;

import javax.swing.*;

// Latihan 1-2
public class HelloWorldForm2 extends JFrame //1
{
    private JLabel label; //2
    
    //3
    public HelloWorldForm2() 
    {
        label = new JLabel();
        label.setText("Hallo Dunia!");

        add(label);
        setTitle("Program Pertama");

        setSize(600, 300);
    }
}

