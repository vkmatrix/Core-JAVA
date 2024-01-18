import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JButton;

class myMouseListener extends MouseAdapter
{
    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("MOUSE IS CLICKED!!!");
    }
}

public class AdapterClass {
    public static void main(String[] ar) {
        JFrame frame=new JFrame("EXAMPLE OF ADAPTER CLASS USING MOUSE CLICK");
        JButton button=new JButton("CLICK ME !!!");
        myMouseListener o1=new myMouseListener();
        button.addMouseListener(o1);
        frame.add(button);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
    
}
