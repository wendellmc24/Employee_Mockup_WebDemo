package employeeGUI;

import employeeDBAL.connection;
import java.sql.ResultSet;
import employeeGUI.createEmployeeForm;
import employeeGUI.updateEmployeeForm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wendell
 */


public class employeesForm extends javax.swing.JFrame {

    DefaultTableModel model;
    TableRowSorter rowSorter;
    private final createEmployeeForm createEmployeeForm;
    private final updateEmployeeForm updateEmployeeForm;
    
    /**
     * Creates new form formEmployees
     */
    public employeesForm() {
        initComponents();
        
        createEmployeeForm cEmployeeForm = new createEmployeeForm();
        this.createEmployeeForm = cEmployeeForm;
        updateEmployeeForm uEmployeeForm = new updateEmployeeForm();
        this.updateEmployeeForm = uEmployeeForm;
        String[] titles = {"ID", "Nombre", "Email"};
        model = new DefaultTableModel(null, titles);
        tblEmployees.setModel(model);
        TableRowSorter rowsorter = new TableRowSorter(model);
        tblEmployees.setRowSorter(rowsorter);
        rowSorter=rowsorter;
        showData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        addNewEmployeeBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();
        updateEmployeeBtn = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        employeesLbl = new javax.swing.JLabel();
        filterLbl = new javax.swing.JLabel();
        filterBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        addNewEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/boton-agregar.png"))); // NOI18N
        addNewEmployeeBtn.setText("Add");
        addNewEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEmployeeBtnActionPerformed(evt);
            }
        });

        deleteEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bin.png"))); // NOI18N
        deleteEmployeeBtn.setText("Delete");
        deleteEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeBtnActionPerformed(evt);
            }
        });

        updateEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pencil.png"))); // NOI18N
        updateEmployeeBtn.setText("Update");
        updateEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeBtnActionPerformed(evt);
            }
        });

        employeesLbl.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        employeesLbl.setText("Employees");

        filterLbl.setText("Filter by name: ");

        filterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/filter-filled-tool-symbol.png"))); // NOI18N
        filterBtn.setText("Filter");
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/refresh-page-option.png"))); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(addNewEmployeeBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filterLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filterBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEmployeeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateEmployeeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeesLbl)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(employeesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBtn)
                    .addComponent(resetBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewEmployeeBtn)
                    .addComponent(deleteEmployeeBtn)
                    .addComponent(updateEmployeeBtn)
                    .addComponent(refreshBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        String searchText = txtFilter.getText();
        rowSorter.setRowFilter(new myRowFilter(searchText));
    }//GEN-LAST:event_filterBtnActionPerformed

    private void addNewEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewEmployeeBtnActionPerformed
        createEmployeeForm.setVisible(true);
        createEmployeeForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addNewEmployeeBtnActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        String fullName = "";
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            fullName = receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString();
            String[] name = fullName.split(" ");
            String firstName = name[0];
            String lastName = name[1];
            updateEmployeeForm.lblID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            updateEmployeeForm.txtFirstNameUpdate.setText(firstName);
            updateEmployeeForm.txtLastNameUpdate.setText(lastName);
            updateEmployeeForm.txtEmailUpdate.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void deleteEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeBtnActionPerformed
        connection objConnection = new connection();
        String strDeleteQuery = String.format("DELETE FROM Employees "
                + "WHERE ID="+ model.getValueAt(tblEmployees.getSelectedRow(),0));
        objConnection.executeQuerySQL(strDeleteQuery);
        JOptionPane.showMessageDialog(null, "Employee Deleted", " ", JOptionPane.INFORMATION_MESSAGE);
        this.showData();
    }//GEN-LAST:event_deleteEmployeeBtnActionPerformed

    private void updateEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeBtnActionPerformed
        updateEmployeeForm.setVisible(true);
        updateEmployeeForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_updateEmployeeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        txtFilter.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        this.showData();
    }//GEN-LAST:event_refreshBtnActionPerformed

    
    public void showData() {
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        connection objConnection = new connection();
        try {
            ResultSet response = objConnection.getRegisters("SELECT * FROM Employees");
            while (response.next()) {
                System.out.println(response.getString("ID"));
                System.out.println(response.getString("Name"));
                System.out.println(response.getString("Email"));
                Object[] objUser = {response.getString("ID"), response.getString("Name"), response.getString("Email")};
                model.addRow(objUser);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

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
            java.util.logging.Logger.getLogger(employeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewEmployeeBtn;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JLabel employeesLbl;
    private javax.swing.JButton filterBtn;
    private javax.swing.JLabel filterLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JButton updateEmployeeBtn;
    // End of variables declaration//GEN-END:variables
}

