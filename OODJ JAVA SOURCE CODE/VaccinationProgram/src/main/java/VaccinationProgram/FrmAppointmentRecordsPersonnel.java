package VaccinationProgram;
import java.io.*;
import javax.swing.table.*;
import javax.swing.*;

public class FrmAppointmentRecordsPersonnel extends javax.swing.JFrame {
    String frmAccID, name;

    FrmAppointmentRecordsPersonnel(String aID, String n){
        this.frmAccID = aID;
        this.name = n;
        initComponents();
        //To Display all the appointment records into the table when form is initialized
        try{
            File file = new File("Appointment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            DefaultTableModel model = (DefaultTableModel)tblApptRecords.getModel();
            
            Object[] lines = br.lines().toArray();
            //Load records from text file row by row
            for(int i = 0; i<lines.length;i++){
                String[] row = lines[i].toString().split(";");
                model.addRow(row);
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error in the system!\nPlease try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
           
    }
    
    public FrmAppointmentRecordsPersonnel() {
        initComponents();
        //To Display all the appointment records into the table when form is initialized
        try{
            File file = new File("Appointment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));        
            DefaultTableModel model = (DefaultTableModel)tblApptRecords.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i<lines.length;i++){
                String[] row = lines[i].toString().split(";");
                model.addRow(row);
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error in the system!\nPlease try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddAppt = new javax.swing.JButton();
        btnViewAppt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblApptRecords = new javax.swing.JTable();
        btnViewAll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("COVID-19 Vaccination Appointments");

        jLabel2.setText("Enter Account ID or Appointment ID to search:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddAppt.setText("Add New");
        btnAddAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddApptActionPerformed(evt);
            }
        });

        btnViewAppt.setText("View Details");
        btnViewAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewApptActionPerformed(evt);
            }
        });

        tblApptRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Date", "Time", "Location", "Vaccine", "Account ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblApptRecords.setCellSelectionEnabled(true);
        tblApptRecords.setSurrendersFocusOnKeystroke(true);
        tblApptRecords.getTableHeader().setReorderingAllowed(false);
        tblApptRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblApptRecordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblApptRecords);
        tblApptRecords.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnViewAll.setText("View All Records");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAddAppt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewAppt)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnViewAll)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(btnViewAll)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAppt)
                    .addComponent(btnViewAppt))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddApptActionPerformed
        //Call FrmAddAppointmentPersonnel
        this.dispose();
        new FrmAddAppointmentPersonnel(frmAccID, name).setVisible(true);
    }//GEN-LAST:event_btnAddApptActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchID = txtSearchID.getText();
        try{
            File file = new File("Appointment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel)tblApptRecords.getModel();
            Object[] lines = br.lines().toArray();
            model.setRowCount(0);
            for(int i = 0; i<lines.length;i++){                
                String[] row = lines[i].toString().split(";");
                //if search text matches Appointment ID or account ID, display it
                if(row[0].equals(searchID) || row[5].equals(searchID)){
                    model.addRow(row);
                }                
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error in the system!\nPlease try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        //clear all rows
        DefaultTableModel model = (DefaultTableModel)tblApptRecords.getModel();
        model.setRowCount(0);
        //Display all appointment records
        try{
            File file = new File("Appointment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i<lines.length;i++){
                String[] row = lines[i].toString().split(";");
                model.addRow(row);
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error in the system!\nPlease try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnViewApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewApptActionPerformed
        if(tblApptRecords.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "No records selected.\nSelect a record to proceed!", "Error",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int row = tblApptRecords.getSelectedRow();
            //Get appointment ID of the record selected
            String apptID = tblApptRecords.getModel().getValueAt(row, 0).toString();
            this.dispose();
            new FrmViewAppointmentDetailsPersonnel(frmAccID, name, apptID).setVisible(true);
        }
        
    }//GEN-LAST:event_btnViewApptActionPerformed

    private void tblApptRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblApptRecordsMouseClicked
        
    }//GEN-LAST:event_tblApptRecordsMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new FrmPersonnelMainMenu(frmAccID, name).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        new FrmPersonnelMainMenu(frmAccID, name).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmAppointmentRecordsPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentRecordsPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentRecordsPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAppointmentRecordsPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //Create and display the fotblApptRecords       
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAppointmentRecordsPersonnel().setVisible(true);
            }
             
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewAppt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblApptRecords;
    private javax.swing.JTextField txtSearchID;
    // End of variables declaration//GEN-END:variables
}
