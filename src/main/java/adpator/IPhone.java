package adpator;

public class IPhone {
    private AppleCharger appleCharger;

    public IPhone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
