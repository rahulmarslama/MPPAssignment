package Lab11.part1.prob3;

import java.util.stream.Stream;

public class Main
{
    public static Stream<Integer> getPrimes()
    {
        return Stream.iterate(2,n->
        {
            int candidate = n + 1;
            while (!isPrime(candidate)) {
                candidate++;
            }
            return candidate;
        });
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void printFirstNPrimes(long n)
    {
        getPrimes().limit(n).forEach(System.out::println);
    }
    static void main(String[] args)
    {
        Main obj = new Main();
        obj.printFirstNPrimes(10);
        System.out.println("====");
        obj.printFirstNPrimes(5);
        System.out.println("====");
        obj.printFirstNPrimes(30);
    }
}
