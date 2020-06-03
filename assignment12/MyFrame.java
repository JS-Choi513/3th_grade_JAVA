package assignment12;
import javax.swing.*;


import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(Color.YELLOW);
        contentPane.add(new JButton("click"));
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
    
}