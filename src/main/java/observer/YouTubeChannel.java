package observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        subscriberList.add(ob);
    }

    @Override
    public void unsubscriber(Observer ob) {
        subscriberList.remove(ob);
    }

    @Override
    public void createVideo(String title) {
        for(Observer ob: subscriberList){
            ob.notified(title);
        }
    }
}
