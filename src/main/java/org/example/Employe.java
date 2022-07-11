package org.example;

// الاوفر رايد الوراثة
public abstract class Employe extends person {//  الابستراكت يعني الكلاس ممنوع نعمل منه اوبجكت


    double salary;
    String rank;
    String job;

    public Employe(String n, double a, String ad, String nat, double sal, String r, String j) {
        super(n, a, ad, nat);
        salary = sal;
        rank = r;
        job = j;


    }

    public Employe() {


    }

    public abstract double getSalary();
    //اذا عملنا الميثود فاينل يعني ممنوع نعمل لها اوفررايد ونعدل اي شيئ فيها
    //اذا عملنا الميثود ابستراكت  داخل الكلاس الابستراكت يعني نحنا مجبورين نعمل اوفرايد الها
    public  void setSalary(double sal) {
        salary = sal;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String r) {
        rank = r;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void print_all_details(){

        super.print_all_details();
        System.out.println("Jop : " + job + "\nRank : " + rank + "\nSalary : " + salary );




    }

}
