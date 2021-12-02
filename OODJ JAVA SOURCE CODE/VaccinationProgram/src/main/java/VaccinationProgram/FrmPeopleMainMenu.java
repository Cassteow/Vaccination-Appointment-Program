
package VaccinationProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class FrmPeopleMainMenu extends javax.swing.JFrame {
    String frmAccID, name, user = "People";

    
    FrmPeopleMainMenu(String aID, String n){
        this.frmAccID = aID;
        this.name = n;
        initComponents();
        
        userNameLbl.setText(n);
    }
    public FrmPeopleMainMenu() {
        initComponents();
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
        userNameLbl = new javax.swing.JLabel();
        registrationDetailBtn = new javax.swing.JButton();
        vaccinationAppointmentBtn = new javax.swing.JButton();
        vaccinationInformationBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Welcome Back,");

        userNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLbl.setText("Jane Doe");

        registrationDetailBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrationDetailBtn.setText("Registration Detail");
        registrationDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationDetailBtnActionPerformed(evt);
            }
        });

        vaccinationAppointmentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccinationAppointmentBtn.setText("Vaccination Appointment");
        vaccinationAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinationAppointmentBtnActionPerformed(evt);
            }
        });

        vaccinationInformationBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccinationInformationBtn.setText("Vaccination Status & Information");
        vaccinationInformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinationInformationBtnActionPerformed(evt);
            }
        });

        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameLbl)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vaccinationInformationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vaccinationAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrationDetailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameLbl))
                .addGap(66, 66, 66)
                .addComponent(registrationDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vaccinationAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vaccinationInformationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrationDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationDetailBtnActionPerformed
        new FrmViewRegistrationDetails(frmAccID, name, frmAccID, user).setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_registrationDetailBtnActionPerformed

    private void vaccinationAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinationAppointmentBtnActionPerformed
        boolean apptExist = false;
        try{
            File file = new File("Appointment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String checkLine = null;
            while((checkLine = br.readLine())!=null){
                String[] temp = checkLine.split(";");         
                    if(temp[5].equals(frmAccID)){
                        apptExist = true;                       
                    }
            }
            br.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error in the system!\nPlease try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
        
        if(apptExist == true){
            this.dispose();
            new FrmViewApptPeople(frmAccID, name).setVisible(true); 
        }else{
            this.dispose();
            new FrmAddAppointmentPeople(frmAccID, name).setVisible(true); 
        }
               
    }//GEN-LAST:event_vaccinationAppointmentBtnActionPerformed

    private void vaccinationInformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinationInformationBtnActionPerformed
        this.dispose();
        new FrmStatusPeople(frmAccID, name).setVisible(true);
    }//GEN-LAST:event_vaccinationInformationBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        this.dispose();
        new FrmMainLogin().setVisible(true);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        new FrmMainLogin().setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmPeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeopleMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton registrationDetailBtn;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JButton vaccinationAppointmentBtn;
    private javax.swing.JButton vaccinationInformationBtn;
    // End of variables declaration//GEN-END:variables
}
