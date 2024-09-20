
import java.awt.*;
import java.awt.event.*;
public class key_listener implements KeyListener {
    Label l;
    TextArea area;
    key_listener(){
        Frame f = new Frame();
        l = new Label();
        l.setBounds(20,50,100,20);
        area = new TextArea();
        area.setBounds(20,89,150,150);
        area.addKeyListener(this);
        f.add(l);f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed.");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released.");
    }
    public static void main(String[] args) throws Exception{
        new key_listener();
    }
}
