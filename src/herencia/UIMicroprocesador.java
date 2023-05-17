
package herencia;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UIMicroprocesador  {

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

   public BufferedImage getImagen(){
        return image;
    }
}

