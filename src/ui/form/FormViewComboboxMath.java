/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import ui.components.IViewData;

/**
 *
 * @author student1
 */
public class FormViewComboboxMath extends javax.swing.JDialog implements IViewData{

    /**
     * Creates new form FormViewComboboxMath
     */
    public FormViewComboboxMath(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateForm();
        Controller.getInstance().register(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbValues = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View-combobox");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValuesActionPerformed(evt);
            }
        });

        jLabel1.setText("Values:");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmbValues, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemove)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnRemove)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Controller.getInstance().remove(this);
    }//GEN-LAST:event_formWindowClosing

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().remove((model.Math)cmbValues.getSelectedItem());
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cmbValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValuesActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().setSelectedItem(cmbValues.getSelectedIndex());
    }//GEN-LAST:event_cmbValuesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<model.Math> cmbValues;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void populateForm() {
        cmbValues.setModel(new DefaultComboBoxModel(Controller.getInstance().getMaths().toArray()));
    }

    @Override
    public void refreshData() {
        populateForm();
    }

    @Override
    public void setSelectedItem(int index) {
        cmbValues.setSelectedIndex(index);
    }
}