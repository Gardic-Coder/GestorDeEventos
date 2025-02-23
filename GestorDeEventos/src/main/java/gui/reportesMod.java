package main.java.gui;


public class reportesMod extends javax.swing.JFrame {

    
    private MainWindow principal;
    
    public reportesMod() {
        initComponents();
    }
    
    public reportesMod(MainWindow principal) {
        initComponents();
        this.principal=principal;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horaComenzar = new com.raven.swing.TimePicker();
        horaFinal = new com.raven.swing.TimePicker();
        padre = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        tablas = new javax.swing.JComboBox<>();
        containerPrincipal = new javax.swing.JPanel();
        participantes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tablaPar = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        crear2 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        Salir2 = new javax.swing.JButton();
        eventos = new javax.swing.JPanel();
        tablaEventos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        crear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        horaComenzar.setForeground(new java.awt.Color(255, 102, 102));

        horaFinal.setForeground(new java.awt.Color(255, 153, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        padre.setBackground(new java.awt.Color(255, 228, 228));
        padre.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(255, 204, 204));

        titulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/exchange.png"))); // NOI18N
        titulo.setText("Modificacion en la Gestion  ");
        titulo.setFocusable(false);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tablas.setBackground(new java.awt.Color(252, 186, 186));
        tablas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Participantes", "Eventos" }));
        tablas.setMinimumSize(new java.awt.Dimension(138, 27));
        tablas.setPreferredSize(new java.awt.Dimension(138, 27));
        tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        padre.add(header, java.awt.BorderLayout.PAGE_START);

        containerPrincipal.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 228, 228));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPar.setViewportView(jTable2);

