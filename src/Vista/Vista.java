package Vista;

import Grafo.Arista;
import Grafo.Nodo;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Vista extends javax.swing.JFrame {

    int cont;
    Grafo.Grafo grafo;
    int tamano;

    public Vista() {
        initComponents();
        cont = 64;
        this.cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new Panel();
        chbxHabDesN = new javax.swing.JCheckBox();
        chbxCrearElimCD = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        chbxHabDesA = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Ciudad Del 5");
        setResizable(true);

        panelFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelFondo.setOpaque(false);
        panelFondo.setPreferredSize(new java.awt.Dimension(915, 715));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFondoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        chbxHabDesN.setText("Hab/Des Nodos");
        chbxHabDesN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxHabDesNActionPerformed(evt);
            }
        });

        chbxCrearElimCD.setText("Crear/elim CD");
        chbxCrearElimCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxCrearElimCDActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carro.jpg"))); // NOI18N

        jButton1.setText("Prueba ruta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("P referencia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        chbxHabDesA.setText("Hab/Des arist");
        chbxHabDesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxHabDesAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxHabDesN)
                    .addComponent(chbxCrearElimCD)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxHabDesA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chbxHabDesN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbxCrearElimCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbxHabDesA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseClicked
        if (this.chbxHabDesN.isSelected()) {
            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
                if (nodo != null) {
                    if (nodo.getArea().contains(evt.getX(), evt.getY())) {
                        if (nodo.isHabilidato()) {
                            nodo.setHabilidato(false);
                        } else if (nodo.getHuesped() != null) {
                            nodo.setHabilidato(true);
                        }
                        break;
                    }
                }
            }
        }
        if (this.chbxCrearElimCD.isSelected()) {
            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
                if (nodo != null) {
                    if (nodo.getArea().contains(evt.getX(), evt.getY())) {
                        if (nodo.getHuesped() == null) {
                            nodo.creaCDistr();
                        } else {
                            nodo.setHuesped(null);
                        }
                        break;
                    }
                }
            }
        }
        if (this.chbxHabDesA.isSelected()) {
            Grafo.Arista[][] arista = this.grafo.getMatrizAD();
            for (int i = 0; i < this.tamano; i++) {
                for (int j = 0; j < this.tamano; j++) {
                    if (arista[i][j] != null) {
                        if (arista[i][j].getArea().contains(evt.getX(), evt.getY())) {
                            if (arista[i][j].isObstruida()) {
                                arista[i][j].setObstruida(false);
                            } else {
                                arista[i][j].setObstruida(true);
                            }
                            System.out.println("arista encontrada... i: "+i+", j: "+j);
                        }
                    }
                }
            }
            System.out.println("Buscando arista...");
        }
//        System.out.println("x: " + evt.getX() + " y: " + evt.getY());
    }//GEN-LAST:event_panelFondoMouseClicked

    private void chbxHabDesNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesNActionPerformed
        if (this.chbxHabDesN.isSelected()) {
            this.chbxCrearElimCD.setSelected(false);
            this.chbxHabDesA.setSelected(false);
        }

    }//GEN-LAST:event_chbxHabDesNActionPerformed

    private void chbxCrearElimCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxCrearElimCDActionPerformed
        if (this.chbxCrearElimCD.isSelected()) {
            this.chbxHabDesN.setSelected(false);
            this.chbxHabDesA.setSelected(false);
        }
    }//GEN-LAST:event_chbxCrearElimCDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Grafo.Nodo[] ruta = new Nodo[16];
        ruta[0] = this.grafo.getListNodos()[9];
        ruta[1] = this.grafo.getListNodos()[10];
        ruta[2] = this.grafo.getListNodos()[11];
        ruta[3] = this.grafo.getListNodos()[12];
        ruta[4] = this.grafo.getListNodos()[23];
        ruta[5] = this.grafo.getListNodos()[22];
        ruta[6] = this.grafo.getListNodos()[21];
        ruta[7] = this.grafo.getListNodos()[32];
        ruta[8] = this.grafo.getListNodos()[33];
        ruta[9] = this.grafo.getListNodos()[22];
        ruta[10] = this.grafo.getListNodos()[11];
//        ruta[11] = null;
        ruta[11] = this.grafo.getListNodos()[10];
        ruta[12] = this.grafo.getListNodos()[9];
        ruta[13] = this.grafo.getListNodos()[1];
        ruta[14] = this.grafo.getListNodos()[2];
        ruta[15] = this.grafo.getListNodos()[4];
        Thread hilo = new Thread(new Hilos.Vehiculo(this.jLabel1, ruta));
        hilo.start();
        System.out.println("Terminó el hilo vista");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int origen = Integer.parseInt(this.txtRuta.getText().split(",")[0]);
        int destino = Integer.parseInt(this.txtRuta.getText().split(",")[1]);
        LinkedList<Integer> ruta = new LinkedList<>();
//        int origen = 1;
//        int destino = 25;
        ruta.add(destino);
        this.grafo.getIntRuta(origen, destino, destino, ruta);
        ruta.add(origen);
        Grafo.Nodo[] trav = new Nodo[ruta.size()];
        int index = ruta.size() - 1;
        for (int i = 0; i < ruta.size(); i++) {
            trav[index] = this.grafo.getListNodos()[ruta.get(i)];
            index--;
        }
        System.out.println("Tam ruta: " + ruta.size());
        for (Integer n : ruta) {
            System.out.print(", " + n);
        }
        Thread hilo = new Thread(new Hilos.Vehiculo(this.jLabel1, trav));
        hilo.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chbxHabDesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesAActionPerformed
        if (this.chbxHabDesA.isSelected()) {
            this.chbxHabDesN.setSelected(false);
            this.chbxCrearElimCD.setSelected(false);
        }
    }//GEN-LAST:event_chbxHabDesAActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Vista v = new Vista();
                v.setLocationRelativeTo(null);
                v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbxCrearElimCD;
    private javax.swing.JCheckBox chbxHabDesA;
    private javax.swing.JCheckBox chbxHabDesN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        this.tamano = 108;
        ((Panel) panelFondo).setImagen("../Recursos/MapaCiudad.jpg");
        this.grafo = new Grafo.Grafo(this.tamano);
        ((Panel) panelFondo).setGrafo(this.grafo);

//        this.chbxHabDesN.setSelected(true);
    }

}
