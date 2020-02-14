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
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Nibriti Poudel
 */
public class Question5 extends javax.swing.JFrame {

    String subject;
    String studentname;
    String id1, id2, id3, id4, id5;
    String query;
    String Question, opt1, opt2, opt3, opt4, correct, cor4, ans4, ans5;
    int marks, finalmarks;
    
    public Question5(String subject,String studentname,String id1,String id2,String id3,String id4,String ans4, int marks) {
        initComponents();
        this.subject=subject;
        this.studentname=studentname;
        this.id1=id1;
        this.id2=id2;
        this.id3=id3;
        this.id4=id4;
        this.ans4=ans4;
        this.marks=marks;
        marks();
        listingQuestions();
    }
    
    //To retrieve all the values from the question table
     public String listingQuestions(){
        
        try {
            query = "SELECT * FROM question WHERE subjectname='"+subject+"'AND question_id!='"+id1+"'AND question_id!='"+id2+"'AND question_id!='"+id3+
                    "'AND question_id!='"+id4+"' ORDER BY RAND() LIMIT 1";
           
            databaseNibriti db=new databaseNibriti();
            PreparedStatement preparedstmt = db.conn.prepareStatement(query);
            ResultSet rs = preparedstmt.executeQuery();
            while(rs.next()){
                id5=(rs.getString("question_id"));
                Question=(rs.getString("question"));
                opt1=(rs.getString("option1"));
                opt2=(rs.getString("option2"));
                opt3=(rs.getString("option3"));
                opt4=(rs.getString("option4"));
                correct=(rs.getString("correct"));

                String[] ans5 = {opt1, opt2, opt3, opt4};
             
                cmbAns5.removeAllItems();
                DefaultComboBoxModel answercmb = new DefaultComboBoxModel(ans5);
                //To display all the retrived options into a combobox
                cmbAns5.setModel(answercmb);
            }
            
            
        } catch (SQLException ex) {
            
        }
        txtQues5.setText(Question);
        return Question;
    }
     
     //To display the obtained marks
     public void marks(){
         try {
            query = "SELECT * FROM question WHERE subjectname='"+subject+"'AND question_id='"+id4+"'";
            
            databaseNibriti db=new databaseNibriti();
            PreparedStatement preparedstmt = db.conn.prepareStatement(query);
            ResultSet rs = preparedstmt.executeQuery();
            while(rs.next()){
                cor4=(rs.getString("correct"));             
            }

        } catch (SQLException ex) {
            
        }
         
        if(cor4.equals(ans4)){
            finalmarks=1+marks;
        }
        else{
            finalmarks=0+marks;
        }
        String score=Integer.toString(finalmarks);
        //To insert theta obtained marks in the label
        lblScore.setText(score);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext5 = new javax.swing.JButton();
        cmbAns5 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_finalmarks = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQues5 = new javax.swing.JTextArea();
        lblScore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNext5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNext5.setText("Next");
        btnNext5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext5ActionPerformed(evt);
            }
        });

        cmbAns5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbAns5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Question5:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Answer:");

        txt_finalmarks.setText(" ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Your Current Score:");

        txtQues5.setEditable(false);
        txtQues5.setColumns(20);
        txtQues5.setRows(5);
        jScrollPane1.setViewportView(txtQues5);

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Choose the Correct answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAns5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_finalmarks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAns5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_finalmarks)
                    .addComponent(jLabel4)
                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNext5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext5ActionPerformed
          
        ans5=(String) cmbAns5.getSelectedItem();//ans5 contains the selected answer
        
        //To display the next question
        ResultDisplay result= new ResultDisplay(ans5, studentname, finalmarks, id5, subject);
        result.setVisible(true);
        this.dispose();
        result.setResizable(false);
       
    }//GEN-LAST:event_btnNext5ActionPerformed

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
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String subject=null;
                String studentname=null;
                String id1=null;
                String id2=null;
                String id3=null;
                String id4=null;
                String ans4=null;
                int marks=0;
                new Question5(subject,studentname,id1,id2,id3,id4,ans4,marks).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext5;
    private javax.swing.JComboBox<String> cmbAns5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextArea txtQues5;
    private javax.swing.JLabel txt_finalmarks;
    // End of variables declaration//GEN-END:variables
}
