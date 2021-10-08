
package oop;

public class Teacher {
    String name, gender;
    int phone;
    Teacher(){
        System.out.println("\nNO value");
    }
    Teacher (String n, String g, int phn){
        name = n;
        gender =g ;
        phone  =phn;
    }

    
    
    void displayInfo(){
    
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("Phone: "+phone);
}
}