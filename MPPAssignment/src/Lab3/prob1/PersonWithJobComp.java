package Lab3.prob1;

import java.util.Objects;

public class PersonWithJobComp
{
    private double salary;
    private Person person;


    public PersonWithJobComp(String name,double salary) {
        this.salary = salary;
        this.person = new Person(name);
    }

    public String getName()
    {
        return person.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PersonWithJobComp that)) return false;
        return Objects.equals(getName(), that.person.getName());
    }


    public static void main(String[] args) {
        PersonWithJobComp p1 = new PersonWithJobComp("Joe", 30000);
        PersonWithJobComp p2 = new PersonWithJobComp("Joe", 30000);

        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }
}
