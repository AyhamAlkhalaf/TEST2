package org.example;

public class CD  implements  RetailItem,Displayable { // يعني هذا الكلاس يجب ان يحتوي على الميثود المطلوبة في الانتر فيس

        double pries ;
        String title;
        String artist;

    public CD(double pries, String title, String artist) {
        this.pries = pries;
        this.title = title;
        this.artist = artist;
    }

    public CD() {

    }





    public double getItemPries() {
        return pries;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void disPlay(){

        System.out.println("StoreName " + storeName +"Title : " + title + " prise = " + pries + " Artist : " + artist);

    }


}
