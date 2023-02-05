/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haoliu
 */
public class CatalogJPanel extends javax.swing.JPanel {

    private Application application;

    /**
     * Creates new form CatalogJPanel
     */
    
    DefaultTableModel medTableModel;
    
    CatalogJPanel(Application application) {
        initComponents();
        
        this.application = application;
        this.medTableModel = (DefaultTableModel) medicineCatalogTable.getModel();
        
        displayMedicineCatalog();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldName = new javax.swing.JTextField();
        fieldDosage = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalogTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNameFocusLost(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 86, 141, 41));
        add(fieldDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 172, 141, 39));

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 255, -1, -1));

        medicineCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalogTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 59, 335, 288));

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNameFocusLost
        // TODO add your handling code here:
        String name = fieldName.getText();
        
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);
        
        if(isUnique) {
            
        } else {
            
            fieldName.setText("");
            JOptionPane.showMessageDialog(null, "Medicine Already Exist!");
        }
     
    }//GEN-LAST:event_fieldNameFocusLost

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:        
        String name = fieldName.getText();
        String dosage = fieldDosage.getText();
        
        MedicineCatalog catalog = this.application.getCatalog();
                
        catalog.createMedicine(name, Double.valueOf(dosage));
        
        displayMedicineCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = medicineCatalogTable.getSelectedRow();
        
        if(selectedRow >= 0) {
            
            // we will delete the object
            
            Medicine med = (Medicine) medicineCatalogTable.getValueAt(selectedRow, 0);
            
            this.application.getCatalog().removeMedicine(med.getMedicineName());
            
            displayMedicineCatalog();
        } else {
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void displayMedicineCatalog() {
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        if(medicines.size() > 0) {
            
            medTableModel.setRowCount(0);
            
            for(Medicine med: medicines) {
                
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                
                medTableModel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldDosage;
    private javax.swing.JTextField fieldName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalogTable;
    // End of variables declaration//GEN-END:variables
}
