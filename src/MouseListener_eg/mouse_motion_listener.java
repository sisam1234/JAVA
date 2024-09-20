package MouseListener_eg;
import java.awt.*;
import java.awt.event.*;
public class mouse_motion_listener  implements MouseMotionListener {
    Frame f;
    mouse_motion_listener(){
        f = new Frame();
        f.addMouseMotionListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);

    }
    @Override
    public void mouseMoved(MouseEvent e) {}
    public static void main(String[] args) throws Exception{
        new mouse_motion_listener();
    }
}
