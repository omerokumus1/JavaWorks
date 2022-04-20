package Optionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Person person1 = new Person("person-1", "email-1");
        Person person2 = new Person("person-2", null);

        Optional<String> email1 = Optional.ofNullable(person1.email);
        Optional<String> email2 = Optional.ofNullable(person2.email);


        email1.ifPresent(System.out::println);

        if (email1.isPresent())
            System.out.println(email1.get());

        email1.ifPresentOrElse(word -> System.out.println(word.toUpperCase()),
                () -> System.out.println("email1 is empty"));
    }
}

class Person{
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}