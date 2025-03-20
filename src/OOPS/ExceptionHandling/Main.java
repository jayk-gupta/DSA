package OOPS.ExceptionHandling;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        runtime exception: divide by zero
        try {
            divide(a,b);
//            int c = a / b;
            String name = "kunal";
            if(name.equals("kunal")){
                throw new MyException("name is kunal");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("do not divide by zero");
        }
        return a / b;
    }
}