        crear2.setBackground(new java.awt.Color(252, 186, 186));
        crear2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        crear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/log-in.png"))); // NOI18N
        crear2.setText("Crear");
        crear2.setBorder(null);
        crear2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crear2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crear2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crear2MousePressed(evt);
            }
        });
        crear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear2ActionPerformed(evt);
            }
        });

        update2.setBackground(new java.awt.Color(252, 186, 186));
        update2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/circular-arrow.png"))); // NOI18N
        update2.setText("Actualizar");
        update2.setBorder(null);
        update2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update2MousePressed(evt);
            }
        });
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        delete2.setBackground(new java.awt.Color(252, 186, 186));
        delete2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/bin.png"))); // NOI18N
        delete2.setText("Eliminar");
        delete2.setBorder(null);
        delete2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete2MousePressed(evt);
            }
        });
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        Salir2.setBackground(new java.awt.Color(252, 186, 186));
        Salir2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/exit.png"))); // NOI18N
        Salir2.setText("Salir");
        Salir2.setBorder(null);
        Salir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Salir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Salir2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Salir2MousePressed(evt);
            }
        });
        Salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablaPar, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(crear2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(Salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tablaPar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update2)
                    .addComponent(crear2)
                    .addComponent(delete2)
                    .addComponent(Salir2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout participantesLayout = new javax.swing.GroupLayout(participantes);
        participantes.setLayout(participantesLayout);
        participantesLayout.setHorizontalGroup(
            participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, participantesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        participantesLayout.setVerticalGroup(
            participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        containerPrincipal.add(participantes, "card3");

        eventos.setBackground(new java.awt.Color(255, 228, 228));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEventos.setViewportView(jTable1);

        crear.setBackground(new java.awt.Color(252, 186, 186));
        crear.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/log-in.png"))); // NOI18N
        crear.setText("Crear");
        crear.setBorder(null);
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crearMousePressed(evt);
            }
        });
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(252, 186, 186));
        update.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/circular-arrow.png"))); // NOI18N
        update.setText("Actualizar");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateMousePressed(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(252, 186, 186));
        delete.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/modificacion/bin.png"))); // NOI18N
        delete.setText("Eliminar");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(252, 186, 186));
        salir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/Participante/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eventosLayout = new javax.swing.GroupLayout(eventos);
        eventos.setLayout(eventosLayout);
        eventosLayout.setHorizontalGroup(
            eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaEventos)
            .addGroup(eventosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        eventosLayout.setVerticalGroup(
            eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventosLayout.createSequentialGroup()
                .addComponent(tablaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(crear)
                    .addComponent(salir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        containerPrincipal.add(eventos, "card2");

        padre.add(containerPrincipal, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(padre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(padre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseEntered
        herramientasVentanas.cambiarColor(crear, true);
    }//GEN-LAST:event_crearMouseEntered

    private void crearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseExited
        herramientasVentanas.cambiarColor(crear, false);
    }//GEN-LAST:event_crearMouseExited

    private void crearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearMousePressed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        Eventos crearEvt = new Eventos(principal);
        crearEvt.setVisible(true);
        crearEvt.setLocationRelativeTo(null);
        this.dispose();
        herramientasVentanas.cambiarColor(crear,false);
    }//GEN-LAST:event_crearActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        herramientasVentanas.cambiarColor(update, true);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        herramientasVentanas.cambiarColor(update, false);
    }//GEN-LAST:event_updateMouseExited

    private void updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMousePressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        herramientasVentanas.cambiarColor(delete, true);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        herramientasVentanas.cambiarColor(delete, false);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMousePressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        herramientasVentanas.cambiarColor(salir, true);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        herramientasVentanas.cambiarColor(salir, false);
    }//GEN-LAST:event_salirMouseExited

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMousePressed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void Salir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir2MouseEntered
        herramientasVentanas.cambiarColor(Salir2, true);
    }//GEN-LAST:event_Salir2MouseEntered

    private void Salir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir2MouseExited
        herramientasVentanas.cambiarColor(Salir2, false);
    }//GEN-LAST:event_Salir2MouseExited

    private void Salir2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salir2MousePressed

    private void Salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir2ActionPerformed
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_Salir2ActionPerformed

    private void tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablasActionPerformed
        if(tablas.getSelectedIndex()==0){
            containerPrincipal.removeAll();
            containerPrincipal.add(participantes);
            containerPrincipal.repaint();
            containerPrincipal.revalidate();
        }else{
            containerPrincipal.removeAll();
            containerPrincipal.add(eventos);
            containerPrincipal.repaint();
            containerPrincipal.revalidate();
        }
    }//GEN-LAST:event_tablasActionPerformed

    private void crear2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear2MouseEntered
        herramientasVentanas.cambiarColor(crear2, true);
    }//GEN-LAST:event_crear2MouseEntered

    private void crear2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear2MouseExited
        herramientasVentanas.cambiarColor(crear2, false);
    }//GEN-LAST:event_crear2MouseExited

    private void crear2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear2MousePressed

    private void crear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear2ActionPerformed
        Participante crearPar = new Participante(principal);
        crearPar.setVisible(true);
        crearPar.setLocationRelativeTo(null);
        this.dispose();
        herramientasVentanas.cambiarColor(crear,false);
    }//GEN-LAST:event_crear2ActionPerformed

    private void update2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update2MouseEntered
        herramientasVentanas.cambiarColor(update2, true);
    }//GEN-LAST:event_update2MouseEntered

    private void update2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update2MouseExited
        herramientasVentanas.cambiarColor(update2, false);
    }//GEN-LAST:event_update2MouseExited

    private void update2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update2MousePressed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update2ActionPerformed

    private void delete2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseEntered
        herramientasVentanas.cambiarColor(delete2, true);
    }//GEN-LAST:event_delete2MouseEntered

    private void delete2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseExited
        herramientasVentanas.cambiarColor(delete2, false);
    }//GEN-LAST:event_delete2MouseExited

    private void delete2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete2MousePressed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reportesMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportesMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportesMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportesMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportesMod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir2;
    private javax.swing.JPanel containerPrincipal;
    private javax.swing.JButton crear;
    private javax.swing.JButton crear2;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete2;
    private javax.swing.JPanel eventos;
    private javax.swing.JPanel header;
    private com.raven.swing.TimePicker horaComenzar;
    private com.raven.swing.TimePicker horaFinal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel padre;
    private javax.swing.JPanel participantes;
    private javax.swing.JButton salir;
    private javax.swing.JScrollPane tablaEventos;
    private javax.swing.JScrollPane tablaPar;
    private javax.swing.JComboBox<String> tablas;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton update;
    private javax.swing.JButton update2;
    // End of variables declaration//GEN-END:variables
}
