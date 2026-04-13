package Lab10.problem5;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main
{

    //A. (Employee e) -> e.getName()
    Function<Employee,String> a= e -> e.getName();
    Function<Employee,String> a2= Employee::getName;
    //Method reference type: Class::instanceMethod

    //B. (Employee e,String s) -> e.setName(s)
    BiConsumer<Employee,String> b =( e,  s) -> e.setName(s);
    BiConsumer<Employee,String> b2 = Employee::setName;

    //C. (String s1,String s2) -> s1.compareTo(s2)
    BiFunction<String,String,Integer> c=( s1, s2) -> s1.compareTo(s2);
    BiFunction<String,String,Integer> c2= String::compareTo;

    //D. (Integer x,Integer y) -> Math.pow(x,y)
    BiFunction<Integer,Integer,Double> d = (x,y) -> Math.pow(x,y);
    BiFunction<Integer,Integer,Double> d2 = Math::pow;

    //E. (Apple a) -> a.getWeight()
    //Function<Apple,Integer> e = a.getWeight();
    //Function<Apple,Integer> e2 = Apple::getWeight;

    //F. (String x) -> Integer.parseInt(x);
    Function<String,Integer> f = x -> Integer.parseInt(x);
    Function<String,Integer> f2 = Integer::parseInt;

    //G. EmployeeNameComparator comp = new EmployeeNameComparator();
        //(Employee e1, Employee e2) -> comp.compare(e1,e2)

    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee,Employee,Integer> g = ( e1,  e2) -> comp.compare(e1,e2);
    BiFunction<Employee,Employee,Integer> g2 = comp::compare;



    void evaluator() {
        Employee e = new Employee("Rahul Lama",1000);
        Employee e2 = new Employee("Rahul Mars Lama",1000);

        System.out.println(a.apply(e));
        b.accept(e,"Rahul Mars Lama");
        System.out.println(c.apply("Rahul","Mars"));
        System.out.println(d.apply(2,4));
        System.out.println(f.apply("12345"));
        System.out.println(g.apply(e,e2));
    }

    static void main(String[] args) {
        Main obj = new Main();
        obj.evaluator();
    }
}
