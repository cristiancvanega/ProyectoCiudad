package Vista;

import Conexion.Persistencia;
import Grafo.Arista;
import Grafo.Nodo;
import Implementacion.CDistribucion;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    int cont;
    Grafo.Grafo grafo;
    int tamano;
    LinkedList<Integer> listNoeditables;
    Pedidos pedido;
    int origen;
    int intermedio;
    int destino;

    /*A continuación los datos que tiene listEstVehiculos:
     int vehiculosAct;
     int vehiculosInac;
     int vehiculosSusp;
     int vehiculosTotal;
     int vehiculosTope;//Cantidad máxima de vehículos
     */
    LinkedList<Integer> listEstVehiculos;//
    LinkedList<Hilos.Vehiculo> listHVehiculo;//Lista de Hilos.Vehiculos

    //Estructura que guarda la los pedidos
    int[][] HMpedidos;
    int inicSust;
    Grafo.Nodo[] estr;
    int[] respuesta;
    int indexResp;
    double costo;
    LinkedList<int[]> respuestaS = new LinkedList<>();
    boolean VCA = false;
    boolean VCD = false;

    public Vista() {
        initComponents();
        cont = 64;
        this.cargar();
        this.inicSust = 1;
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
        btnAddCarro = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        lblMAX = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
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
            .addGap(0, 858, Short.MAX_VALUE)
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

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
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
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxHabDesA)
                    .addComponent(chbxRPedido)
                    .addComponent(chbxIArista)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnAddCarro))
                    .addComponent(btnAceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMAX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addComponent(btnPrutaPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPRParametros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMAX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(btnPRParametros)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrutaPLabel)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel1))
                                    .addGap(6, 6, 6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)))
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sustentacion(int indice) {
        respuesta = new int[this.tamano];
        indexResp = 0;
        for (int i = 0; i < this.tamano; i++) {
            respuesta[i] = 0;
        }
        sustentacion2(1, indice);
    }

    public void sustentacion2(int etapa, int indice) {
        this.respuesta[etapa] = 1;
        for (int i = 0; i < this.tamano; i++) {
            if (this.grafo.getMatrizAD()[indice][i] != null) {
                if (!this.grafo.getMatrizAD()[indice][i].isObstruida()) {
                    this.grafo.getMatrizAD()[indice][i].setObstruida(true);
                    if (this.grafo.getListNodos()[i].getHuesped() instanceof CAbastecimiento) {
                        VCA = true;
                    }else if (this.grafo.getListNodos()[i].getHuesped() instanceof CDistribucion) {
                        VCD = true;
                    }
                    if (i == indice && VCD && VCA) {
                        int[] resp = new int[this.tamano];
                        for (int j = 1; j < this.tamano; j++) {
                            resp[j] = respuesta[j];
                        }
                        this.respuestaS.add(resp);
                    } else {
                        sustentacion2(etapa + 1, i);
                    }
                    this.grafo.getMatrizAD()[indice][i].setObstruida(false);
                }
            }
        }
        respuesta[etapa] = 0;
    }

    public void menorCosto(int indice) {
        int anterior = indice;
        
        int index = respuesta[indice];
        double costoT=this.grafo.getRuta()[index][indice];
        int k = 0;
        for (int i = 0; i < this.respuestaS.size(); i++) {
            while(k <= this.tamano){
                
                k++;
            }
        }
    }

    public int vecinoMCercano(int nodo) {
        costo = 1000;
        int res = 0;
        for (int i = 0; i < this.tamano; i++) {
            if (this.grafo.getMatrizAD()[nodo][i].getPeso() < costo) {
                costo = this.grafo.getMatrizAD()[nodo][i].getPeso();
                res = i;
            }
        }
        return res;
    }


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
                if (this.grafo.getListNodos()[indice] != null
                        && !this.listNoeditables.contains(indice)) {
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
                            if (arista[i][j].isTipo()) {
                                this.grafo.eventoAristaCamion();
                            } else {
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
                if (this.grafo.getListNodos()[indice] != null
                        && !this.listNoeditables.contains(indice)) {
                    Conexion.Persistencia con = new Conexion.Persistencia();
                    if (this.grafo.getListNodos()[indice].getArea().contains(evt.getX(), evt.getY())
                            && !this.listNoeditables.contains(this.grafo.getListNodos()[indice].getId())
                            && this.grafo.getListNodos()[indice].isHabilidato()) {
                        this.origen = this.grafo.getListNodos()[indice].getId();
//                        this.pedido.setDatos(con.getIDPedidoMapa(),
//                                this.grafo.getListNodos()[indice].getId());//Seteamos algunos datos necesarios
//                        this.pedido.setVisible(true);
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
        System.out.println("" + ((int) (Math.random() * (6)) + 1));
//        int origen = Integer.parseInt(this.txtRuta.getText().split(",")[0]);
//        int destino = Integer.parseInt(this.txtRuta.getText().split(",")[1]);
//        LinkedList<Integer> ruta = new LinkedList<>();
//        this.grafo.getIntRutaCamion(origen, destino, ruta);
//        if (!ruta.isEmpty()) {
//            ruta.addFirst(origen);
//        }
//        Grafo.Nodo[] trav = new Nodo[ruta.size()];
//        for (int i = 0; i < ruta.size(); i++) {
//            trav[i] = this.grafo.getListNodos()[ruta.get(i)];
//        }
//        System.out.println("Tam ruta: " + ruta.size());
//        for (Integer n : ruta) {
//            System.out.print(", " + n);
//        }
//        System.out.println("");
//        if (!ruta.isEmpty() && this.listEstVehiculos.get(1) > 0) {
//            System.out.println("antes de...");
//            this.listEstVehiculos.add(0, this.listEstVehiculos.remove(0) + 1);
//            this.listEstVehiculos.add(1, this.listEstVehiculos.remove(1) - 1);
//            this.setVehicTxtSalida();
//            Thread hilo = new Thread(new Hilos.Vehiculo(jLabel2, trav,
//                    this.txtSalida, this.listEstVehiculos, this.grafo,
//                    new Implementacion.Vehiculo(40, 21, true)));
//            hilo.start();
//        }
//        System.out.println("despues de...");

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
                    this.txtSalida, this.listEstVehiculos, this.grafo,
                    new Implementacion.Vehiculo(40, 22, false)));
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Persistencia persistencia = new Persistencia();
        MAXcantidad(persistencia.cargarCantidad());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.movimiento();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        this.susten
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.inicSust = Integer.parseInt(this.txtRuta.getText().toString());
        sustentacion(inicSust);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void movimiento() {

//        intermedio = ((int)(Math.random() * (6)) + 1);
        intermedio = 3;
        LinkedList<Integer> ruta = new LinkedList<>();

        this.grafo.getIntRuta(origen, intermedio, ruta);
        int tamano = ruta.size();
        if (!ruta.isEmpty()) {
            ruta.addFirst(origen);
        }
        this.grafo.getIntRuta(intermedio, destino, ruta);

        if (ruta.size() != tamano) {
            ruta.add(tamano, intermedio);
        }

        origen = destino;
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
                    this.txtSalida, this.listEstVehiculos, this.grafo,
                    new Implementacion.Vehiculo(40, 22, false)));
            hilo.start();
        }
    }

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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAddCarro;
    private javax.swing.JButton btnPRParametros;
    private javax.swing.JButton btnPrutaPLabel;
    private javax.swing.JCheckBox chbxCrearElimCD;
    private javax.swing.JCheckBox chbxHabDesA;
    private javax.swing.JCheckBox chbxHabDesN;
    private javax.swing.JCheckBox chbxIArista;
    private javax.swing.JCheckBox chbxRPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMAX;
    public javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        Persistencia p = new Persistencia();
        this.tamano = 108;
        this.HMpedidos = new int[10][2];
        ((Panel) panelFondo).setImagen("../Recursos/MapaCiudad.jpg");
        this.grafo = new Grafo.Grafo(this.tamano);
        ((Panel) panelFondo).setGrafo(this.grafo);
        this.llenaNoEditables();
