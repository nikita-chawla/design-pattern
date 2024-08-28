package Prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadImportantData() throws InterruptedException {
        this.data="Very very importantdata";
        // this takes say 5 mins to load
        Thread.sleep(Long.parseLong("5000"));
    }
}
