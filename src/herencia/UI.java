package herencia;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class UI extends Panel{
    
    private UIComputadora UIC;
    private UIMicroprocesador UIM;
    private UIPantalla UIP;
    private UISensor UIS;
    private UISmartphone UISP;
    private UITelevision UIT;
    
    public UI(Computadora c, Microprocesador mp, Pantalla p, Sensor s, Smartphone sp, Television t){
        UIC = new UIComputadora("src/herencia/Computadora.png", c);
        UIM = new UIMicroprocesador("src/herencia/Cpu.png", mp);
        UIP = new UIPantalla("src/herencia/Pantalla.jpg", p);
        UIS = new UISensor("src/herencia/Sensor.png",s);
        UISP = new UISmartphone("src/herencia/Celular.jpg", sp); 
        UIT = new UITelevision("src/herencia/Television.png", t);
    }
     
    @Override
    public void paint(Graphics g) {
        g.drawImage(UIC.getImagen(), 0, 110, 100, 100, this);
        g.drawImage(UISP.getImagen(), 110, 110, 100, 100, this);
        g.drawImage(UIT.getImagen(), 220, 110, 100, 100, this);
        
        g.drawImage(UIM.getImagen(), 0, 220, 100, 100, this);
        g.drawImage(UIP.getImagen(), 110, 220, 100, 100, this);
        g.drawImage(UIS.getImagen(), 220, 220, 100, 100, this);
        
    }
    
     public static void main(String[] args) {
        Computadora c = new Computadora("","","","");
        Microprocesador mp = new Microprocesador("","","","", 0, 0);
        Pantalla p = new Pantalla("","","","",0,0);
        Sensor s = new Sensor("","","","","","", 0);
        Smartphone sp = new Smartphone("","","","","","","",0,"","",0,0);
        Television t= new Television("","","","","","","","", 0, 0);
        
        UI panel = new UI(c, mp, p, s, sp, t);
        MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(320, 320);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
    }
    
}
