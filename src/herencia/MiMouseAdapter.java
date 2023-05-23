package herencia;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiMouseAdapter extends MouseAdapter {
       
    private int x;
    private int y;
    private Computadora c;
    private Microprocesador mp;
    private Pantalla p;
    private Sensor s;
    private Smartphone sp;
    private Television t;
    private DispositivoElectronico de;
    private DispositivoElectronicoDeConsumo dedc;
    private ComponenteElectronico ce;
    
    @Override
     public void mouseClicked(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          
          if(x>110 && x< 230 && y>68 && y<290){
              System.out.println(de + "\n\n");
          }
          
          if(x>414 && x< 545 && y>30 && y<310){
              System.out.println(dedc + "\n\n");
          }
          
          if(x>685 && x< 897 && y>95 && y<207){
              System.out.println(ce + "\n\n");
          }
          
          if(x>80 && x< 300 && y>390 && y<560){
              System.out.println(c + "\n\n");
          }
          
          if(x>415 && x< 545 && y>357 && y<640){
              System.out.println(sp + "\n\n");
          }
          
          if(x>640 && x< 940 && y>377 && y<550){
              System.out.println(t + "\n\n");
          }
          
          if(x>31 && x< 315 && y>660 && y<905){
              System.out.println(mp + "\n\n");
          }
          
          if(x>380 && x< 640 && y>730 && y<887){
              System.out.println(p + "\n\n");
          }
          
          if(x>735 && x< 844 && y>697 && y<905){
              System.out.println(s + "\n\n");
          }
          
     }
     
     public void setDispositivos(DispositivoElectronico de, ComponenteElectronico ce, DispositivoElectronicoDeConsumo dedc, Computadora c, Smartphone sp, Television t, Microprocesador mp, Pantalla p, Sensor s){
        this.c = c;
        this.mp = mp;
        this.p = p;
        this.s = s;
        this.sp = sp;
        this.t = t;
        this.de = de;
        this.dedc = dedc;
        this.ce = ce;
     }
     
}

