package org.example;

public class Salaried_Employee extends  Employe {

    double bonus;
    double deduction;


    public Salaried_Employee(String n, double a, String ad, String nat, double sal, String r, String j, double b, double d)
    {

        super(n,a,ad,nat,sal,r,j);
        bonus = b;
        deduction = d;

    }


    @Override

    public double getSalary() {
        return  salary + bonus - deduction;
    }

    public void print_all_details(){

        super.print_all_details();
        System.out.println("Bonus : " + bonus + "\nDeduction : " + deduction );

    }


}

