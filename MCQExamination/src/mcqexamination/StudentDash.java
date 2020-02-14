/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqexamination;

import dbNibriti.databaseNibriti;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nibriti Poudel
 */
public class StudentDash extends javax.swing.JFrame {

    /**
     * Creates new form StudentDash
     */
     String studentname;
    public StudentDash(String studentname) {
        initComponents();
        this.studentname=studentname;
        retrivingSubjects();
        listingSubjects();
        lblStudentname.setText(studentname);
        fetch_data();
    }
    
    //To show student past result
    public void fetch_data(){
        
        try{
            databaseNibriti db=new databaseNibriti();
            Statement stmt = db.conn.createStatement();
            String sql="Select studentname, result, date, subjectname from result WHERE studentname='"+studentname+"'";
            ResultSet rs=stmt.executeQuery(sql);
            tblResult.setModel(PastResult.TableModelResultSet(rs));
        }
        catch(Exception e){
            
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
        cmbSubject = new javax.swing.JComboBox<>();
        btnGiveexam1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblStudentname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnLoginout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Welcome ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel2.setText("Choose a subject to give exam ");

        cmbSubject.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGiveexam1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnGiveexam1.setText("Give Exam");
        btnGiveexam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveexam1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Once you click on Start Examination you won't be able to restart.");

        lblStudentname.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Subject", "Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResult);

        btnLoginout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLoginout.setText("Log out");
        btnLoginout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStudentname))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGiveexam1)
                        .addGap(159, 159, 159)
                        .addComponent(btnLoginout)
                        .addGap(121, 121, 121)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStudentname))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiveexam1)
                    .addComponent(btnLoginout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiveexam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveexam1ActionPerformed
        String subject= (String) cmbSubject.getSelectedItem();
        JOptionPane.showMessageDialog(null,"Good Luck "+studentname+". You choosed: "+subject); 
        Question1 q1= new Question1(subject,studentname);
        q1.setVisible(true);
        this.dispose();
        q1.setResizable(false);
    }//GEN-LAST:event_btnGiveexam1ActionPerformed

    private void btnLoginoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginoutActionPerformed
        //to display dashboard
        Dashboard dashboard=new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
        dashboard.setResizable(false);
    }//GEN-LAST:event_btnLoginoutActionPerformed
    
    //To retrieve all the subject list
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

        //To list all the retrieved subjects in the combo box
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
            java.util.logging.Logger.getLogger(StudentDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String studentname=null;
                new StudentDash(studentname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiveexam1;
    private javax.swing.JButton btnLoginout;
    private javax.swing.JComboBox<String> cmbSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStudentname;
    private javax.swing.JTable tblResult;
    // End of variables declaration//GEN-END:variables
}
