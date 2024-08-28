package adpator;

public class Main {
    public static void main(String[] args) {
        AppleCharger appleCharger = new AdapterCharger(new DXCharger());
        IPhone iPhone = new IPhone(appleCharger);
        iPhone.chargeIphone();
    }
}
