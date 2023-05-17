
package herencia;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
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
   public BufferedImage getImagen(){
        return image;
    }
}
 
   
