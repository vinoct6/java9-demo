package a;

import com.sample.person.Person;

import java.util.logging.Logger;

public class HelloWorld {

    public  static final Logger logger = Logger.getLogger(HelloWorld.class.getName());




    public static void main(String[] args) {
        Person p = new Person("Vinoth");

        System.out.println("Hello World!");
    }
}
