package Vista;

import Grafo.Nodo;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Vista extends javax.swing.JFrame {

    int cont;
    Grafo.Grafo grafo;

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
                    .addComponent(jButton2))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
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
        for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
            if (nodo.getArea().contains(evt.getX(), evt.getY())) {
                if (this.chbxHabDesN.isSelected()) {
                    if (nodo.isHabilidato()) {
                        nodo.setHabilidato(false);
                    } else if (nodo.getHuesped() != null) {
                        nodo.setHabilidato(true);
                    }
                } else if (this.chbxCrearElimCD.isSelected()) {
                    if (nodo.getHuesped() == null) {
                        nodo.creaCDistr();
                    } else {
                        nodo.setHuesped(null);
                    }
                }

            }
        }
        System.out.println("x: " + evt.getX() + " y: " + evt.getY());
    }//GEN-LAST:event_panelFondoMouseClicked

    private void chbxHabDesNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesNActionPerformed
        if (this.chbxHabDesN.isSelected()) {
            this.chbxCrearElimCD.setSelected(false);
        }

    }//GEN-LAST:event_chbxHabDesNActionPerformed

    private void chbxCrearElimCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxCrearElimCDActionPerformed
        if (this.chbxCrearElimCD.isSelected()) {
            this.chbxHabDesN.setSelected(false);
        }
    }//GEN-LAST:event_chbxCrearElimCDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Grafo.Nodo[] ruta = new Nodo[15];
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
        ruta[11] = null;
//        ruta[11] = this.grafo.getListNodos()[10];
        ruta[12] = this.grafo.getListNodos()[9];
        ruta[13] = this.grafo.getListNodos()[1];
        ruta[14] = this.grafo.getListNodos()[4];
        Thread hilo = new Thread(new Hilos.Vehiculo(this.jLabel1, ruta));
        hilo.start();
        System.out.println("Terminó el hilo vista");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LinkedList<Integer> ruta = new LinkedList<>();
        this.grafo.getIntRuta(1, 20, ruta);
        for(Integer n : ruta){
            System.out.print(", "+n);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JCheckBox chbxHabDesN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        ((Panel) panelFondo).setImagen("../Recursos/MapaCiudad.jpg");
        this.grafo = new Grafo.Grafo(108);
        ((Panel) panelFondo).setGrafo(this.grafo);
        
//        this.chbxHabDesN.setSelected(true);
    }

}
