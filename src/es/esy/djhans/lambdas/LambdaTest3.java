package es.esy.djhans.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kolokolov on 3/20/16.
 */
public class LambdaTest3 {

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "{" + name + ", " + age + "}";
        }
    }
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Alex", 31));
        persons.add(new Person("Mike", 35));
        persons.add(new Person("Harry", 17));
        persons.add(new Person("Marry", 21));
        persons.add(new Person("Sam", 15));
        persons.add(new Person("Bob", 40));


//        for (Person p : persons) {
//            System.out.println(p);
//        }

        persons.stream().filter(p -> p.age >= 18).
                sorted((p1, p2) -> Integer.valueOf(p1.getAge()).compareTo(p2.getAge())).
                forEach(System.out::println);
    }
}
