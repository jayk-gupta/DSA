package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Interfaces contain abstract function
//        By default the functions are public and abstract
//        Variables are static and final by default (not dependent on object)
//        Cannot create objects
//        use implements keyword
//        Abstract class can only extend one class
//        Interface can implements various interfaces
//        multiple inheritance
        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        System.out.println(car.color);

        Media carMedia = new Car();
        carMedia.stop();

//     what things to access = which version to access
        Engine e = new Car();
//        access only engine stuff
//        e.accelerate();
//        e.stop();
//        e.start();
        NiceCar car1 = new NiceCar();
        car1.upgradeEngine();
        car1.start();
        car1.startMusic();

    }
}
// Interface happens at runtime