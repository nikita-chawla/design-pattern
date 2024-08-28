package Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnectionDeepCopy implements Cloneable{

    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnectionDeepCopy networkConnectionDeepCopy = new NetworkConnectionDeepCopy();
        networkConnectionDeepCopy.setIp(this.getIp());
        networkConnectionDeepCopy.setData(this.getData());
        for(String d: this.getDomains()){
            networkConnectionDeepCopy.getDomains().add(d);
        }
        return networkConnectionDeepCopy;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "NetworkConnectionDeepCopy{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadImportantData() throws InterruptedException {
        this.data="Very very importantdata";
        domains.add("google.com");
        domains.add("yahoo.com");
        domains.add("xyz.com");
        // this takes say 5 mins to load
        Thread.sleep(Long.parseLong("1000"));
    }
}
