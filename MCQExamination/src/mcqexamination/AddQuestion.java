/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqexamination;

import javax.swing.JOptionPane;
import dbNibriti.databaseNibriti;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Nibriti Poudel
 */
public class AddQuestion extends javax.swing.JFrame {

    /**
     * Creates new form AddQuestion
     */
    public AddQuestion() {
        initComponents();
        retrivingSubjects();
        listingSubjects();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmb_sub = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaQuestion = new javax.swing.JTextArea();
        xxx = new javax.swing.JLabel();
        txtOpt1 = new javax.swing.JTextField();
        xxx1 = new javax.swing.JLabel();
        xxx2 = new javax.swing.JLabel();
        xxx5 = new javax.swing.JLabel();
        txtOpt2 = new javax.swing.JTextField();
        txtOpt3 = new javax.swing.JTextField();
        txtCorrect = new javax.swing.JTextField();
        txtOpt4 = new javax.swing.JTextField();
        xxx6 = new javax.swing.JLabel();
        cmbSubject = new javax.swing.JComboBox<>();
        xxx7 = new javax.swing.JLabel();
        btnAddquestion = new javax.swing.JButton();
        btnAdmindash = new javax.swing.JButton();

        jLabel2.setText("Option 1:");

        cmb_sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Question");

        txtareaQuestion.setColumns(20);
        txtareaQuestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtareaQuestion.setRows(5);
        jScrollPane1.setViewportView(txtareaQuestion);

        xxx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx.setText("Option 1:");

        txtOpt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpt1ActionPerformed(evt);
            }
        });

        xxx1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx1.setText("Option 2:");

        xxx2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx2.setText("Option 3:");

        xxx5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx5.setText("Option 4:");

        txtOpt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpt2ActionPerformed(evt);
            }
        });

        txtOpt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCorrect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtOpt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        xxx6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx6.setText("Correct answer:");

        cmbSubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubjectActionPerformed(evt);
            }
        });

        xxx7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xxx7.setText("Subject:");

        btnAddquestion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddquestion.setText("Add Question");
        btnAddquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddquestionActionPerformed(evt);
            }
        });

        btnAdmindash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdmindash.setText("Admin Dasboard");
        btnAdmindash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmindashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xxx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xxx1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xxx5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xxx2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(xxx6, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(96, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xxx7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnAddquestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdmindash)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxx, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxx1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxx2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxx5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xxx6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xxx7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddquestion)
                    .addComponent(btnAdmindash))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_subActionPerformed

    private void cmbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSubjectActionPerformed

    private void btnAddquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddquestionActionPerformed
        String question=txtareaQuestion.getText();
        String option1=txtOpt1.getText();
        String option2=txtOpt2.getText();
        String option3=txtOpt3.getText();
        String option4=txtOpt4.getText();
        String correct=txtCorrect.getText();
        String subject=(String) cmbSubject.getSelectedItem();
        String empty = "";
        
        //For validating
        if(question.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter a question");
        }
        else if(option1.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter Option 1");
        }
        else if(option2.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter Option 2");
        }
        else if(option3.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter Option 3");
        }
        else if(option4.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter Option 4");
        }
        else if(correct.equals(empty)){
            JOptionPane.showMessageDialog(this, "Please enter a correct answer");
        }
        else if(subject.equals(empty)){
            JOptionPane.showMessageDialog(this, "Subject is empty! Please re-enter...");
        }
        else{
            try {
                databaseNibriti db=new databaseNibriti();
                int result=db.addQuestion(question,option1,option2,option3,option4,correct,subject);
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"A new Question has been added Successfully");
                    //To clear all the text boxes
                    txtareaQuestion.setText("");
                    txtOpt1.setText("");
                    txtOpt2.setText("");
                    txtOpt3.setText("");
                    txtOpt4.setText("");
                    txtCorrect.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to add Question");
                    //To clear all the text boxes
                    txtareaQuestion.setText("");
                    txtOpt1.setText("");
                    txtOpt2.setText("");
                    txtOpt3.setText("");
                    txtOpt4.setText("");
                    txtCorrect.setText("");
                }    
         }
        
         catch (Exception ex) {
         
         }
        
        }  
    }//GEN-LAST:event_btnAddquestionActionPerformed

    private void txtOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpt2ActionPerformed

    private void txtOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpt1ActionPerformed

    private void btnAdmindashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmindashActionPerformed
                      //To display admin dashboard
                       AdminDash ad= new AdminDash();
                       ad.setVisible(true);
                       this.dispose();
                       ad.setResizable(false);
    }//GEN-LAST:event_btnAdmindashActionPerformed
   //To retrieve all the subjects form the subject table
    public List<String> retrivingSubjects(){
        List<String> subject = new ArrayList<>();
        try {
            String query = "Select * from subject";
            databaseNibriti db=new databaseNibriti();
            PreparedStatement preparedstmt = db.conn.prepareStatement(query);
            ResultSet rs = preparedstmt.executeQuery();
            while(rs.next()){
                subject.add(rs.getString("subjectname"));
            }
        } catch (SQLException ex) {
            
        }
        return subject;
    }
    //To show all the retrieved subjects
    private void listingSubjects() {
        cmbSubject.removeAllItems();
        List<String> subList = null;
        DefaultComboBoxModel dcmb = null;
        subList = retrivingSubjects();
        dcmb = new DefaultComboBoxModel(subList.toArray());
        cmbSubject.setModel(dcmb);
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
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddquestion;
    private javax.swing.JButton btnAdmindash;
    private javax.swing.JComboBox<String> cmbSubject;
    private javax.swing.JComboBox<String> cmb_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorrect;
    private javax.swing.JTextField txtOpt1;
    private javax.swing.JTextField txtOpt2;
    private javax.swing.JTextField txtOpt3;
    private javax.swing.JTextField txtOpt4;
    private javax.swing.JTextArea txtareaQuestion;
    private javax.swing.JLabel xxx;
    private javax.swing.JLabel xxx1;
    private javax.swing.JLabel xxx2;
    private javax.swing.JLabel xxx5;
    private javax.swing.JLabel xxx6;
    private javax.swing.JLabel xxx7;
    // End of variables declaration//GEN-END:variables
}