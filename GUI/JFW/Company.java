
package company;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Company
{
    Connection connect;
    Statement state;
    ResultSet result1, result2;
    PreparedStatement prepare;
    Scanner input;
    
    String url, username, password;
    static String id, fname, lname, gender, pronoun, sex, dob, y, m, d, city, admin_username, admin_password;
    static int ch;
    static boolean secure_code = true;
       
    Company()
    {    
        input =  new Scanner(System.in);

        url="jdbc:mysql://localhost:3306/Company";
        username="root";
        password="912511";
        
        try
        {
            connect=DriverManager.getConnection(url,username,password);
            state = connect.createStatement();
            
             if(connect.isClosed())
             {
                 System.out.println(" Connection is Closed ");
             }   
            
        }
        catch(Exception error)
        {
            System.out.println( error );
        }      
    }
    public static void main(String[] args)
    {
        Company x = new Company();
        x.security();
    }
    
    //  Security function to protect system
    
    void security()
    {
        try
        {   
            result2 = state.executeQuery("Select*from admin");

            admin_username();
            admin_password();
            
            if(result2.next())
            {
                if(admin_username.equals(result2.getString(1)))
                {
                    if(admin_password.equals(result2.getString(2)))
                    {
                        menu1();
                        secure_code = false;
                    }
                    else
                    {
                        System.out.println("\n\t Error : Password is Unvalid...");
                    }
                }
                else
                {
                    System.out.println("\n\t Error : Username is Unvalid...");
                }
            }    
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        System.exit(0);
    }
    
    //  Extra method
    
    void input()
    {
        System.out.print(
                "\n\t --------------------------------------------------------------------------------------------------------------------"
                +"\n\t\t Enter Your Choice Number : "
        );      ch=input.nextInt();         
        System.out.println("\n\n\n");
    }
    void exit()
    {
        System.out.println(
                   "\n\t -------------------------------------------------------------------------------------------------------------------"
                +"\n\t\t Thanks for use  and I hope your successful done your work."  
                +"\n\t_____________________________________________________________________________"
                +"\n\t___________________ [        THE HAPPY END OF PROGRAM       ] ___________________"
                +"\n\n\n"
          );    
        System.exit(0);
    }
    void busy()
    {
        System.out.println("\t SERVICE IS BUSY, Please Try Later..."); 
    }
    void list()
    {
        System.out.println(
                "\n\n\t 1.    First Name"
                +"\n\n\t 2.   Last Name"
                +"\n\n\t 3.   Gender"
                +"\n\n\t 4.   Date Of Birth"
                +"\n\n\t 5.   City Name"
        );
        
        input();
    }
    
    //  Menu method
    
    void menu1()
    {
        System.out.println(
                        "\n\n\t_____________________________________________________________________________"
                        +"\n\t\t\t COMPANY"
                        +"\n\t --------------------------------------------------------------------------------------------------------------------"
                        +"\n\t\t Database Management System [ Menu1 ]"
                        +"\n\t_____________________________________________________________________________"
                        +"\n\n\t Its a simple user friendly CMD Employee database system easy to understand or use."
                        + "\n\t Only choice the statement  and enter statement number >>>"
                        +"\n\n\t\t 1. Employee Data Management."
                        +"\n\n\t\t 2. Admin Management."
                        +"\n\n\t\t 3. Show All Data."
                        +"\n\n\t\t 4. Exit ."
        );
        input();
        
        switch(ch)
        {
            case 1 :    menu2();    break;
            case 2 :    menu3();    break;
            case 3 :    all();  break;
            default : exit();
        }
    }
    void menu2()
    {
       System.out.println(
                "\n\n\t_____________________________________________________________________________"
                +"\n\t\t\t COMPANY"
                +"\n\t --------------------------------------------------------------------------------------------------------------------"
                +"\n\t\t Employee Database Management System [ Menu2 ]"
                +"\n\t_____________________________________________________________________________"
                +"\n\n\t\t 1. ADD DATA."
                +"\n\n\t\t 2. SHOW DATA."
                +"\n\n\t\t 3. MODIFY DATA."
                +"\n\n\t\t 4. DELETE DATA."
                +"\n\n\t\t 5. BACK MENU."
                +"\n\n\t\t 6. EXIT."           
        );
       input();
       
       switch(ch)
       {
           case 1 :     add();      break;
           case 2 :     show();     break;
           case 3 :     update();      break;
           case 4 :     delete();   break;
           case 5 :     menu1();    break;
           default  :   exit();
       }
    }
    void menu3()
    {
        try
        {
            System.out.println(
                "\n\n\t_____________________________________________________________________________"
                +"\n\t\t\t COMPANY"
                +"\n\t --------------------------------------------------------------------------------------------------------------------"
                +"\n\t\t Admin Management System [ Menu3 ]"
                +"\n\t_____________________________________________________________________________"
                +"\n\n\t\t 1. ADD NEW ADMIN."
                +"\n\n\t\t 2. DROP ANY ADMIN."
                +"\n\n\t\t 3. BACK MENU."
                +"\n\n\t\t 4. EXIT."           
            );
            input();
        
            switch(ch)
            {
                case 1 :  add_admin(); break;
                case 2 :  drop_admin();  break;
                case 3 :  menu1();  break;
                default : exit(); 
            }
            
            menu1();
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        menu1();
    }
    
    //  Admin methods
    
    void add_admin()
    {
        try
        {
            admin_username();
            admin_password();
            int resultl = state.executeUpdate("INSERT INTO admin VALUES ('"+admin_username+"','"+admin_password+"') ");
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        finally
        {
            System.out.println("\n\t New Admin Added... ");
        }
                    
        menu3();
    }
    void drop_admin()
    {
        try
        {
            admin_username();
            admin_password();
            int resutl = state.executeUpdate("DELETE FROM ADMIN WHERE username  ='"+admin_username+"' AND password ='"+admin_password+"'");
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        finally
        {
            System.out.println("\n\t Any Admin droped... ");
        }
                    
        menu3();
    }
    
    //  Working methods
    
    void all()
    {
        try
        {
            result1 = state.executeQuery("Select * From employee");
            System.out.println("\t ID Number \t First Name \t Last Name \t Gender \t Date Of Birth \t City  \n");
            while(result1.next())
            {
                for(int i=1; i<=6; i++)
                {
                    System.out.print("\t "+result1.getString(i));
                }
                System.out.println("\n");
            }
            System.out.println("\n\t Data List Finshed...");
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        menu1();
    }
    void add()
    {
         try
          {
                id();
                fname();
                lname();
                gender();
                dob();
                city();
                
                prepare = connect.prepareCall( " INSERT INTO employee Values (?,?,?,?,?,?) ");
                
                prepare.setString(1, id);
                prepare.setString(2, fname);
                prepare.setString(3, lname);
                prepare.setString(4, gender);
                prepare.setString(5, dob);
                prepare.setString(6, city);
                
                boolean execute = prepare.execute();
                
                System.out.println("\n\t Data is Inserted... ");
          }
          catch(Exception error)
          {
              System.out.println(error);
          }
          
          menu2();
    }
    void show()
    {
        try
        {
            id();
            result1 = state.executeQuery("Select * from Employee where id= "+id+" ");
            
            if( result1.next())
            {
                if( "F".equals(result1.getString(4)) )
                {
                    sex="Femlae";pronoun="She";
                }
                else
                {
                    sex="Mlae";pronoun="He";
                }

                    System.out.print("\t ----------[ ID : "+result1.getString(1)+" ]----------"
                             +"\n\t Employee Name is "+result1.getString(2)+" "+result1.getString(3)
                             +"\n\t "+pronoun+" is "+sex
                             +"\n\t "+pronoun+" born in "+result1.getString(5)
                             +"\n\t "+pronoun+" live in "+result1.getString(6)
                     );
                 }
            System.out.println("\n\t Data Finshed...");
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
          
          menu2();
    }
    void update()
    {
        try
        {
            System.out.println("\n\t ----------------------------------------------[ UPDATE ]------------------------------------------------------"
                    +"\n\n\t Update Data By take refrence id and select number  where field "
                    + "\n\t you need to change. and fill new value"
            );
            list();
            switch(ch)
            {
                case 1 :
                    prepare = connect.prepareCall("Update employee set fname=? where id=?");
                    fname();      prepare.setString(1, fname);
                    break;
                case 2 :
                    prepare = connect.prepareCall("Update employee set lname=? where id=?");
                    lname();      prepare.setString(1, lname);
                    break;
                case 3 :
                    prepare = connect.prepareCall("Update employee set gender=? where id=?");
                    gender();      prepare.setString(1, gender);
                    break;
                case 4 :
                    prepare = connect.prepareCall("Update employee set dob=? where id=?");
                    dob();      prepare.setString(1, dob);
                    break;
                case 5 :
                    prepare = connect.prepareCall("Update employee set city=? where id=?");
                    city();      prepare.setString(1, city);
                    break;
                default : System.out.println("\n\t ERROR : wrong number choice...");
            }    
            
            id();     prepare.setString(2, id);
            
            prepare.executeUpdate();
            
            System.out.println("\n\t Data Updated...");  
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        
        menu2();
    }
    void delete()
    {
        try
        {
            System.out.println("\n\t ----------------------------------------------[ DELETE ]------------------------------------------------------"
                    +"\n\n\t Delete Data by take refrence id and following seletection."
            );
            list();
            switch(ch)
            {
                case 1 :
                    prepare = connect.prepareCall("Delete from employee where fname=? and id = ?");
                    fname();      prepare.setString(1, fname);
                    break;
                case 2 :
                   prepare = connect.prepareCall("Delete from employee where lname=? and id = ?");
                    lname();      prepare.setString(1, lname);
                    break;
                case 3 :
                    prepare = connect.prepareCall("Delete from employee where gender=? and id = ?");
                    gender();      prepare.setString(1, gender);
                    break;
                case 4 :
                    prepare = connect.prepareCall("Delete from employee where dob=? and id = ?");
                    dob();      prepare.setString(1, dob);
                    break;
                case 5 :
                    prepare = connect.prepareCall("Delete from employee where city=? and id = ?");
                    city();      prepare.setString(1, city);
                    break;
                default :
            }    
            id();   prepare.setString(2,id);
            prepare.execute();
            
            System.out.println("\n\t Data Deleted...");
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
        
        menu2();
    }
    
    // Input field mehtod
    
    void id(){
          System.out.print("\n\n\t Enter employee ID number = ");        id=input.next();
      }
      void fname(){
          System.out.print("\n\n\t Enter employee First Name = ");       fname=input.next();
      }
      void lname(){
          System.out.print("\n\n\t Enter employee Last Name = ");       lname=input.next();
      }
      void gender(){
          System.out.print("\n\n\t Enter employee Gender [ M/F/T ] = ");       gender=input.next();
      }
      void city(){
          System.out.print("\n\n\t Enter Cityname  where Employee leave = ");       city=input.next();
      }
      void dob(){
          System.out.println("\n\n\t Enter employee Date Of Birth ");
          System.out.print("\n\t Enter Year = ");       y=input.next();
          System.out.print("\n\t Enter Month in number = ");   m=input.next();
          System.out.print("\n\t Enter Day in number = ");   d=input.next();
          dob = y+"-"+m+"-"+d;
     }
      void admin_username()
      {
          System.out.print("\n\n\t Enter Username : ");         admin_username=input.next();
      }
      void admin_password()
      {
          System.out.print("\n\n\t Enter Password : ");         admin_password=input.next();
      }
}   //  the end
        
//            while(result2.next())
//            {
//                System.out.println("\t"+result2.getString(1)+"\t"+result2.getString(2));
//            }  