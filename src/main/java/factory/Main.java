package factory;

public class Main {
    public static void main(String[] args) {

       Employee androidEmployee =  EmployeeFactory.getEmployee("ANDROID");
        System.out.println(androidEmployee);
        int salary = androidEmployee.salary();
        System.out.println("salary: "+salary);
        Employee webdeveloper =  EmployeeFactory.getEmployee("WEBDEVELOPER");
        int websalary = webdeveloper.salary();
        System.out.println("salary: "+ websalary);
    }
}
