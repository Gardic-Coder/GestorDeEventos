package main.java.gui;

import java.awt.Color; //Defino colores personalizados (Tecnologia Hover)
import java.awt.Image;
import java.awt.Toolkit; //Permiten cargan el logotipo del proyecto (trabaja junto a Image)
import java.net.URL;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setTitle("Gestion de Eventos");
    }

    //Icono del JFrame, cargamos la imagen residente en nuestro proyecto (Logotipo)
    @Override
    public Image getIconImage() {
        URL url = getClass().getClassLoader().getResource("Imagenes/mainWindow/seashell.png");
        return Toolkit.getDefaultToolkit().getImage(url);
    }

    /*@Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes\\mainWindow\\seashell.png"));
    return retValue;
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padre = new javax.swing.JPanel();
        derechaprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        izquierdaprincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        primeraopcion = new javax.swing.JButton();
        segundaopcion = new javax.swing.JButton();
        terceraopcion = new javax.swing.JButton();
        cuartaopcion = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        derechaprincipal.setBackground(new java.awt.Color(246, 246, 246));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText(" Gestor de Eventos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/calendario.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Candara Light", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("          Ver. 1.3.3 (Trabajo Finalizado)");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/logo4.png"))); // NOI18N
        jLabel4.setText("GUI4ever");

        javax.swing.GroupLayout derechaprincipalLayout = new javax.swing.GroupLayout(derechaprincipal);
        derechaprincipal.setLayout(derechaprincipalLayout);
        derechaprincipalLayout.setHorizontalGroup(
            derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(derechaprincipalLayout.createSequentialGroup()
                .addGroup(derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derechaprincipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(derechaprincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        derechaprincipalLayout.setVerticalGroup(
            derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechaprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        izquierdaprincipal.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/pencil.png"))); // NOI18N
        jLabel5.setText("Menu  ");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Principal");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        primeraopcion.setBackground(new java.awt.Color(252, 186, 186));
        primeraopcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        primeraopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/eventos.png"))); // NOI18N
        primeraopcion.setText("   Organizar un Evento");
        primeraopcion.setBorder(null);
        primeraopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        primeraopcion.setFocusPainted(false);
        primeraopcion.setOpaque(true);
        primeraopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                primeraopcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primeraopcionMouseExited(evt);
            }
        });
        primeraopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeraopcionActionPerformed(evt);
            }
        });

        segundaopcion.setBackground(new java.awt.Color(252, 186, 186));
        segundaopcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        segundaopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/agregar-usuario.png"))); // NOI18N
        segundaopcion.setText("  Registrar participante");
        segundaopcion.setBorder(null);
        segundaopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        segundaopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundaopcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                segundaopcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                segundaopcionMouseExited(evt);
            }
        });
        segundaopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaopcionActionPerformed(evt);
            }
        });

        terceraopcion.setBackground(new java.awt.Color(252, 186, 186));
        terceraopcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        terceraopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/ayuda.png"))); // NOI18N
        terceraopcion.setText("    Acerca de...");
        terceraopcion.setBorder(null);
        terceraopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terceraopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                terceraopcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                terceraopcionMouseExited(evt);
            }
        });
        terceraopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceraopcionActionPerformed(evt);
            }
        });

        cuartaopcion.setBackground(new java.awt.Color(252, 186, 186));
        cuartaopcion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cuartaopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/Imagenes/mainWindow/ajustes.png"))); // NOI18N
        cuartaopcion.setText("Reportes");
        cuartaopcion.setBorder(null);
        cuartaopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuartaopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cuartaopcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuartaopcionMouseExited(evt);
            }
        });
        cuartaopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuartaopcionActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 204, 204));
        salir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        salir.setText("X");
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.setPreferredSize(new java.awt.Dimension(45, 38));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout izquierdaprincipalLayout = new javax.swing.GroupLayout(izquierdaprincipal);
        izquierdaprincipal.setLayout(izquierdaprincipalLayout);
        izquierdaprincipalLayout.setHorizontalGroup(
            izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cuartaopcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(terceraopcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(segundaopcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(primeraopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                .addGroup(izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, izquierdaprincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        izquierdaprincipalLayout.setVerticalGroup(
            izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(primeraopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(segundaopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(terceraopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuartaopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout padreLayout = new javax.swing.GroupLayout(padre);
        padre.setLayout(padreLayout);
        padreLayout.setHorizontalGroup(
            padreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(padreLayout.createSequentialGroup()
                .addComponent(derechaprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(izquierdaprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        padreLayout.setVerticalGroup(
            padreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(izquierdaprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(derechaprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        derechaprincipal.getAccessibleContext().setAccessibleName("");
        derechaprincipal.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void terceraopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceraopcionActionPerformed
        AcercaDe info = new AcercaDe(this);
        info.setVisible(true);
        info.setLocationRelativeTo(null);
        this.dispose();
        HerramientasVentanas.cambiarColor(terceraopcion, false);
// TODO add your handling code here:
    }//GEN-LAST:event_terceraopcionActionPerformed

    private void segundaopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaopcionActionPerformed

        Participante creador = new Participante(this);
        creador.setVisible(true);
        creador.setLocationRelativeTo(null);
        this.dispose();
        HerramientasVentanas.cambiarColor(segundaopcion, false);

    }//GEN-LAST:event_segundaopcionActionPerformed

    private void primeraopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeraopcionActionPerformed
        Eventos creadoreventos = new Eventos(this);
        creadoreventos.setVisible(true);
        creadoreventos.setLocationRelativeTo(null);
        this.dispose();
        HerramientasVentanas.cambiarColor(primeraopcion, false);
    }//GEN-LAST:event_primeraopcionActionPerformed

    private void cuartaopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuartaopcionActionPerformed
        ReportesMod reportes = new ReportesMod(this);
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(null);
        this.dispose();
        HerramientasVentanas.cambiarColor(cuartaopcion, false);
    }//GEN-LAST:event_cuartaopcionActionPerformed

    private void primeraopcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeraopcionMouseEntered
        HerramientasVentanas.cambiarColor(primeraopcion, true);
    }//GEN-LAST:event_primeraopcionMouseEntered

    private void primeraopcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeraopcionMouseExited
        HerramientasVentanas.cambiarColor(primeraopcion, false);
    }//GEN-LAST:event_primeraopcionMouseExited

    private void segundaopcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundaopcionMouseEntered
        HerramientasVentanas.cambiarColor(segundaopcion, true);
    }//GEN-LAST:event_segundaopcionMouseEntered

    private void segundaopcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundaopcionMouseExited
        HerramientasVentanas.cambiarColor(segundaopcion, false);
    }//GEN-LAST:event_segundaopcionMouseExited

    private void terceraopcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terceraopcionMouseEntered
        HerramientasVentanas.cambiarColor(terceraopcion, true);
    }//GEN-LAST:event_terceraopcionMouseEntered

    private void terceraopcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terceraopcionMouseExited
        HerramientasVentanas.cambiarColor(terceraopcion, false);
    }//GEN-LAST:event_terceraopcionMouseExited

    private void cuartaopcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuartaopcionMouseEntered
        HerramientasVentanas.cambiarColor(cuartaopcion, true);
    }//GEN-LAST:event_cuartaopcionMouseEntered

    private void cuartaopcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuartaopcionMouseExited
        HerramientasVentanas.cambiarColor(cuartaopcion, false);
    }//GEN-LAST:event_cuartaopcionMouseExited

    private void segundaopcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundaopcionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_segundaopcionMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(new Color(255, 0, 0));
        salir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBackground(new Color(255, 204, 204));
        salir.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_salirMouseExited

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cuartaopcion;
    private javax.swing.JPanel derechaprincipal;
    private javax.swing.JPanel izquierdaprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel padre;
    private javax.swing.JButton primeraopcion;
    private javax.swing.JButton salir;
    private javax.swing.JButton segundaopcion;
    private javax.swing.JButton terceraopcion;
    // End of variables declaration//GEN-END:variables

}
