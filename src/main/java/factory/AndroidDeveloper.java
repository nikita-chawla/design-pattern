package factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("android developer salary");;
        return 50000;
    }
}
