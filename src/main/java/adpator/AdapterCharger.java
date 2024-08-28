package adpator;

public class AdapterCharger implements AppleCharger{
    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        System.out.println(
                "your phone is charging via adaptor"
        );
        androidCharger.chargePhone();
    }
}
