import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame{
    private Lienzo dibujo;
    private Timer tiempo;
    
    public Ventana(int ancho, int alto){
        this.setSize(ancho, alto);
        dibujo=new Lienzo();
        this.add(dibujo);
        
        EscuchadorTiempo escuchaTiempo=new EscuchadorTiempo();
        tiempo=new Timer(100, escuchaTiempo);
        tiempo.start();
        
        EscuchadorTeclado escuchaTeclado=new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class EscuchadorTiempo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){   
            //lienzo.actua();
            //rePaint();
        }
    }
    
     class EscuchadorTeclado implements KeyListener{
        @Override
        public void keyPressed(KeyEvent e){
            if(e.getKeyChar()=='d')
                tiempo.stop();
            else
                tiempo.start();
            System.out.println("keyPressed: "+e.getKeyChar());
        }
        
        @Override
        public void keyReleased(KeyEvent e){
            System.out.println("keyReleased: "+e.getKeyChar());
        }
        
        @Override
        public void keyTyped(KeyEvent e){
            System.out.println("keyTyped:"+e.getKeyChar());
        }
        
    }
}
