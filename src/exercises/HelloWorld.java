package exercises;

public class HelloWorld {

    String message = "Hello World";

    public void sayHello() {

        String message = "Goodbye World";

        // prints "Goodbye World"
        System.out.println(message);

        // prints "Hello World"
        System.out.println(this.message);
    }
}