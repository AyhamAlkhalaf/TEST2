package org.example;

import java.util.Scanner;

public class Employee
{
    int emp_id;
    String name;
    String depart;
    double salary;
    double bonus;
    boolean resident;

   public Employee(){
       emp_id = 100;
       name = "No Name";
       salary = 3000 ;
       bonus = 500 ;
       depart = "No Assigned Yet";
       resident = true ;
   }

   public   Employee (int idno , String n){
       emp_id = idno;
       name = n ;

   }
    public   Employee (int idno , String n, boolean r){
   //     idno =  emp_id;
     //   n = name;

        this(idno, n);//استدعيت الكونستركتر يلي فوقو (كونسترتر تشينغ)
        resident = r ;


    }
    public   Employee (int idno , String n,double s,double b, String d,boolean r){

        this(idno, n,r);//استدعيت الكونستركتر يلي فوقو (كونسترتر تشينغ)
        salary = s;
        bonus = b;
        depart = d ;


    }
    public void set_salary (double sa){

       salary = sa;


    }

    public  void  set_Bonus(double sa , double bo){
       this.set_salary(sa);
       bonus = bo;

    }


  public  void  print_emp_data()
  {
    System.out.println("ID " + emp_id);
      System.out.println("Name " + name);
      System.out.println("Depart " + depart);
      System.out.println("Salary " + salary);
      System.out.println("Bonus " + bonus);
      System.out.println("Resident " + resident);
  }
}


