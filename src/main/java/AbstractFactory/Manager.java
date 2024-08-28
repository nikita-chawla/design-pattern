package AbstractFactory;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        System.out.println("I Am Manager");
        return "MANAGER";
    }
}
