package Iterator;

public class Main {
    public static void main(String[] args) {
        UserManagement um = new UserManagement();
        um.addUser(new User("nIKITA","23"));
        um.addUser(new User("gautam","22"));
        um.addUser(new User("karan","24"));
        um.addUser(new User("ka","26"));

        MyIterator myIterator= um.getIterator();
        while(myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
