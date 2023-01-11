package Forms;

import Utils.TemperatureCalculator;
import javax.swing.JComboBox;

public class MainForm extends javax.swing.JFrame {

    private String topTemperatureType;
    private String bottomTemperatureType;
    private TemperatureCalculator temperatureCalculator = new TemperatureCalculator();

    public MainForm() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTemperatureTop = new javax.swing.JComboBox<>();
        lblTitle = new javax.swing.JLabel();
        txtTemperatureTop = new javax.swing.JTextField();
        cmbTemperatureBottom = new javax.swing.JComboBox<>();
        txtTemperatureBottom = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperatures Converter");

        cmbTemperatureTop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbTemperatureTop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));
        cmbTemperatureTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemperatureTopActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Temperature Converter");

        txtTemperatureTop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTemperatureTop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemperatureTopKeyPressed(evt);
            }
        });

        cmbTemperatureBottom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbTemperatureBottom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius" }));
        cmbTemperatureBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemperatureBottomActionPerformed(evt);
            }
        });

        txtTemperatureBottom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTemperatureBottom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemperatureBottomKeyPressed(evt);
            }
        });

        btnConvert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConvert.setText("Convert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbTemperatureTop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTemperatureBottom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTemperatureTop)
                            .addComponent(txtTemperatureBottom, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTemperatureTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperatureTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTemperatureBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperatureBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnConvert)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureBottomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureBottomKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTemperatureBottomKeyPressed

    private void txtTemperatureTopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureTopKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTemperatureTopKeyPressed

    private void cmbTemperatureBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemperatureBottomActionPerformed
        // TODO add your handling code here:
        bottomTemperatureType = cmbTemperatureBottom.getSelectedItem().toString();
        swapTemperaturesText(bottomTemperatureType, cmbTemperatureTop);
    }//GEN-LAST:event_cmbTemperatureBottomActionPerformed

    private void cmbTemperatureTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemperatureTopActionPerformed
        // TODO add your handling code here:
        topTemperatureType = cmbTemperatureTop.getSelectedItem().toString();
        swapTemperaturesText(topTemperatureType, cmbTemperatureBottom);
    }//GEN-LAST:event_cmbTemperatureTopActionPerformed

    private void swapTemperaturesText(String actualTemperature, JComboBox opositComboBox) {

        if (actualTemperature.equals("Celsius")) {
            opositComboBox.setSelectedItem("Fahrenheit");
        } else {
            opositComboBox.setSelectedItem("Celsius");
        }
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cmbTemperatureBottom;
    private javax.swing.JComboBox<String> cmbTemperatureTop;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtTemperatureBottom;
    private javax.swing.JTextField txtTemperatureTop;
    // End of variables declaration//GEN-END:variables
}
