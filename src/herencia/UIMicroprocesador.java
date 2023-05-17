
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UIMicroprocesador extends java.awt.Panel {

   private BufferedImage image;
   private Microprocesador microprocesador;

   public UIMicroprocesador(String archivo, Microprocesador microprocesador) {
  	try {
     	image = ImageIO.read(new File(archivo));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
        this.microprocesador = microprocesador;
   }

   public void paint(Graphics g) {
  	g.drawImage(image, 10, 10, 300, 300, this);
   }

   public static void main(String[] args) {
    	UIMicroprocesador panel = new UIMicroprocesador("src/herencia/Cpu.png", new Microprocesador("", "", "", "", 0, 0));
  	MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
   }
}

