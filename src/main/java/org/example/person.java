package org.example;

public class person {

    String name;
    Double age;
    String address;
    String nationality;

    public person() {

    }

    public person(String n, Double a, String ad, String nat) {
        name = n;
        age = a;
        address = ad;
        nationality = nat;

    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(double a) {
        age = a;
    }

    public void setAddress(String ad) {
        address = ad;
    }

    public void setNationality(String nat) {
        nationality = nat;
    }

    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public  void  print_all_details (){

        System.out.println("Name :  " + name + "\nAge :  " + age + "\nNationality : " + nationality + "\nAddress : " + address);

    }


}
