/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.organizacion.infrastructure.gui;

/**
 *
 * @author juanm
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setTitle("Gestion de Eventos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padre = new javax.swing.JPanel();
        derechaprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        izquierdaprincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        primeraopcion = new javax.swing.JButton();
        segundaopcion = new javax.swing.JButton();
        terceraopcion = new javax.swing.JButton();
        cuartaopcion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        derechaprincipal.setBackground(new java.awt.Color(246, 246, 246));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText(" Gestor de Eventos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/calendario.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Candara Light", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("          Ver. 0.0.1 (Trabajo en proceso)");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout derechaprincipalLayout = new javax.swing.GroupLayout(derechaprincipal);
        derechaprincipal.setLayout(derechaprincipalLayout);
        derechaprincipalLayout.setHorizontalGroup(
            derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechaprincipalLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        derechaprincipalLayout.setVerticalGroup(
            derechaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechaprincipalLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        izquierdaprincipal.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/pencil.png"))); // NOI18N
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
        primeraopcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        primeraopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/location.png"))); // NOI18N
        primeraopcion.setText("Organizar un Evento");
        primeraopcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        primeraopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        segundaopcion.setBackground(new java.awt.Color(252, 186, 186));
        segundaopcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        segundaopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/user.png"))); // NOI18N
        segundaopcion.setText("Registrar participante");
        segundaopcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        segundaopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaopcionActionPerformed(evt);
            }
        });

        terceraopcion.setBackground(new java.awt.Color(252, 186, 186));
        terceraopcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        terceraopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/search.png"))); // NOI18N
        terceraopcion.setText("Acerca de...");
        terceraopcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        terceraopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceraopcionActionPerformed(evt);
            }
        });

        cuartaopcion.setBackground(new java.awt.Color(252, 186, 186));
        cuartaopcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cuartaopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenesausar/mainwindow/folder.png"))); // NOI18N
        cuartaopcion.setText("Reportes");
        cuartaopcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout izquierdaprincipalLayout = new javax.swing.GroupLayout(izquierdaprincipal);
        izquierdaprincipal.setLayout(izquierdaprincipalLayout);
        izquierdaprincipalLayout.setHorizontalGroup(
            izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                .addGroup(izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuartaopcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(terceraopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(primeraopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(segundaopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        izquierdaprincipalLayout.setVerticalGroup(
            izquierdaprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(izquierdaprincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(primeraopcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(segundaopcion)
                .addGap(80, 80, 80)
                .addComponent(terceraopcion)
                .addGap(85, 85, 85)
                .addComponent(cuartaopcion)
                .addGap(113, 113, 113))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_terceraopcionActionPerformed

    private void segundaopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundaopcionActionPerformed

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel padre;
    private javax.swing.JButton primeraopcion;
    private javax.swing.JButton segundaopcion;
    private javax.swing.JButton terceraopcion;
    // End of variables declaration//GEN-END:variables
}
