
package oop;

public class Main {
    public static void main(String[] args){
        
       System.out.println("Our new teacher ---->\n");
        Teacher teacher1 = new Teacher("Koushik Roy","male",38965);
      
        teacher1.displayInfo();
        
        System.out.println("\n");
        Teacher teacher2 = new Teacher("Shanta Roy","female",38965);
        
        teacher2.displayInfo();
        
        Teacher teacher3 = new Teacher();
        teacher3.displayInfo();
    }
}
