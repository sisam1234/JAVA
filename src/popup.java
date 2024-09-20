import javax.swing.*;
import java.awt.event.*;



public class popup {
    public static void main(String[] args){
        JFrame f= new JFrame();
        JPopupMenu  m = new JPopupMenu("Edit");
        JMenuItem cut =new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        m.add(cut);
        m.add(paste);
        m.add(copy);
        f.add(m);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                m.show(f,e.getX(),e.getY());
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
