package OOPS.Interfaces;

public class Car implements Engine, Brake,Media{
   String color = "red";

    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("stop engine like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate like a normal car");
    }
}
