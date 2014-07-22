package Vista;

import Grafo.Arista;
import Grafo.Nodo;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    int cont;
    Grafo.Grafo grafo;
    int tamano;
    LinkedList<Integer> listNoeditables;
    Pedidos pedido;

    /*A continuación los datos que tiene listEstVehiculos:
     int vehiculosAct;
     int vehiculosInac;
     int vehiculosSusp;
     int vehiculosTotal;
     int vehiculosTope;//Cantidad máxima de vehículos
     */
    LinkedList<Integer> listEstVehiculos;//

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
        btnPrutaPLabel = new javax.swing.JButton();
        btnPRParametros = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        chbxHabDesA = new javax.swing.JCheckBox();
        chbxRPedido = new javax.swing.JCheckBox();
        chbxIArista = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnAddCarro = new javax.swing.JButton();

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
            .addGap(0, 612, Short.MAX_VALUE)
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

        btnPrutaPLabel.setText("Prueba ruta");
        btnPrutaPLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrutaPLabelActionPerformed(evt);
            }
        });

        btnPRParametros.setText("P referencia");
        btnPRParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRParametrosActionPerformed(evt);
            }
        });

        chbxHabDesA.setText("Hab/Des arist");
        chbxHabDesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxHabDesAActionPerformed(evt);
            }
        });

        chbxRPedido.setText("Pedido");
        chbxRPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxRPedidoActionPerformed(evt);
            }
        });

        chbxIArista.setText("Inv. arist");
        chbxIArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxIAristaActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        btnAddCarro.setText("Add carro");
        btnAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarroActionPerformed(evt);
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
                    .addComponent(btnPrutaPLabel)
                    .addComponent(btnPRParametros)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxHabDesA)
                    .addComponent(chbxRPedido)
                    .addComponent(chbxIArista)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddCarro)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbxRPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbxIArista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCarro)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnPRParametros)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrutaPLabel)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel4))
                                                .addComponent(jLabel6)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel7))
                                            .addGap(6, 6, 6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel15))))
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseClicked
        boolean bandera = true;//Para salirse cuando se encuentre el nodo buscado
        int indice = 1;//cota inferioor, para evitar que se quede en ciclo infinito
        if (this.chbxHabDesN.isSelected()) {
            while (bandera && indice <= this.tamano) {
                if (this.grafo.getListNodos()[indice] != null) {
                    if (this.grafo.getListNodos()[indice].getArea().contains(evt.getX(), evt.getY())) {
                        if (this.grafo.getListNodos()[indice].isHabilidato()) {
                            this.grafo.getListNodos()[indice].setHabilidato(false);
                        } else if (this.grafo.getListNodos()[indice].getHuesped() != null) {
                            this.grafo.getListNodos()[indice].setHabilidato(true);
                        }
                        bandera = false;
                    }
                }
                indice++;
            }
        } else if (this.chbxCrearElimCD.isSelected()) {
            while (bandera && indice < this.tamano) {
                if (this.grafo.getListNodos()[indice] != null) {
                    if (this.grafo.getListNodos()[indice].getArea().contains(evt.getX(), evt.getY())) {
                        if (this.grafo.getListNodos()[indice].getArea().contains(evt.getX(), evt.getY())) {
                            if (this.grafo.getListNodos()[indice].getHuesped() == null) {
                                this.grafo.getListNodos()[indice].creaCDistr();
                            } else {
                                this.grafo.getListNodos()[indice].setHuesped(null);
                            }
                        }
                        bandera = false;
                    }
                }
                indice++;
            }
        } else if (this.chbxHabDesA.isSelected()) {
            Grafo.Arista[][] arista = this.grafo.getMatrizAD();
            for (int i = 0; i < this.tamano; i++) {
                if (!bandera) {
                    break;
                }
                for (int j = 0; j < this.tamano; j++) {
                    if (!bandera) {
                        break;
                    }
                    if (arista[i][j] != null) {
                        if (arista[i][j].getArea().contains(evt.getX(), evt.getY())) {
                            if (arista[i][j].isObstruida()) {
                                arista[i][j].setObstruida(false);
                            } else {
                                arista[i][j].setObstruida(true);
                            }
                            System.out.println("arista encontrada... i: " + i + ", j: " + j);
                            if(arista[i][j].isTipo()){
                                this.grafo.eventoAristaCamion();
                            }else{
                                this.grafo.eventoArista();
                            }
                            bandera = false;
                        }
                    }
                }
            }
//            indice =0;
//            int indice2 = 0;
//            while(bandera && indice < this.tamano){
//                while(bandera && indice2 < this.tamano){
//                    if (arista[indice][indice2] != null) {
//                        if (arista[indice][indice2].getArea().contains(evt.getX(), evt.getY())) {
//                            if (arista[indice][indice2].isObstruida()) {
//                                arista[indice][indice2].setObstruida(false);
//                            } else {
//                                arista[indice][indice2].setObstruida(true);
//                            }
//                            System.out.println("arista encontrada... i: " + indice + ", j: " + indice2);
//                            this.grafo.eventoArista();
//                            bandera = false;
//                        }
//                    }
//                    indice2 ++;
//                }
//                indice++;
//            }
//            System.out.println("Hab/des arista");
        } else if (this.chbxIArista.isSelected()) {
            Grafo.Arista[][] arista = this.grafo.getMatrizAD();
            for (int i = 0; i < this.tamano; i++) {
                if (!bandera) {
                    break;
                }
                for (int j = 0; j < this.tamano; j++) {
                    if (!bandera) {
                        break;
                    }
                    if (arista[i][j] != null) {
                        if (arista[i][j].getArea().contains(evt.getX(), evt.getY())) {
                            if (arista[j][i] == null) {
                                arista[j][i] = new Arista(arista[i][j].getDistancia(),
                                        arista[i][j].getVelocidad(), arista[i][j].getPeso(),
                                        arista[i][j].isTipo(), 300);
                            } else {
                                arista[j][i].setCarriles(arista[i][j].getCarriles() + 1);
                            }
                            if (arista[i][j].getCarriles() > 1) {
                                arista[i][j].setCarriles(arista[i][j].getCarriles() - 1);
                            } else {
                                arista[i][j] = null;
                            }
                            System.out.println("arista encontrada... i: " + i + ", j: " + j);
                            this.grafo.eventoAristaCamion();
                            this.grafo.cargaPosUnaArista(j, i);
                            bandera = false;
                        }
                    }
                }
            }
        } else if (this.chbxRPedido.isSelected()) {
            while (bandera && indice < this.tamano) {
                if (this.grafo.getListNodos()[indice] != null) {
                    if (this.grafo.getListNodos()[indice].getArea().contains(evt.getX(), evt.getY())
                            && !this.listNoeditables.contains(this.grafo.getListNodos()[indice].getId())
                            && this.grafo.getListNodos()[indice].isHabilidato()) {
                        this.pedido.setVisible(true);
                        bandera = false;
                    }
                }
                indice++;
            }
        }
        /*
         *El siguiente bloque funciona pero el anterior optimiza tiempo de ejecución,
         *pués usa while con una bandera para cortar la búsqueda en caso de encontrar
         *el nodo
         */
