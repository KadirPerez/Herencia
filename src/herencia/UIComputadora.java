package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UIComputadora{

    private BufferedImage image;
    private Computadora computadora;

    public UIComputadora(String archivo, Computadora computadora) {
        try {
            image = ImageIO.read(new File(archivo));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.computadora = computadora;
    }
    
    public BufferedImage getImagen(){
        return image;
    }
}