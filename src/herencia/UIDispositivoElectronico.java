package herencia;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UIDispositivoElectronico {
    
    private BufferedImage image;
    private DispositivoElectronico dispositivo;

    public UIDispositivoElectronico(String archivo, DispositivoElectronico dispositivo) {
        try {
            image = ImageIO.read(new File(archivo));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispositivo = dispositivo;
    }
    
    public BufferedImage getImagen(){
        return image;
    }
}
