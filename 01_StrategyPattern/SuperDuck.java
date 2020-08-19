public class SuperDuck extends Duck {
    SuperDuck() {
        setFlyBehavior(new FlyHigh());
        setQuackBehavior(new QuackLoud());
    }
}