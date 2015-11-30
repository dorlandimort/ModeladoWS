package swing;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class JCSlidePanel extends JPanel{
    
    private enum ORIENTATION {
        LEFT,
        RIGHT
    }
    private ORIENTATION orientation         =   ORIENTATION.RIGHT;        
    private final int DISPLACEMENT          =   5;
    private final int SPEED                 =   6;
    private ArrayList<JPanel> jPanels    =   new ArrayList<JPanel>();
    private boolean isSlideInProgress       =   false;
    private Dimension dimension             =   new Dimension(360,332);
    //panels
    public JCPanelUser userPanel            =   new JCPanelUser();
    public JCPanelPass passPanel            =   new JCPanelPass();
   
    
    /** Constructor de clase */
    public JCSlidePanel()
    {
        super();        
        setLayout(new BorderLayout());        
        setSize( dimension );
        setVisible(true);
        
        //se añade los panels 
        jPanels.add(userPanel);
        userPanel.setSize(getSize());
        userPanel.setLocation(0,0);
        
        jPanels.add(passPanel);
        passPanel.setSize(getSize());
        passPanel.setLocation(0,0);
      
        
        add(userPanel);
    }
       
    /** mueve slide a la izquierda */
    public void moveLeft()
    {        
        initSlide(ORIENTATION.LEFT);
    }
    
    /** mueve slide a la derecha */
    public void moveRight()
    {        
        initSlide(ORIENTATION.RIGHT);
    }
    
    /**
     * Inicia el hilo para el efecto de slide 
     * @param ORIENTATION
     */
    private void initSlide(ORIENTATION value) {        
        orientation = value;
        if (!isSlideInProgress) {
            isSlideInProgress = true;
            final Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    move();                                
                    isSlideInProgress = false;
                }
            });
            thread.setDaemon(true);
            thread.start();
        }        
    }
    
    /**
     * Mueve los panels a la izquierda o la derecha
     */
    private void move() {    
    
        JPanel componentOld = null;
        JPanel componentNew = null;
        
        //intercambia orden de los panels        
        if ( orientation == ORIENTATION.LEFT ) {            
            componentNew = jPanels.remove(1);
            componentOld = jPanels.get(0);
            jPanels.add(0, componentNew);
        }
        if (orientation == ORIENTATION.RIGHT ) {
            componentOld = jPanels.remove(0);
            jPanels.add(componentOld);
            componentNew = jPanels.get(0);
        }
        
        Point p1 = componentOld.getLocation();
        Point p2 = new Point(0, 0);
        
        switch (orientation) {
            case LEFT: p2.x += getWidth(); break;
            case RIGHT: p2.x -= getWidth(); break;
        }        
        
        componentNew.setLocation(p2);
        add(componentNew);
        revalidate();
        //
        for (int i = 0; i != ( getWidth() / DISPLACEMENT ); i++) {
            switch (orientation) {
                case LEFT: 
                        p1.x -= DISPLACEMENT;
                        componentOld.setLocation(p1);
                        p2.x -= DISPLACEMENT;
                        componentNew.setLocation(p2);
                        break;                
                    case RIGHT: 
                        p1.x += DISPLACEMENT;
                        componentOld.setLocation(p1);
                        p2.x += DISPLACEMENT;
                        componentNew.setLocation(p2);
                        break;                                               
                }

                try {
                    Thread.sleep( SPEED );
                } catch (Exception e) {}
            }            
        
        //posición
        componentOld.setLocation(-999, 0);
        componentNew.setLocation(0, 0);
    
}
    
}