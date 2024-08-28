package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        NetworkConnection connection = new NetworkConnection();
        connection.loadImportantData();
        connection.setIp("194.89.9.9");
        System.out.println(connection);

        NetworkConnection c2 = (NetworkConnection) connection.clone();
        System.out.println(c2);


        NetworkConnectionDeepCopy c1 = new NetworkConnectionDeepCopy();
        c1.loadImportantData();
        c1.setIp("143.76.8.8");
        System.out.println(c1);

        NetworkConnectionDeepCopy ncc = (NetworkConnectionDeepCopy) c1.clone();
        c1.getDomains().remove(0);
        System.out.println(c1);
        System.out.println(ncc);


    }
}