//        this.pedido = new Pedidos();
        this.listHVehiculo = new LinkedList<>();
//        this.pedido.cargaDatosInicial(listHVehiculo, grafo, HMpedidos, listEstVehiculos);
        this.listEstVehiculos = new LinkedList<Integer>();
        this.listEstVehiculos.add(0);
        this.listEstVehiculos.add(10);
        this.listEstVehiculos.add(0);
        this.listEstVehiculos.add(10);
        this.listEstVehiculos.add(16);
        this.setVehicTxtSalida();
        this.llenarCombobox(p.cargarProductos());
        this.origen = 1;
        this.intermedio = 1;
        this.destino = 1;
        this.jLabel1.setLocation(this.grafo.getListNodos()[1].getX(), this.grafo.getListNodos()[1].getY());

        /*Llenamos la lista de vehículos seteándole además un objeto de tipo carro y otro de 
         *tipo Implementacion.Vehículo
         */
//        this.jLabel1.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel3.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel4.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel5.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel6.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel7.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel8.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel9.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel10.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//
//        this.jLabel11.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel12.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel13.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel14.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel15.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//
//        this.jLabel16.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel17.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel18.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
//        this.jLabel19.setIcon(new ImageIcon(getClass().getResource("../Recursos/furgon.jpg")));
//        this.jLabel20.setIcon(new ImageIcon(getClass().getResource("../Recursos/carro.jpg")));
        //Seteamos las posiciones de los labels para que no se descuadre la vista
