/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbNibriti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nibriti Poudel
 */
public class databaseNibriti {
      
    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Connection conn;
    PreparedStatement pstmt;
    
 public databaseNibriti(){
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmcqexamination","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    public  ResultSet adminlogin(String username, String password) {
       
        ResultSet result = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM admin where username=? and password=?");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            result=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
    }
    
    //To login students and check the validity of the student
   public ResultSet studentlogin(String token, String epassword) {
        
     ResultSet eresult = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM student where token_id=? and studentpassword=?");
            pstmt.setString(1,token);
            pstmt.setString(2,epassword);
            eresult=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return eresult;
    }
   
   //To add new student in the student table and provide new token
   public int addnewToken(String token, String password, String studentname) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int result=0;
       String date=null;
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();
       date=dtf.format(now);
       
        try {
            pstmt=conn.prepareStatement("INSERT INTO `student`(`token_id`, `studentname`, `studentpassword`, `date`) VALUES(?,?,?,?)");
            pstmt.setString(1,token);
            pstmt.setString(2,studentname);
            pstmt.setString(3,password);
            pstmt.setString(4,date);
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }     
            return result;
    }
   //To add new question in the question table
    public int addQuestion(String ques, String opt1, String opt2, String opt3, String opt4, String cor, String sub) {
       int result=0;
       String date=null;
      
        try {
            pstmt=conn.prepareStatement("INSERT INTO `question`(`question`, `option1`, `option2`, `option3`, `option4`, `correct`, `subjectname`) VALUES(?,?,?,?,?,?,?) ");
            pstmt.setString(1,ques);
            pstmt.setString(2,opt1);
            pstmt.setString(3,opt2);
            pstmt.setString(4,opt3);
            pstmt.setString(5,opt4);
            pstmt.setString(6,cor);
            pstmt.setString(7,sub);
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }    
            return result;
    }
 
 

  
  
   
}
