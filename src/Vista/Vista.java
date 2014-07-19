package Vista;

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
                        .addComponent(jLabel1)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
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
                    } else if(nodo.getHuesped() != null){
                        nodo.setHabilidato(true);
                    }
                    System.out.println("id: " + nodo.getId() + ", x: " + nodo.getX() + ", y: " + nodo.getY());
                }else if(this.chbxCrearElimCD.isSelected()){
                    if(nodo.getHuesped() == null)
                        nodo.creaCDistr();
                    else
                        nodo.setHuesped(null);
                }
                
            }
        }
//        System.out.println(evt.getX() + ", " + evt.getY());
    }//GEN-LAST:event_panelFondoMouseClicked

    private void chbxHabDesNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesNActionPerformed
        if(this.chbxHabDesN.isSelected()){
            this.chbxCrearElimCD.setSelected(false);
        }
            
    }//GEN-LAST:event_chbxHabDesNActionPerformed

    private void chbxCrearElimCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxCrearElimCDActionPerformed
        if(this.chbxCrearElimCD.isSelected()){
            this.chbxHabDesN.setSelected(false);
        }
    }//GEN-LAST:event_chbxCrearElimCDActionPerformed

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
