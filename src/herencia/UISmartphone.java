
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UISmartphone extends java.awt.Panel{

   private BufferedImage image;
   private Smartphone celular;

   public UISmartphone(String archivo, Smartphone celular) {
  	try {
     	image = ImageIO.read(new File(archivo));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
        this.celular = celular;
   }

   public void paint(Graphics g) {
  	g.drawImage(image, 10, 10, 300, 300, this);
   }

   public static void main(String[] args) {
    	UISmartphone panel = new UISmartphone("src/herencia/Celular.jpg", new Smartphone("", "", "", "", "", "", "", 0, "", "", 0, 0));
  	MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
   }
}