//        if (this.chbxHabDesN.isSelected()) {
//            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
//                if (nodo != null) {
//                    if (nodo.getArea().contains(evt.getX(), evt.getY())) {
//                        if (nodo.isHabilidato()) {
//                            nodo.setHabilidato(false);
//                        } else if (nodo.getHuesped() != null) {
//                            nodo.setHabilidato(true);
//                        }
//                    }
//                }
//            }
//        } else if (this.chbxCrearElimCD.isSelected()) {
//            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
//                if (nodo != null) {
//                    if (nodo.getArea().contains(evt.getX(), evt.getY())) {
//                        if (nodo.getHuesped() == null) {
//                            nodo.creaCDistr();
//                        } else {
//                            nodo.setHuesped(null);
//                        }
//                    }
//                }
//            }
//        } else if (this.chbxHabDesA.isSelected()) {
//            Grafo.Arista[][] arista = this.grafo.getMatrizAD();
//            for (int i = 0; i < this.tamano; i++) {
//                for (int j = 0; j < this.tamano; j++) {
//                    if (arista[i][j] != null) {
//                        if (arista[i][j].getArea().contains(evt.getX(), evt.getY())) {
//                            if (arista[i][j].isObstruida()) {
//                                arista[i][j].setObstruida(false);
//                            } else {
//                                arista[i][j].setObstruida(true);
//                            }
//                            System.out.println("arista encontrada... i: " + i + ", j: " + j);
//                            this.grafo.eventoArista();
//                        }
//                    }
//                }
//            }
////            System.out.println("Buscando arista...");
//        } else if (this.chbxRPedido.isSelected()) {
//            for (Grafo.Nodo nodo : this.grafo.getListNodos()) {
//                if (nodo != null) {
//                    if (nodo.getArea().contains(evt.getX(), evt.getY())
//                            && !this.listNoeditables.contains(nodo.getId())
//                            && nodo.isHabilidato()) {
//                        this.pedido.setVisible(true);
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_panelFondoMouseClicked

    private void chbxHabDesNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesNActionPerformed
        if (this.chbxHabDesN.isSelected()) {
            this.chbxCrearElimCD.setSelected(false);
            this.chbxHabDesA.setSelected(false);
            this.chbxRPedido.setSelected(false);
            this.chbxIArista.setSelected(false);
        }

    }//GEN-LAST:event_chbxHabDesNActionPerformed

    private void chbxCrearElimCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxCrearElimCDActionPerformed
        if (this.chbxCrearElimCD.isSelected()) {
            this.chbxHabDesN.setSelected(false);
            this.chbxHabDesA.setSelected(false);
            this.chbxRPedido.setSelected(false);
            this.chbxIArista.setSelected(false);
        }
    }//GEN-LAST:event_chbxCrearElimCDActionPerformed

    private void btnPrutaPLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrutaPLabelActionPerformed
        int origen = Integer.parseInt(this.txtRuta.getText().split(",")[0]);
        int destino = Integer.parseInt(this.txtRuta.getText().split(",")[1]);
        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//lbl.setIcon(new java.net.Url("imagenes/icono.png);
        LinkedList<Integer> ruta = new LinkedList<>();
