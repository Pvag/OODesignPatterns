public class Duck {
    private FlyBehavior fb;
    private QuackBehavior qb;
    
    Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.fb = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.qb = qb;
    }

    public void performFly() {
        this.fb.fly();
    }

    public void performQuack() {
        this.qb.quack();
    }

    // * generic behavior for each duck, below *

    public void swim() {
    }

    public void doSomething() {
    }
}