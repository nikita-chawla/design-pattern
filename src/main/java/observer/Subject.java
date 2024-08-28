package observer;


interface Subject {
    void subscribe(Observer ob);
    void unsubscriber(Observer ob);
    void createVideo(String title);
}
