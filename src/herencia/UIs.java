package herencia;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public class UIs extends Canvas{
    
    
    private UIComputadora UIC;
    private UIMicroprocesador UIM;
    private UIPantalla UIP;
    private UISensor UIS;
    private UISmartphone UISP;
    private UITelevision UIT;
    private UIComponenteElectronico UICE;
    private UIDispositivoElectronico UIDE;
    private UIDispositivoElectronicoDeConsumo UIDEDC;
    
    public UIs(DispositivoElectronico de, ComponenteElectronico ce, DispositivoElectronicoDeConsumo dedc, Computadora c, Smartphone sp, Television t, Microprocesador mp, Pantalla p, Sensor s){
        UIC = new UIComputadora("src/herencia/Imagenes/Computadora.jpg", c);
        UIM = new UIMicroprocesador("src/herencia/Imagenes/Cpu.png", mp);
        UIP = new UIPantalla("src/herencia/Imagenes/Pantalla.png", p);
        UIS = new UISensor("src/herencia/Imagenes/Sensor.png",s);
        UISP = new UISmartphone("src/herencia/Imagenes/Celular.png", sp); 
        UIT = new UITelevision("src/herencia/Imagenes/Television.jpg", t);
        UIDE = new UIDispositivoElectronico("src/herencia/Imagenes/Dispositivo.png", de);
        UICE = new UIComponenteElectronico("src/herencia/Imagenes/Componente.png", ce);
        UIDEDC = new UIDispositivoElectronicoDeConsumo("src/herencia/Imagenes/DispositivoConsumo.jpeg", dedc);
    }
    
    @Override
    public void paint(Graphics g) {
        
        g.drawImage(UIDE.getImagen(), 20, 50, 300, 300, this);
        g.drawImage(UIDEDC.getImagen(), 330, 20, 300, 300, this);
        g.drawImage(UICE.getImagen(), 640, 0, 300, 300, this);
        
        g.drawImage(UIC.getImagen(), 20, 320, 300, 300, this);
        g.drawImage(UISP.getImagen(), 330, 350, 300, 300, this);
        g.drawImage(UIT.getImagen(), 640, 320, 300, 300, this);
        
        g.drawImage(UIM.getImagen(), 20, 630, 300, 300, this);
        g.drawImage(UIP.getImagen(), 360, 660, 300, 300, this);
        g.drawImage(UIS.getImagen(), 640, 630, 300, 300, this);
        
    }
}
