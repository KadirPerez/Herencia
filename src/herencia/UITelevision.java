
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class UITelevision extends java.awt.Panel{

   private BufferedImage image;
   private Television television;

   public UITelevision(String archivo, Television television) {
  	try {
     	image = ImageIO.read(new File(archivo));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
        this.television = television;
   }

   public void paint(Graphics g) {
  	g.drawImage(image, 10, 10, 300, 300, this);
   }

   public static void main(String[] args) {
    	UITelevision panel = new UITelevision("src/herencia/Television.png", new Television(" ", " ", " ", " " , 0, new ArrayList(), " ", " ", " ", " ",  0, 0, 0));
  	MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
   }
}
 
   
