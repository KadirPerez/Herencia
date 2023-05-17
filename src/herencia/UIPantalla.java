
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UIPantalla {

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

   public BufferedImage getImagen(){
        return image;
    }
}