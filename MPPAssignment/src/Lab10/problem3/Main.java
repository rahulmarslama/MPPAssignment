package Lab10.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main
{
    static void main() {
        BiFunction<Double,Double, List<Double>> biFunction =(x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

        System.out.println(biFunction.apply(2.0,3.0));

    }
}
