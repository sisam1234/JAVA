
package MouseListener_eg;
import java.awt.*;
import java.awt.event.*;
public class mouselistener implements MouseListener {
        Label l;
        mouselistener(){
        Frame f = new Frame();
        l = new Label();
        l.setBounds(20,50,100,20);
        f.add(l);f.addMouseListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }
    public static void main(String[] args) throws Exception{
        new mouselistener();
    }
    
}
