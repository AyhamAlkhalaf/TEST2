package org.example;



enum  Gender {Male,Female};// ال اينم تعطي قيم افتراضية لا يمكن اختيار غيرها للمتغيرات
enum  Course {Database,Programing,Math,Erp};
enum  Semester{Summer,Winter,Fall,Spring};


public class RegisterForm {

    String stdname;
    Gender stdgender;
    Course crs;
    Semester sem;

    public  RegisterForm (){

        stdname = "No Name";
        stdgender = Gender.Male;
        crs = Course.Database;
        sem = Semester.Spring;
        //sem = "winter"; لانه ليس من القيم الافتراضية لل اينم



    }

}
