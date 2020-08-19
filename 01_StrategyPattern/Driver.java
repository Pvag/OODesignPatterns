public class Driver {
    public static void main(String[] args) {
        Duck duckie = new SuperDuck(); // polymorphism
        System.out.println("* First, let's ask our SuperDuck to fly:");
        duckie.performFly();
        System.out.println("* Then, let's change at runtime her fly behavior to 'FlyEasy':");
        duckie.setFlyBehavior(new FlyEasy());
        System.out.println("* Now, let's ask our duck to fly, again:");
        duckie.performFly();
    }
}