package herencia;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiMouseAdapter extends MouseAdapter {
       
    @Override
     public void mouseClicked(MouseEvent e) {
          int x = e.getX();
          int y = e.getY();
          if(x > 30 && x < 270 && y > 50 && y < 270){
              System.out.println("Hiciste click");
          }
     }
       
    
}

