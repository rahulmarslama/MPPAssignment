package Lab10.problem1;

import java.util.function.Supplier;

public class Main2
{
    static void main(String[] args)
    {
        InnerClass ic = new InnerClass();
        System.out.println(ic.get());

    }

    static class InnerClass implements Supplier<Double>
    {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
