/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5.solution;

/**
 *
 * @author msanders11
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();   
        mallard.performFly();
    }
}
