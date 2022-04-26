/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import creacionales.abstractFactory.Catalogo;
import estructurales.decorator.Vendible;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class FrameInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicio
     */
    public FrameInicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.GroupSelection.add(this.BtnSelectionCliente);
        this.GroupSelection.add(this.BtnSelectionEmpresa);
        this.LblTxt2.setText("<html>Este es un catálogo en el cual se pueden comprar tanto vehículos como scooters. <br>"
                + "Existen dos formas de ingresar, como cliente o como empresa, cada uno con un límite de compra"+"</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupSelection = new javax.swing.ButtonGroup();
        LblTxt1 = new javax.swing.JLabel();
        LblTxt2 = new javax.swing.JLabel();
        LblTxt3 = new javax.swing.JLabel();
        BtnSelectionCliente = new javax.swing.JRadioButton();
        BtnSelectionEmpresa = new javax.swing.JRadioButton();
        BtnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblTxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTxt1.setText("Catálogo de Vehiculos");

        LblTxt3.setText("Desea Ingresar como cliente individual o como empresa");

        BtnSelectionCliente.setText("Cliente Individual");

        BtnSelectionEmpresa.setText("Empresa");

        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtnSelectionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSelectionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(BtnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LblTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSelectionCliente)
                    .addComponent(BtnSelectionEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnIngresar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

        if(this.BtnSelectionCliente.isSelected()){
           JOptionPane.showMessageDialog(null,"Usted ha ingresado como "+this.BtnSelectionCliente.getText(),
                   "Mensaje",1);
           FrameIndividual e = new FrameIndividual();
           e.setVisible(true);
           dispose();  
        }
        else{
            if(this.BtnSelectionEmpresa.isSelected()){
            JOptionPane.showMessageDialog(null,"Usted ha ingresado como "+this.BtnSelectionEmpresa.getText()
            ,"Mensaje",1);
            FrameEmpresa e = new FrameEmpresa();
            e.setVisible(true);
            dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Seleccione una de las dos opciones","Error",2);
            }
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JRadioButton BtnSelectionCliente;
    private javax.swing.JRadioButton BtnSelectionEmpresa;
    private javax.swing.ButtonGroup GroupSelection;
    private javax.swing.JLabel LblTxt1;
    private javax.swing.JLabel LblTxt2;
    private javax.swing.JLabel LblTxt3;
    // End of variables declaration//GEN-END:variables
}
