package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;
import  java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

      /*
        Employee  employee = new Employee( 300 , "ayham" ,1000,500,"auu" , true);
       employee.print_emp_data();
       // Employee  employee1 = new Employee();
        //employee1.print_emp_data();
        System.out.println( " Before Set Salary");

        employee.set_Bonus( 7000, 900);
        employee.print_emp_data();

        */

     /*   Car c1 =new Car();
        Car c2 =new Car();
        Car c3 =new Car();
        Car c4 =new Car();
        Car c5 =new Car();

        System.out.println(Car.get_No_of_objects());

        */

        /*
        System.out.println( Calk.add(10,20));
        System.out.println( Calk.subtract(10,20));
        System.out.println( Calk.multiply(10,20));
        */
    /*
        Rectangle room3 = new Rectangle();//استدعاء اوبجكت الى الميثود
        Rectangle myInputObject = new Rectangle(10,30);
        room3.modifyobject(myInputObject);// تغيرت القيم تبع ماي انبوت اوبجكت الى القيم المرسلة من الموديفاي اوبجكت

       System.out.println(myInputObject.getLength());
        System.out.println(myInputObject.getWidth());

        // عن ما ابعث الاوبجكت فأنا اقوم بارسال  الادرس في الميموري يعني يغير بل قيم الاصلية تبع الاوبجكت
    */

       /* Rectangle  r1 = new Rectangle (10,50 );
        Rectangle  r2 = new Rectangle (30,70 );
        Rectangle  r3 = new Rectangle();
        Rectangle  r4 = r3.add(r1 ,r2);
        System.out.println("l "+r4.getLength());
        System.out.println("w "+r4.getWidth());
        */
        /*
        Rectangle  re1 = new Rectangle (10,50 );
        Rectangle  re2 = new Rectangle (30,70 );
        System.out.println("l "+re1.add1(re2).getLength());
        System.out.println("w "+re1.add1(re2).getWidth());
         */


        //هذه لطريقة تقوم بمقارنة الادرس في الميموري فقط ولا قارن القيم للاوبجكت

        //  Rectangle r1 = new Rectangle(10,20);
        // Rectangle r2 = new Rectangle(10,20);
        /*
        if (r1==r2){
            System.out.println("The Objects Are Equal");
        }else {
            System.out.println("The Objects Are Different");
        }
        */
        //نعمل ميثود جديدة بتقارن الابعاد للوبجكت اسمها از ايكول في هذا المثال

       /*
        if (r1.isEqual(r2)){

            System.out.println("The Objects Are Equal");
        }else {
            System.out.println("The Objects Are Different");
        }
        */


        // لنقوم بنسخ اوبجكت ممع ادرس مختلف
        /*
        Rectangle r1 = new Rectangle(10,50);
        Rectangle r2 = new Rectangle(r1);

        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        */


        // الوراثة انهيرتنس
        /*
        student  st1=new student("Ayham",20 ,"syria","syrian" , 10 ,"asd",2.4);

        System.out.println("Name : " +  st1.getName());
        System.out.println( st1.getNationality());
        */

//        Salaried_Employee se1 = new Salaried_Employee("ayham",10,"sy","syn",3000,"mang","engenier",500,100);
//        System.out.println(se1.getSalary());
//
//       se1.print_all_details();

        // Employe e1 = new Employe("ayham",10,"sy","syn",3000,"mang","engenier");
        //Employe e2 = new Salaried_Employee("ayham",10,"sy","syn",3000,"mang","engenier",500,100);
        //System.out.println(e1.getSalary());// لا  يوجد مشكلة لان الاوبجكت الجديد من نفس نوع الاصلي
        //System.out.println(e2.getSalary());// عند استدعاء الميثود  من ال   e2يجب ان يكون لها اصل في الامبلوي
        // System.out.println(e2.getbonus()); // لا يعمل لان الميثود موجودة فقط في ال سالريد امبلوي
        // System.out.println(e2.getJob());


//        Employe e1=new Employe();
// gالخطا بسبب ان الكلاس ابستراكت



      //  RetailItem r1 = RetailItem(); // لا يجوز عمل اوبجكت من ال انترفيس
//        CD cd1 = new CD();
//        cd1.getItemPries();
//        cd1.setTitle("");// يتعرف عليها لانها موجودة في الكلاس الاصلي
//
//        RetailItem cd2 = new CD();
//        cd2.getItemPries();
//        cd2.set //  لا يعرف اي ميثود غير موجودة في ال  retailItem الانتر فيس يعني
//        Displayable cd3 = new CD();
//        cd3.disPlay();



        //enum
//        Course c1 = Course.Math;
//        Course c2 = Course.Database;
//
//        System.out.println(c1.toString());// تطبع النص
//        System.out.println(c1.ordinal());// تطبع ترتيب ال ماث من 0 الى ...
//        System.out.println(c1.compareTo(c2));// تقارن بين ال الاوبجكت اذا الاول اكبر يخرج ناتج موجب اذا سالب بلعكس اذا صفر متساوي
//        System.out.println(c1.equals(c2));//  تطيع ترو او فولس يعني متساوي او لا

        /*
        try { // هاندل تقوم على حصر الاخطاء المتوقعة ومنع البرنامج من التوقف مع اظهار الخطأ
            int x ;
            int  y ;
            Scanner s =new Scanner(System.in);
            System.out.println("Enter  x ");
            x = s.nextInt();
            System.out.println("Enter  y ");
            y = s.nextInt();

            System.out.println(x/y);


        }
//        catch (ArithmeticException e){ // ايرور معروف يظهر عند القسمة على صفر
//            System.out.println("Error , Division By Zero Noy Allowed ");
//        }
//        catch (InputMismatchException e){// ايرور يظهر عن اذخال نوع مختلف من البيانات المطلوبة
//            System.out.println("Error , Please Enter Numeric Values ");
//        }
        catch (Exception e){ // يعمل كاتش ل اي نوع من الاكسبشن
            System.out.println("Error " + e.getMessage());// يطبع الايرور
        }


        System.out.println("The program continues ");

        */

        ArrayList <String > list = new ArrayList<String>();//الاريه كلاس

        list.add("ayham");
        list.add("asmaa");
        list.add("tya");

        System.out.println(list.size());// عددها
        System.out.println(list);// طباعتها
        System.out.println(list.get(2));// طباعت الرقم 2 فقط

        list.add(1,"ali"); // وضع اسم حديد في ال اندكس 1
        System.out.println(list);

        list.set(3 , "mayar");// استبدال
        System.out.println(list);

        list.remove(2);// حذف
        System.out.println(list.size());
        System.out.println(list);














    }


}