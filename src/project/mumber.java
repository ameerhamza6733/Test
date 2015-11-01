/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Ameer Hamza
 */
public class mumber {
    
    private Scanner scanner;
    private int marks =0;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int markas) {
        this.marks = markas;
    }
    private String Fname,city;
    private String Lname;
    private String UserName;
    private String date_of_birth;
    private String user_name,pass_word,name_file,password_file;
    private Formatter f;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }
    

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }

    public String getPassword_file() {
        return password_file;
    }

    public void setPassword_file(String password_file) {
        this.password_file = password_file;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLoction() {
        return loction;
    }

    public void setLoction(String loction) {
        this.loction = loction;
    }
    private String gender,loction;

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public boolean Chack_mumber_or_not(String name_text_field ,String password)
            
    { try{
             scanner = new Scanner(new File("login.txt"));
         }catch(Exception e)
         {
             System.out.printf("file not found");
             
         }
         int count=0;
         while(scanner.hasNext())
         {
              this. name_file = scanner.next();
              this. password_file = scanner.next();
             if(name_file.equals(name_text_field) && password_file.equals(password) )
             {
                
                 //System.out.printf("name %s",name_file);
                 count++;
                 for(;;)
                     break;
                 
                // return true; 
                 
             }
             
         }
         scanner.close();
         if(count!=0)
         
             return true;
         
        
         
             return false;
        
         
         
     
         
    }
    public void input_users( String user_name,String password , String fname ,String lname,String gender,String city) 
    
    {
            this.pass_word=pass_word;
            this.UserName=user_name;
            this.Fname = fname;
            this.Lname = lname;
            this.gender= gender;
            this.pass_word=password;
            this.user_name =user_name;
            this.city = city;
        /*try
        {
            f = new Formatter("login.txt");
            
        }
        f.format("%s%s\n",this.UserName," ",this.UserName );
        f.close();*/
            String filename ="";
      /* try
       {
             filename = "login.txt";
             FileWriter fw = new FileWriter(filename,true); //the true will append the new data
             fw.write(this.UserName);//appends the string to the file
             fw.close();
         }catch(Exception e)
        {
            System.out.printf("file not found Exception");
        }*/
            try
            {
                FileWriter fw = new FileWriter("users.txt",true);
                FileWriter fw_login = new FileWriter("login.txt",true);
                PrintWriter pw = new PrintWriter(fw);
                PrintWriter pw_login = new PrintWriter(fw_login);
                pw_login.println();
                pw_login.println(this.UserName+" "+this.pass_word);
                pw.println(this.UserName+"   "+this.pass_word+"    "+this.Fname+"       "+this.Lname+"       "+this.gender+"    "+this.city);
                pw_login.close();
                pw.close();
            }
            catch(Exception e)
            {
                System.out.printf("file not found Exception");
            }
    
    } 
    

    
}
