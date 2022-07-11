package org.example;

public class Shape {


    protected  double width;//يعني يمكن استخدامه في نفس الكلاس و الكلاسات الي عاملين من البيرسون وراثة ولا يسمح للكلاسات الغريبة
    protected  double length;

    public Shape (){

    }

    public Shape(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
