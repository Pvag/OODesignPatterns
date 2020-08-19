public class Driver {
    public static void main(String[] args) {
        Duck duckieCool = new SuperDuck(); // polymorphism
        System.out.println("* First, let's ask our 'SuperDuck' to fly:");
        duckieCool.performFly();
        System.out.println("* Then, let's change at runtime her fly behavior to 'FlyEasy':");
        duckieCool.setFlyBehavior(new FlyEasy());
        System.out.println("* Now, let's ask our duck to fly, again:");
        duckieCool.performFly();
        Duck easyDuck = new CalmDuck();
        System.out.println("* Now I instantiate a 'CalmDuck' and ask her to perform fly and quack:");
        easyDuck.performFly();
        easyDuck.performQuack();
    }
}