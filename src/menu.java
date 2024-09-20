import javax.swing.*;
public class menu {
    
    public static void main(String[] args){
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4;
    JFrame f= new JFrame();
    JMenuBar mb= new JMenuBar();
    menu = new JMenu("Menu");
    submenu = new JMenu("sub menu");
    i1= new JMenuItem("1");
    i2= new JMenuItem("2");
    i3= new JMenuItem("3");
    i4= new JMenuItem("4");
    menu.add(i1);
    menu.add(i2);
    
    submenu.add(i3);
    submenu.add(i4);
    menu.add(submenu);
    mb.add(menu);
    f.add(mb);
    f.setJMenuBar(mb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

    }
}
