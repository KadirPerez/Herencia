
package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class UISensor{

   private BufferedImage image;
   private Sensor sensor;

   public UISensor(String archivo, Sensor sensor) {
  	try {
     	image = ImageIO.read(new File(archivo));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
        this.sensor = sensor;
   }

    public BufferedImage getImagen(){
        return image;
    }
}