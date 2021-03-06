
package VaccinationProgram;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class FrmModifyRegistrationPeople extends javax.swing.JFrame {
    String frmAccID, name, userType;
    String accID, FullName, IC_Passport, Citizen_NonCitizen, Residence, Password, RePassword,HealthStat, TnC, DOB,PhoneNumber, vacStat;
    Date date;
 
    public FrmModifyRegistrationPeople(String aID, String n, String u, String fID) {
        this.frmAccID = fID;
        this.accID = aID;
        this.name = n;
        this.userType = u;
        initComponents();
        lblID.setText(accID);
        
        //Load Current Registration Details
        try{
            File file = new File("People.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String checkLine = null;
            while((checkLine = br.readLine()) != null)
            {
                String [] temp = checkLine.split(";");
                if(temp[0].equals(accID))
                {
                    lblFullName.setText(temp[2]);
                    txtBoxName.setText(temp[2]);
                    
                    lblICPassport.setText(temp[3]);
                    txtBoxIC.setText(temp[3]);
                    
                    lblCitizenship.setText(temp[4]);
                    if(temp[4] == "Citizen"){
                        cmbBoxCitz.setSelectedIndex(0);
                    }else{
                        cmbBoxCitz.setSelectedIndex(1);
                    }
                    
                    lblPhone.setText(temp[6]);
                    txtBoxPN.setText(temp[6]);
                    
                    lblDOB.setText(temp[5]);
                    Date date = new SimpleDateFormat("dd-mm-yyyy").parse(temp[5]);
                    dateChooserDOB.setDate(date);
                    
                    lblLocation.setText(temp[7]);
                    cmbBoxRes.setSelectedItem(temp[7]);
                    
                    txtBoxPass.setText(temp[1]);
                    txtBoxRePass.setText(temp[1]);
                    
                    lblStatus.setText(temp[10]);
                    
                    lblHS.setText(temp[8]);
                    
                    lblTnC.setText(temp[9]);
                    break;
                }
            }
            br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There is an error in the system!\n"
                    + "Please try again later.", "Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public FrmModifyRegistrationPeople() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmbBoxCitz = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        txtBoxIC = new javax.swing.JTextField();
        cmbBoxRes = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbBoxTNC = new javax.swing.JComboBox<>();
        txtBoxPN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbBoxHA = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtBoxName = new javax.swing.JTextField();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblICPassport = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCitizenship = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBoxPass = new javax.swing.JPasswordField();
        txtBoxRePass = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        lblHS = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblTnC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jLabel24.setText("Citizenship:");

        jLabel26.setText("Health Allergy:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbBoxCitz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));

        lblID.setText("ID");

        cmbBoxRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selangor", "Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan", "Pahang", "Penang", "Sabah", "Sarawak", "Terengganu", "W.P. Kuala Lumpur", "W.P. Labuan", "W.P. Putrajaya" }));

        jLabel11.setText("Do you have any history of severe allergic reactions?");

        jLabel2.setText("Full Name :");

        jLabel3.setText("IC/Passport No:");

        cmbBoxTNC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Date Of Birth:");

        jLabel7.setText("Residence Location:");

        jLabel8.setText("Password:");

        jLabel9.setText("Repeat Password:");

        jLabel10.setText("Health Status:");

        cmbBoxHA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel13.setText("Account ID:");

        txtBoxName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoxNameKeyTyped(evt);
            }
        });

        jLabel12.setText("Do you agree to the Terms & Conditions?");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Modify Registration Details");

        modifyBtn.setText("Modify");
        modifyBtn.setToolTipText("");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Citizenship:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setText("Current Account Registration Details");

        jLabel16.setText("Full Name:");

        lblFullName.setText("ID");

        jLabel17.setText("IC/Passport No:");

        lblICPassport.setText("ID");

        jLabel18.setText("Citizenship:");

        lblCitizenship.setText("ID");

        jLabel19.setText("Phone Number:");

        lblPhone.setText("ID");

        jLabel20.setText("Date of Birth:");

        lblDOB.setText("ID");

        jLabel21.setText("Residence Location:");

        lblLocation.setText("ID");

        jLabel22.setText("Vaccination Status:");

        lblStatus.setText("ID");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel23.setText("Modify Registration Details:");

        txtBoxPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxPassActionPerformed(evt);
            }
        });

        jLabel25.setText("Health Allergy:");

        lblHS.setText("ID");

        jLabel27.setText("Terms & Condition Agreement:");

        lblTnC.setText("ID");

        jLabel14.setText("TnC:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBoxPN, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtBoxName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBoxIC, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateChooserDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(cmbBoxCitz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(cmbBoxRes, 0, 162, Short.MAX_VALUE))
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(lblICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTnC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel15))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel23))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtBoxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBoxRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxHA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(cmbBoxTNC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblID)
                    .addComponent(jLabel19)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblFullName)
                    .addComponent(jLabel20)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblICPassport)
                    .addComponent(jLabel21)
                    .addComponent(lblLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblCitizenship)
                    .addComponent(jLabel22)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lblHS)
                    .addComponent(jLabel27)
                    .addComponent(lblTnC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBoxIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBoxCitz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBoxPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbBoxRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBoxPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBoxRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBoxHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBoxTNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        
        //Ask for user confirmation to modify  registration
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to confirm the modification of registration?",
                "Registration Details Confirmation", dialogButton);
        //If user selects YES:
        if(confirm == 0){
            People ppl = new People();
            boolean modified = ppl.ModifyRegistration();
            if(modified == true){
                JOptionPane.showMessageDialog(null, "Registration details are modified successfully.", "Registration Details Modified",JOptionPane.INFORMATION_MESSAGE);
                name = txtBoxName.getText();
                new FrmPeopleMainMenu(frmAccID, name).setVisible(true);
                this.dispose();
            }
            else{
                txtBoxName.requestFocusInWindow();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operation cancelled!", "Modify Registration",JOptionPane.INFORMATION_MESSAGE);
            
            new FrmPeopleMainMenu(frmAccID, name).setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void txtBoxPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxPassActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new FrmPeopleMainMenu(frmAccID, name).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void txtBoxNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoxNameKeyTyped
        //Only allow text field to accept alphabet, delete keys, and whitespace
        char enter = evt.getKeyChar();
        if(Character.isLetter(enter) || Character.isWhitespace(enter) || Character.isISOControl(enter))
        {
            txtBoxName.setEditable(true);
        }else{
            txtBoxName.setEditable(false);
        }
    }//GEN-LAST:event_txtBoxNameKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new FrmPeopleMainMenu(frmAccID, name).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModifyRegistrationPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModifyRegistrationPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModifyRegistrationPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModifyRegistrationPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModifyRegistrationPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    public static javax.swing.JComboBox<String> cmbBoxCitz;
    public static javax.swing.JComboBox<String> cmbBoxHA;
    public static javax.swing.JComboBox<String> cmbBoxRes;
    public static javax.swing.JComboBox<String> cmbBoxTNC;
    public static com.toedter.calendar.JDateChooser dateChooserDOB;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel lblCitizenship;
    public static javax.swing.JLabel lblDOB;
    public static javax.swing.JLabel lblFullName;
    public static javax.swing.JLabel lblHS;
    public static javax.swing.JLabel lblICPassport;
    public static javax.swing.JLabel lblID;
    public static javax.swing.JLabel lblLocation;
    public static javax.swing.JLabel lblPhone;
    public static javax.swing.JLabel lblStatus;
    public static javax.swing.JLabel lblTnC;
    public static javax.swing.JButton modifyBtn;
    public static javax.swing.JTextField txtBoxIC;
    public static javax.swing.JTextField txtBoxName;
    public static javax.swing.JTextField txtBoxPN;
    public static javax.swing.JPasswordField txtBoxPass;
    public static javax.swing.JPasswordField txtBoxRePass;
    // End of variables declaration//GEN-END:variables
}
