package Vista;

import Grafo.Arista;
import java.awt.Color;
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
                if (nodo != null) {
                    g.drawString("" + nodo.getId(), nodo.getX() + 8, nodo.getY() + 12);
                    if (nodo.isHabilidato()) {
                        g.drawString("Y", nodo.getX(), nodo.getY());
                    }
                    if (nodo.getHuesped() != null) {
                        g.drawString("H", nodo.getX() + 7, nodo.getY());
                    }
                }
            }
            for (Arista[] aristas : this.grafo.getMatrizAD()) {
                for (Arista arista : aristas) {
                    if (arista != null) {
                        if(!arista.isTipo())
                            g.setColor(Color.red);
                        else
                            g.setColor(Color.black);
                        g.drawLine(arista.getPosXO(), arista.getPosYO(), arista.getPosXD(), arista.getPosYD());
                        if (!arista.isObstruida()) {
                            g.fillOval(arista.getPosXD(), arista.getPosYD(), 7, 7);
                        } else {
                            g.drawOval(arista.getPosXD(), arista.getPosYD(), 7, 7);
                        }
                    }
                }
            }
        }
        repaint();
//        super.paint(g);
    }

//    switch (this.getDireccion(arista.getPosXO(), arista.getPosYO(),
//                                arista.getPosXD(), arista.getPosYD())) {
//                            case 1: {
//                                g.drawLine(arista.getPosXO(), arista.getPosYO() - 10, arista.getPosXD(), arista.getPosYD() -32);
//                                if (!arista.isObstruida()) {
//                                    g.fillOval(arista.getPosXD(), arista.getPosYD() -32, 7, 7);
//                                } else {
//                                    g.drawOval(arista.getPosXD(), arista.getPosYD() -32, 7, 7);
//                                }
//                            }
//                            break;
//                            case 2: {
//                                g.drawLine(arista.getPosXO() + 32, arista.getPosYO(), arista.getPosXD() - 10, arista.getPosYD());
//                                if (!arista.isObstruida()) {
//                                    g.fillOval(arista.getPosXD() - 10, arista.getPosYD(), 7, 7);
//                                } else {
//                                    g.fillOval(arista.getPosXD() - 10, arista.getPosYD(), 7, 7);
//                                }
//                            }
//                            break;
//                            case 3: {
//                                g.drawLine(arista.getPosXO(), arista.getPosYO() + 10, arista.getPosXD(), arista.getPosYD()-10);
//                                if (!arista.isObstruida()) {
//                                    g.fillOval(arista.getPosXD(), arista.getPosYD() - 10, 7, 7);
//                                } else {
//                                    g.drawOval(arista.getPosXD(), arista.getPosYD() - 10, 7, 7);
//                                }
//                            }
//                            break;
//                            case 4: {
//                                g.drawLine(arista.getPosXO() - 7, arista.getPosYO(), arista.getPosXD() - 37, arista.getPosYD());
//                                if (!arista.isObstruida()) {
//                                    g.fillOval(arista.getPosXD() - 37, arista.getPosYD(), 7, 7);
//                                } else {
//                                    g.drawOval(arista.getPosXD() - 37, arista.getPosYD(), 7, 7);
//                                }
//                            }
//                            break;
//                        }
    private int valABS(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    /*
     Calcula la dirección en que debe ir el carro
     */
    private int getDireccion(int xo, int yo, int xd, int yd) {
        int res = 0;
        if (valABS(xd, xo) < 32) {
            if (yd > yo) {
                res = 3;
            } else {
                res = 1;
            }
        } else {
            if (xd > xo) {
                res = 2;
            } else {
                res = 4;
            }
        }
//        System.out.println("Res: " + res);
        return res;
    }
}
