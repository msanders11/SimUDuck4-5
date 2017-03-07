
package version5.solution;

/**
 *
 * @author Mike
 */
public class ModelDuck implements Duck{
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    @Override
    public final void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    @Override
    public final void setQuackBehavior(QuackBehavior qb) {
       this.quackBehavior = qb;
    }

    @Override
    public final void display() {
        System.out.println("I'm a Model Duck.");
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }
    
}
