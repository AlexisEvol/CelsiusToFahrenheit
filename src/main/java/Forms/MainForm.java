package Forms;

import Utils.CharacterToDouble;
import Utils.TemperatureCalculator;
import Utils.TypeOfTemperatureReader;

public class MainForm extends javax.swing.JFrame {

    private String topTemperatureType = "Celsius";
    private String bottomTemperatureType = "Fahrenheit";
    private final TemperatureCalculator temperatureCalculator = new TemperatureCalculator();
    private CharacterToDouble characterToDouble = new CharacterToDouble();
    private final TypeOfTemperatureReader typeOfTemperatureReader = new TypeOfTemperatureReader();
    private int mouseTopClicks = 0;
    private int mouseBottomClicks = 0;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

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
        txtTemperatureTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTemperatureTopMousePressed(evt);
            }
        });
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
        txtTemperatureBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTemperatureBottomMousePressed(evt);
            }
        });
        txtTemperatureBottom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemperatureBottomKeyPressed(evt);
            }
        });

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
                            .addComponent(txtTemperatureBottom, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtTemperatureTop))))
                .addContainerGap())
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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureBottomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureBottomKeyPressed

        double number = characterToDouble.transformCharToDouble(txtTemperatureBottom, evt);
        txtTemperatureTop.setText(String.valueOf(typeOfTemperatureReader.calculateTemperatures(bottomTemperatureType, number, temperatureCalculator)));
    }//GEN-LAST:event_txtTemperatureBottomKeyPressed

    private void txtTemperatureTopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureTopKeyPressed

        double number = characterToDouble.transformCharToDouble(txtTemperatureTop, evt);
        txtTemperatureBottom.setText(String.valueOf(typeOfTemperatureReader.calculateTemperatures(topTemperatureType, number, temperatureCalculator)));
    }//GEN-LAST:event_txtTemperatureTopKeyPressed

    private void cmbTemperatureBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemperatureBottomActionPerformed

        bottomTemperatureType = cmbTemperatureBottom.getSelectedItem().toString();
        typeOfTemperatureReader.swapTemperaturesTypeText(bottomTemperatureType, cmbTemperatureTop);
    }//GEN-LAST:event_cmbTemperatureBottomActionPerformed

    private void cmbTemperatureTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemperatureTopActionPerformed

        topTemperatureType = cmbTemperatureTop.getSelectedItem().toString();
        typeOfTemperatureReader.swapTemperaturesTypeText(topTemperatureType, cmbTemperatureBottom);
    }//GEN-LAST:event_cmbTemperatureTopActionPerformed

    private void txtTemperatureTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTemperatureTopMousePressed

        //This method is made to reset the method in this class every time we click for first time, allowing us to use the same class for everything
        mouseBottomClicks += 1;
        mouseTopClicks = 0;
        if (mouseBottomClicks < 2){
            characterToDouble = new CharacterToDouble();
            txtTemperatureTop.setText("");
        }
    }//GEN-LAST:event_txtTemperatureTopMousePressed

    private void txtTemperatureBottomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTemperatureBottomMousePressed

        mouseTopClicks += 1;
        mouseBottomClicks = 0;
        if (mouseTopClicks < 2){
            characterToDouble = new CharacterToDouble();
            txtTemperatureBottom.setText("");
        }
    }//GEN-LAST:event_txtTemperatureBottomMousePressed

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
    private javax.swing.JComboBox<String> cmbTemperatureBottom;
    private javax.swing.JComboBox<String> cmbTemperatureTop;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtTemperatureBottom;
    private javax.swing.JTextField txtTemperatureTop;
    // End of variables declaration//GEN-END:variables
}
