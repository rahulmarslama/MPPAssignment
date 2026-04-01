package Lab2.prob2b;

public class Main
{
    static void main() {
        Order newOrder = new Order("Personal Order", 4000);
        newOrder.addOrderLine(30);
        newOrder.addOrderLine(20);

        System.out.println(newOrder.orderLineList.stream().count());
    }
}
