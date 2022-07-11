package org.example;

public class Car {
    private  String  maker ;
    private  int model ;
    private static int no_of_objects;// ال ستاتك بيصير الرقم يتبع للكلاس وليس للوبجكت


    public  Car () {
        maker = "Honda" ;
        model = 2018 ;
        no_of_objects ++ ;

    }

    public  Car (String m , int moo){

        maker = m ;
        model = moo ;
        no_of_objects ++;

    }
    public static  int get_No_of_objects(){  // معرفة عدد لاوبجكت الماخوذة من الكلاس

        return  no_of_objects ;
    }




}
