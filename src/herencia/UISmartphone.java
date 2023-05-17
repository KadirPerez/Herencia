
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UISmartphone{

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
   
   public BufferedImage getImagen(){
        return image;
    }
}
