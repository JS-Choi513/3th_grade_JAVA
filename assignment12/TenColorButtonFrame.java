package assignment12;
import java.awt.*;
import javax.swing.*;

public class TenColorButtonFrame extends JFrame {
    public TenColorButtonFrame(){
        Container colorwindow = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorwindow.setLayout(new GridLayout(0,10));
        //for(int i = 0; i<10; i++){
        //    JButton btn = new JButton(String.valueOf(i));
        //    colorwindow.add(btn);
        //}
        JButton btn1 = new JButton("0");
        btn1.setBackground(Color.RED);
        colorwindow.add(btn1);
        JButton btn2 = new JButton("1");
        btn2.setBackground(Color.ORANGE);
        colorwindow.add(btn2);
        JButton btn3 = new JButton("2");
        btn3.setBackground(Color.YELLOW);
        colorwindow.add(btn3);
        JButton btn4 = new JButton("3");
        btn4.setBackground(Color.GREEN);
        colorwindow.add(btn4);
        JButton btn5 = new JButton("4");
        btn5.setBackground(Color.CYAN);
        colorwindow.add(btn5);
        JButton btn6 = new JButton("5");
        btn6.setBackground(Color.BLUE);
        colorwindow.add(btn6);
        JButton btn7 = new JButton("6");
        btn7.setBackground(Color.MAGENTA);
        colorwindow.add(btn7);
        JButton btn8 = new JButton("7");
        btn8.setBackground(Color.DARK_GRAY);
        colorwindow.add(btn8);
        JButton btn9 = new JButton("8");
        btn9.setBackground(Color.PINK);
        colorwindow.add(btn9);
        JButton btn10 = new JButton("9");
        btn10.setBackground(Color.GRAY);
        colorwindow.add(btn10);
        colorwindow.setBackground(Color.WHITE);
        
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args){
        new TenColorButtonFrame();
    }
    
}