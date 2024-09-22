/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.VitalSigns;
import model.VitalSignsHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sailokeshreddynandavarapu
 */
public class ViewJPanel extends javax.swing.JPanel {
    VitalSignsHistory vitalSignsHistory;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory; 
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();

        lblHeader.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Vital Signs");

        txtTemperature.setEditable(false);
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBloodPressure.setText("Blood Pressure:");

        txtBloodPressure.setEditable(false);
        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPulse.setText("Pulse:");

        txtPulse.setEditable(false);
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date:");

        txtDate.setEditable(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemperature.setText("Temperature:");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Temperature", "Blood Pressure", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnView});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBloodPressure, txtDate, txtPulse, txtTemperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblVitals.getSelectedRow();
        
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        if (selectedVitals != null){
            txtTemperature.setText(Double.toString(selectedVitals.getTemperature()));
            txtBloodPressure.setText(Double.toString(selectedVitals.getBloodPressure()));
            txtPulse.setText(Integer.toString(selectedVitals.getPulse()));
            txtDate.setText(selectedVitals.getDate());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblVitals.getSelectedRow();
        
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        //implement the deletion
        if (selectedVitals != null){
            vitalSignsHistory.removeVitals(selectedVitals);
                        JOptionPane.showMessageDialog(this, "Vital sign deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //update the table
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //to get access to schema behind the table
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        //To reset the table for the initial load
        model.setRowCount(0);
        
        //loop to add rows to the table by gettting the array list from VitalSignsHistory
        for(VitalSigns vs : vitalSignsHistory.getHistory()){
           Object[] row = new Object[4];
           row[0] = vs;
           row[1] = vs.getTemperature();
           row[2] = vs.getBloodPressure();
           row[3] = vs.getPulse();
           
           model.addRow(row);
    }
    }
}
