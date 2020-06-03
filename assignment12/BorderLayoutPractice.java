package assignment12;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutPractice extends JFrame{
    public BorderLayoutPractice(){
        Container window = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(Color.WHITE);
        window.setLayout(new BorderLayout(5,7));
        window.add(new JButton("North"),BorderLayout.NORTH);
        window.add(new JButton("West"),BorderLayout.WEST);
        window.add(new JButton("Center"),BorderLayout.CENTER);
        window.add(new JButton("East"),BorderLayout.EAST);
        window.add(new JButton("South"),BorderLayout.SOUTH);
        setVisible(true);
        setSize(500,300);

    }
    public static void main(String[] args){
        new BorderLayoutPractice();
    }
}
