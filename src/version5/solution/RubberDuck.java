/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5.solution;

/**
 *
 * @author Mike
 */
public class RubberDuck implements Duck{
    
    private FlyBehavior flyBehavior;
    private QuackBehavior qauckBehavior;

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior qauckBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(qauckBehavior);
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQauckBehavior() {
        return qauckBehavior;
    }

    @Override
    public final void setQuackBehavior(QuackBehavior qauckBehavior) {
        this.qauckBehavior = qauckBehavior;
    }

    @Override
    public final void display() {
        System.out.println("I'm a Rubber Duck.");
    }

    @Override
    public final void performQuack() {
        qauckBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }    
    
    
}
