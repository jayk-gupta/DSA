package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Consumer<Integer> fn = (item -> System.out.println(item*2));
        list.forEach(fn);
//        list.forEach(item -> System.out.println(item*2));
        Operation sum = (a,b) -> a+b;
        Operation product = (a,b)-> a*b;

        LambdaFunction calculator = new LambdaFunction();
        System.out.println(calculator.operate(5,4,sum));
        System.out.println(calculator.operate(5,4,product));

    }
    private int operate (int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
//    abstract method
    int operation(int a , int b);
}
