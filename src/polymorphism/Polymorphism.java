/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author shiam
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v = new Vehicle();
        v.go();
        
        v = new Car();
        v.go();
         
        v = new Bicycle();
        v.go();
        
        v = new Boat();
        v.go(); 
        
    }
    
}
