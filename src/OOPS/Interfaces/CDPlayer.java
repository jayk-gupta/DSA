package OOPS.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start media player");
    }

    @Override
    public void stop() {
        System.out.println("Stop media player");
    }
}
