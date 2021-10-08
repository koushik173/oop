
package oop;

public class Test {
    public static void main(String[] args) {
        CallByReferance r1 = new CallByReferance();
        r1.name ="koushik";
        System.out.println("before: "+r1.name);
        
        r1.change(r1);
        System.out.println("before: "+r1.name);
        
    }
}
