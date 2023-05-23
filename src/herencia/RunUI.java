
package herencia;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

public class RunUI {
     public static void main(String[] args) {
         
        Computadora c = new Computadora("Hp", "50302", "Hp", "Hp pavilon", "intel", "12345", "intel" , "Intel core i9", 1500, 1200, 16);
        Microprocesador mp = new Microprocesador("intel", "38223", "intel", "Core i9", 5000, new ArrayList<ComponenteElectronico> (), 1500,  1200);
        Pantalla p = new Pantalla("Samsung", "393014",  "Samsung", "Pantalla led",  2500, new ArrayList<ComponenteElectronico> (), 1080, 1080);
        Sensor s = new Sensor("digitalPerson" , "03918", "digitalPerson", "Sensor digital", 1000,  new ArrayList<ComponenteElectronico> (), "Huellas", "Pascal", 500);
        Smartphone sp = new Smartphone("Apple", "8121", "Apple", "Iphone 14", 25000, new ArrayList(), 
            "Apple", "0189", "Apple", "Apple A15 Bionic 8", 143, 236, 8,
            "4502", "Sensor apple", "pascal", 1050 , "46602", "Super Retina XDR", 1170, 2532, 6000, 5000, 5000);
        Television t= new Television("Samsung", "7896", "Samsung" , "Samsung led smart TV" , 15000, new ArrayList(),"LG", "8245", "Samsung", "Oled",  7680, 4320, 13000);
        
        DispositivoElectronico de = new DispositivoElectronico("Logitec", "3910", "Logitec",  "Mouse Logitec",  500, new ArrayList<ComponenteElectronico> ());
        DispositivoElectronicoDeConsumo dedc = new DispositivoElectronicoDeConsumo("Casio", "93902", "Casio", " FX-991MS", 500,  new ArrayList<ComponenteElectronico> (), true);
        ComponenteElectronico ce = new ComponenteElectronico( "Etsist", "7408",  "Etsist", "Compuerta logica", 20, new ArrayList());
        
        UIs canvas = new UIs(de, ce, dedc, c, sp, t, mp, p, s);
        MiMouseAdapter mouse = new MiMouseAdapter();
        mouse.setDispositivos(de, ce, dedc, c, sp, t, mp, p, s);
        canvas.addMouseListener(mouse);
        canvas.setBackground(Color.WHITE);
        
        JFrame frame = new JFrame();
        
        frame.add(canvas);
        frame.setSize(980, 980);
        frame.setVisible(true);
        
        
        
    }
}
