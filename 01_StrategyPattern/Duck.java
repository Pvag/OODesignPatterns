public class Duck {
    FlyBehavior fb;
    
    Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.fb = fb;
    }

    public void performFly() {
        this.fb.fly();
    }

    // * generic behavior for each duck, below *

    public void swim() {

    }

    public void doThis() {

    }
}