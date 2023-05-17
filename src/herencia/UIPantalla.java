
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UIPantalla extends java.awt.Panel {

   private BufferedImage image;
   private Pantalla pantalla;

   public UIPantalla(String archivo, Pantalla pantalla) {
  	try {
     	image = ImageIO.read(new File(archivo));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
        this.pantalla = pantalla;
   }

   public void paint(Graphics g) {
  	g.drawImage(image, 10, 10, 300, 300, this);
   }

   public static void main(String[] args) {
    	UIPantalla panel = new UIPantalla("src/herencia/Pantalla.jpg", new Pantalla("", "", "", "", 0, 0));
  	MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
   }
}