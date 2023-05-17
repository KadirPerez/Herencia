package herencia;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UIComputadora extends java.awt.Panel {

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

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, 300, 300, this);
    }

    public static void main(String[] args) {
        UIComputadora panel = new UIComputadora("src/herencia/Computadora.png", new Computadora("", "", "", ""));
        MiMouseAdapter mouse = new MiMouseAdapter();
        panel.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
    }
}
