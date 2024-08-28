package factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("getting webdeveloper salary");
        return 40000;
    }
}
