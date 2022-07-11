package org.example;

public class Rectangle {
    private  double length;
    private  double width;

    public  Rectangle (){
        length = 10 ;
        width = 15 ;
        System.out.println("a new created with 10 m length and 15 m width");

    }
    public  Rectangle (double l , double w){
        length = l ;
        width = w ;

    }

    public  void modifyobject(Rectangle r){
        r.length =67 ;
        r.width =98 ;

    }

    public  Rectangle  add (Rectangle  room1 , Rectangle room2){// للجمع بين 2 اوبجكت جداد

        Rectangle result = new Rectangle();

        result.length = room1.length + room2.length ;
        result.width = room1.width + room2.width;

        return result;
    }
    public  Rectangle  add1 (Rectangle room2){//للجمع بين الاوبجكت الي شغال فيه و اوبجكت جديد

        Rectangle result1 = new Rectangle();

        result1.length = this.length + room2.length ;
        result1.width = this.width + room2.width;

        return result1;
    }


    public  void  setLength (double l ){
        length = l ;

    }
    public  void  setWidth (double w ){
        length = w ;

    }
    public  double  getLength (){
        return  length;

    }
    public double  getWidth (){
        return width ;

    }
    public  double  getArea (){
        return  width * length;

    }

    public  boolean isEqual (Rectangle obj2){// ميثود للمقارنة بين محتويات اوبجكتس

        if (this.length == obj2.length && this.width == obj2.width){
            return true;
        }else {
            return false;
        }

    }

    public Rectangle (Rectangle sourceObjects){// ميثود لنسخ اوبجكت جديد على ادرس جديد

        length = sourceObjects.length;
        width  = sourceObjects.width;


    }



}