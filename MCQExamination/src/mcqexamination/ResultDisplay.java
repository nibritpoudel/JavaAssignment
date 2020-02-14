/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqexamination;

import dbNibriti.databaseNibriti;
import static java.lang.System.exit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nibriti Poudel
 */
public class ResultDisplay extends javax.swing.JFrame {

    String ans5, studentname, cor5, id5, query, subject;
    int marks, finalmarks;
    public ResultDisplay(String ans5, String studentname, int marks, String id5, String subject) {
        initComponents();
        this.ans5=ans5;
        this.marks=marks;
        this.studentname=studentname;
        this.id5=id5;
        this.subject=subject;
        marks();
    }

    public void marks(){
         try {
             //To obtain the final marks
            query = "SELECT * FROM question WHERE question_id='"+id5+"'";

            databaseNibriti db=new databaseNibriti();
            PreparedStatement preparedstmt = db.conn.prepareStatement(query);
            ResultSet rs = preparedstmt.executeQuery();
            while(rs.next()){
                cor5=(rs.getString("correct"));             
            }

        } catch (SQLException ex) {
            
        }
         
        if(cor5.equals(ans5)){
            finalmarks=1+marks;
        }
        else{
            finalmarks=0+marks;
        }
        String score=Integer.toString(finalmarks);
        //Shows the final marks in the label
        lblResult.setText(score);
        
        if(finalmarks<=2){
            txtMessage.setText("Sorry " +studentname+". You have failed "+ subject+" Subject.");
        }
        else{
            txtMessage.setText("Congratulation "+studentname+". You have passed the "+ subject+" Subject.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Congratulations!!! You have completed the test");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Your Final marks for this subject is");

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtMessage.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txtMessage.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(289, 289, 289)
                            .addComponent(lblResult))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       String date=null;
       DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       date=dateformat.format(now);
       databaseNibriti db=new databaseNibriti();
      
        try {
            //Inserting into result table
            PreparedStatement preparedpstmt = db.conn.prepareStatement("INSERT INTO `result`(`studentname`, `result`, `date`, `subjectname` ) VALUES(?,?,?,?) ");
            preparedpstmt.setString(1,studentname);
            preparedpstmt.setInt(2,finalmarks);
            preparedpstmt.setString(3,date);
            preparedpstmt.setString(4,subject);
           
           int result = preparedpstmt.executeUpdate();
           //To display Dashboard Form
           Dashboard dashboard=new Dashboard();
           dashboard.setVisible(true);
           this.dispose();
        dashboard.setResizable(false);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }  
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ResultDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String ans5=null;
                String id5=null;
                String studentname=null;
                String subject=null;
                int marks=0;
                new ResultDisplay(ans5, studentname,marks,id5,subject).setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables
}
