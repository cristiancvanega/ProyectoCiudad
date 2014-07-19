package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {

    private Image imagen;
    private Grafo.Grafo grafo;

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

    public void setGrafo(Grafo.Grafo grafo) {
        this.grafo = grafo;
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 175, 0, 915, 715, this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        if (this.grafo != null) {
            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
                g.drawString(""+nodo.getId(), nodo.getX()+8, nodo.getY()+12);
                if(nodo.isHabilidato())
                    g.drawString("Y", nodo.getX(), nodo.getY());
                if(nodo.getHuesped() != null)
                    g.drawString("H", nodo.getX()+7, nodo.getY());
            }
        }
        repaint();
//        super.paint(g);
    }
}
