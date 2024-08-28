package factory;

public class EmployeeFactory {
    public static Employee getEmployee(String emptype){
        if(emptype.trim().equalsIgnoreCase("ANDROID")){
            return new AndroidDeveloper();
        } else if (emptype.trim().equalsIgnoreCase("WEBDEVELOPER")) {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
