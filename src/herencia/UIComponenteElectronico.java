
package herencia;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UIComponenteElectronico {
    
    private BufferedImage image;
    private ComponenteElectronico componente;

    public UIComponenteElectronico(String archivo, ComponenteElectronico componente) {
        try {
            image = ImageIO.read(new File(archivo));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.componente = componente;
    }
    
    public BufferedImage getImagen(){
        return image;
    }
}
