package singelton;

public class EarlyInitializarion {
    private static EarlyInitializarion earlyInitializarion = new EarlyInitializarion();
    public static EarlyInitializarion getEarlyInitializarion(){
        return earlyInitializarion;
    }
}
