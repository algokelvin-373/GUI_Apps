package Sampel3D_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProgramTransformasi3D extends javax.swing.JFrame {
    private Java3DWorld java3DWorld; // 3D scene panel
    private JPanel controlPanel; // 3D scene control panel
    private JFrame Kubus = new JFrame ();
    private JFrame Silinder = new JFrame ();
    private JFrame Kerucut = new JFrame ();
    
    public ProgramTransformasi3D() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Box_3D = new javax.swing.JButton();
        Cylinder_3D = new javax.swing.JButton();
        Cone_3D = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Transformasi 3D");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Program Transformasi 3D");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pilih Jenis Bangun 3D :");

        Box_3D.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Box_3D.setText("BOX");
        Box_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_3DActionPerformed(evt);
            }
        });

        Cylinder_3D.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cylinder_3D.setText("CYLINDER");
        Cylinder_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cylinder_3DActionPerformed(evt);
            }
        });

        Cone_3D.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cone_3D.setText("CONE");
        Cone_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cone_3DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Box_3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cylinder_3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cone_3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Box_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cylinder_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cone_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Box_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_3DActionPerformed
        Kerucut.dispose();
        Silinder.dispose();
        java3DWorld = new Java3DWorld(1);
        controlPanel = new ControlPanel( java3DWorld );
        Kubus.setVisible(true);
        Kubus.getContentPane().add(java3DWorld, BorderLayout.CENTER);
        Kubus.getContentPane().add(controlPanel, BorderLayout.EAST );
        Kubus.pack();
        Kubus.setTitle("Kubus3D");
    }//GEN-LAST:event_Box_3DActionPerformed

    private void Cylinder_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cylinder_3DActionPerformed
        Kubus.dispose();
        Kerucut.dispose();
        java3DWorld = new Java3DWorld(2);
        controlPanel = new ControlPanel( java3DWorld );
        Silinder.setVisible(true);
        Silinder.getContentPane().add(java3DWorld, BorderLayout.CENTER);
        Silinder.getContentPane().add(controlPanel, BorderLayout.EAST );
        Silinder.pack();
        Silinder.setTitle("Silinder3D");
    }//GEN-LAST:event_Cylinder_3DActionPerformed

    private void Cone_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cone_3DActionPerformed
        Kubus.dispose();
        Silinder.dispose();
        java3DWorld = new Java3DWorld(3);
        controlPanel = new ControlPanel( java3DWorld );
        Kerucut.setVisible(true);
        Kerucut.getContentPane().add(java3DWorld, BorderLayout.CENTER);
        Kerucut.getContentPane().add(controlPanel, BorderLayout.EAST );
        Kerucut.pack();
        Kerucut.setTitle("Kerucut3D");
    }//GEN-LAST:event_Cone_3DActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramTransformasi3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramTransformasi3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramTransformasi3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramTransformasi3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramTransformasi3D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Box_3D;
    private javax.swing.JButton Cone_3D;
    private javax.swing.JButton Cylinder_3D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