//        int origen = 1;
//        int destino = 25;
        this.grafo.getIntRutaCamion(origen, destino, ruta);
        if (!ruta.isEmpty()) {
            ruta.addFirst(origen);
//            ruta.add(destino);
        }
        Grafo.Nodo[] trav = new Nodo[ruta.size()];
        for (int i = 0; i < ruta.size(); i++) {
            trav[i] = this.grafo.getListNodos()[ruta.get(i)];
        }
        System.out.println("Tam ruta: " + ruta.size());
        for (Integer n : ruta) {
            System.out.print(", " + n);
        }
        System.out.println("");
        if (!ruta.isEmpty() && this.listEstVehiculos.get(1) > 0) {
            System.out.println("antes de...");
            this.listEstVehiculos.add(0, this.listEstVehiculos.remove(0) + 1);
            this.listEstVehiculos.add(1, this.listEstVehiculos.remove(1) - 1);
            this.setVehicTxtSalida();
            Thread hilo = new Thread(new Hilos.Vehiculo(jLabel2, trav,
                    this.txtSalida, this.listEstVehiculos));
            hilo.start();
        }
        System.out.println("despues de...");

    }//GEN-LAST:event_btnPrutaPLabelActionPerformed

    private void btnPRParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRParametrosActionPerformed
        int origen = Integer.parseInt(this.txtRuta.getText().split(",")[0]);
        int destino = Integer.parseInt(this.txtRuta.getText().split(",")[1]);
        LinkedList<Integer> ruta = new LinkedList<>();
