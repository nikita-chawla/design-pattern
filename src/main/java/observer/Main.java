package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        YouTubeChannel youTubeChannel = new YouTubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber nikita = new Subscriber("Nikita");
        youTubeChannel.subscribe(aman);
        youTubeChannel.subscribe(nikita);
        youTubeChannel.createVideo("java design patterns");
        youTubeChannel.createVideo("dance video");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("press 1 to upload video");
            System.out.println("press 2 to add subscriber");
            System.out.println("press 3 to unsubscribe ");
            System.out.println("press 4 to unsubscribe ");
            int c = Integer.parseInt(br.readLine());
            if(c==1){
                System.out.println("Enter video Title");
                String videoTitle= br.readLine();
                youTubeChannel.createVideo(videoTitle);
            } else if (c==2) {
                System.out.println("Enter name of subscriber");
                String subscriberName = br.readLine();
                Subscriber ssb = new Subscriber(subscriberName);
                youTubeChannel.subscribe(ssb);
            } else if (c==3) {
                System.out.println("Enter name of Subscriber");
                String subscribername = br.readLine();
                Subscriber subscriber= new Subscriber(subscribername);
                youTubeChannel.unsubscriber(subscriber);
            } else if (c== 4) {
                System.out.println("thank you for using app");
                break;
            }
            else{
                System.out.println("Wrong input");
            }
        }


    }
}