//        this.jLabel1.setLocation(50, 700);
//        this.jLabel2.setLocation(100, 701);
//        this.jLabel3.setLocation(150, 702);
//        this.jLabel4.setLocation(200, 703);
//        this.jLabel5.setLocation(250, 704);
//
//        this.jLabel6.setLocation(300, 705);
//        this.jLabel7.setLocation(350, 706);
//        this.jLabel8.setLocation(400, 707);
//        this.jLabel9.setLocation(450, 708);
//        this.jLabel10.setLocation(500, 709);
//
//        this.jLabel11.setLocation(550, 710);
//        this.jLabel12.setLocation(600, 711);
//        this.jLabel13.setLocation(650, 712);
//        this.jLabel14.setLocation(700, 713);
//        this.jLabel15.setLocation(750, 714);
//
//        this.jLabel16.setLocation(800, 715);
//        this.jLabel17.setLocation(850, 716);
//        this.jLabel18.setLocation(900, 717);
//        this.jLabel19.setLocation(950, 718);
//        this.jLabel20.setLocation(1000, 719);
        //Adicionamos a la lista 20 objetos de tipo Hilos.Vehiculo
//        this.listHVehiculo.add(new Vehiculo(jLabel1, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 1, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel2, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 2, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel3, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 3, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel4, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 4, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel5, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 5, true)));
//
//        this.listHVehiculo.add(new Vehiculo(jLabel6, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 6, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel7, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 7, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel8, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 8, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel9, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 9, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel10, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 10, false)));
//
//        this.listHVehiculo.add(new Vehiculo(jLabel11, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 11, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel12, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 12, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel13, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 13, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel14, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 14, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel15, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 15, true)));
//
//        this.listHVehiculo.add(new Vehiculo(jLabel16, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 16, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel17, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 17, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel18, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 18, false)));
//        this.listHVehiculo.add(new Vehiculo(jLabel19, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(80, 19, true)));
//        this.listHVehiculo.add(new Vehiculo(jLabel20, null, this.txtSalida,
//                listEstVehiculos, grafo, new Implementacion.Vehiculo(40, 20, false)));
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

    public void llenarCombobox(LinkedList productos) {
        for (int i = 0; i < productos.size(); i++) {
            jComboBox1.addItem(productos.get(i));
        }
    }

    public void MAXcantidad(LinkedList max) {
        lblMAX.setText("MAX " + max.get(jComboBox1.getSelectedIndex()) + " Cajas");
    }

    public void alerta(LinkedList max) {
        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo cantidad esta vacio, favor llenar");
            txtCantidad.setText("");
        } else if ((Integer.parseInt(txtCantidad.getText()) > (int) max.get(jComboBox1.getSelectedIndex()))) {
            JOptionPane.showMessageDialog(null, "El campo cantidad esta excedido la cantidad MAX es: " + (int) max.get(jComboBox1.getSelectedIndex()));
            txtCantidad.setText("");
        } else if ((Integer.parseInt(txtCantidad.getText()) < 0)) {
            JOptionPane.showMessageDialog(null, "El campo cantidad no permite numero negativos");
            txtCantidad.setText("");
        } else if ((Integer.parseInt(txtCantidad.getText()) == 0)) {
            JOptionPane.showMessageDialog(null, "El campo cantidad no puede ser cero");
            txtCantidad.setText("");
        }
    }

    private int vehicDisponible() {
        for (int i = 0; i < this.listHVehiculo.size(); i++) {
            if (!this.listHVehiculo.get(i).getVehiculo().isOcupado()) {
                this.listHVehiculo.get(i).getVehiculo().setOcupado(true);
                return i;
            }
        }
        return -1;
    }
}
