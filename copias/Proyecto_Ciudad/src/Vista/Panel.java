package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {

    private Image imagen;

    public Panel() {
    }

    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        } else {
            imagen = null;
        }

        repaint();
        
    }
   
    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 175, 0, 915, 715, this);

            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
        
    }
}
