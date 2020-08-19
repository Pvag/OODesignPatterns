public class CalmDuck extends Duck {
    CalmDuck() {
        setFlyBehavior(new FlyEasy());
        setQuackBehavior(new QuackShy());
    }
}