// A program to count the words and characters

import java.awt.event.*;
import java.awt.*;

public class key_adapter extends KeyAdapter {
    Frame f; 
    Label l; 
    TextArea area; 
    key_adapter(){ 
        f=new Frame("Key Adapter"); 
        l=new Label(); 
        l.setBounds(20,50,200,20); 
        area=new TextArea(); 
        area.setBounds(20,80,300, 150); 
        area.addKeyListener(this); 
        f.add(l);f.add(area);
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true);
    } 
    public void keyReleased(KeyEvent e) { 
        String text=area.getText(); 
        String words[]=text.split("\\s"); 
        l.setText("Words: "+words.length+" Characters:"+text.length()); 
    }

    public static void main(String[] args) throws Exception{
        new key_adapter();
    }
}