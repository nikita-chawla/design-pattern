package AbstractFactory;

public class WebDeveloper implements  Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I AM Web Developer");
        return "WEB DEVELOPER";
    }
}
