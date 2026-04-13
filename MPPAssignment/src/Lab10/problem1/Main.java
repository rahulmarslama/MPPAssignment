package Lab10.problem1;

import java.util.function.Supplier;

public class Main
{
    static Supplier<Double> supplier = Math::random;
    static Supplier<Double> supplierAsLambda = ()->Math.random();

    static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(supplierAsLambda.get());
    }
}