//        int origen = 1;
//        int destino = 25;
        this.grafo.getIntRuta(origen, destino, ruta);
        if (!ruta.isEmpty()) {
            ruta.addFirst(origen);
//            ruta.add(destino);
        }
        Grafo.Nodo[] trav = new Nodo[ruta.size()];
        for (int i = 0; i < ruta.size(); i++) {
            trav[i] = this.grafo.getListNodos()[ruta.get(i)];
        }
        System.out.println("Tam ruta: " + ruta.size());
        for (Integer n : ruta) {
            System.out.print(", " + n);
        }
        System.out.println("");
        if (!ruta.isEmpty() && this.listEstVehiculos.get(1) > 0) {
            System.out.println("antes de...");
            this.listEstVehiculos.add(0, this.listEstVehiculos.remove(0) + 1);
            this.listEstVehiculos.add(1, this.listEstVehiculos.remove(1) - 1);
            this.setVehicTxtSalida();
            Thread hilo = new Thread(new Hilos.Vehiculo(jLabel1, trav,
                    this.txtSalida, this.listEstVehiculos));
            hilo.start();
        }
    }//GEN-LAST:event_btnPRParametrosActionPerformed

    private void chbxHabDesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxHabDesAActionPerformed
        if (this.chbxHabDesA.isSelected()) {
            this.chbxHabDesN.setSelected(false);
            this.chbxCrearElimCD.setSelected(false);
            this.chbxRPedido.setSelected(false);
            this.chbxIArista.setSelected(false);
        }
    }//GEN-LAST:event_chbxHabDesAActionPerformed

    private void chbxRPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxRPedidoActionPerformed
        if (this.chbxRPedido.isSelected()) {
            this.chbxHabDesN.setSelected(false);
            this.chbxCrearElimCD.setSelected(false);
            this.chbxHabDesA.setSelected(false);
            this.chbxIArista.setSelected(false);
        }
    }//GEN-LAST:event_chbxRPedidoActionPerformed

    private void chbxIAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxIAristaActionPerformed
        if (this.chbxIArista.isSelected()) {
            this.chbxRPedido.setSelected(false);
            this.chbxHabDesN.setSelected(false);
            this.chbxCrearElimCD.setSelected(false);
            this.chbxHabDesA.setSelected(false);
        }
    }//GEN-LAST:event_chbxIAristaActionPerformed

    private void btnAddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarroActionPerformed
        if (this.listEstVehiculos.get(3) <= this.listEstVehiculos.get(4)) {
            this.listEstVehiculos.add(3, this.listEstVehiculos.remove(3) + 1);
            this.listEstVehiculos.add(1, this.listEstVehiculos.remove(1) + 1);
            JOptionPane.showMessageDialog(null, "La adición de un carro se cargará a la cuenta");
            this.setVehicTxtSalida();
        }
    }//GEN-LAST:event_btnAddCarroActionPerformed

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
    private javax.swing.JButton btnAddCarro;
    private javax.swing.JButton btnPRParametros;
    private javax.swing.JButton btnPrutaPLabel;
    private javax.swing.JCheckBox chbxCrearElimCD;
    private javax.swing.JCheckBox chbxHabDesA;
    private javax.swing.JCheckBox chbxHabDesN;
    private javax.swing.JCheckBox chbxIArista;
    private javax.swing.JCheckBox chbxRPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        this.tamano = 108;
        ((Panel) panelFondo).setImagen("../Recursos/MapaCiudad.jpg");
        this.grafo = new Grafo.Grafo(this.tamano);
        ((Panel) panelFondo).setGrafo(this.grafo);
        this.llenaNoEditables();
        this.pedido = new Pedidos();
        this.listEstVehiculos = new LinkedList<Integer>();
        this.listEstVehiculos.add(0);
        this.listEstVehiculos.add(10);
        this.listEstVehiculos.add(0);
        this.listEstVehiculos.add(10);
        this.listEstVehiculos.add(19);
        this.setVehicTxtSalida();

//        this.chbxIArista.setVisible(false);
    }

    private void llenaNoEditables() {
        this.listNoeditables = new LinkedList<>();
        for (int i = 1; i < 7; i++) {
            this.listNoeditables.add(i);
        }

    }

    //Muestra vehículos an txtSalida
    private void setVehicTxtSalida() {
        this.txtSalida.setText("Act: " + this.listEstVehiculos.get(0) + "\n");
        this.txtSalida.append("Inac: " + this.listEstVehiculos.get(1) + "\n");
        this.txtSalida.append("Susp: " + this.listEstVehiculos.get(2) + "\n");
        this.txtSalida.append("Total: " + this.listEstVehiculos.get(3) + "\n");
        this.txtSalida.append("Tope: " + this.listEstVehiculos.get(4) + "\n");
    }
}