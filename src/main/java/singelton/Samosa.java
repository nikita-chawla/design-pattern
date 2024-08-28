package singelton;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {
    private static Samosa samosa;

    private Samosa() {
        if(samosa!=null){
            throw new RuntimeException("Trying to break singelton pattern");
        }
    }

    public static Samosa getSamosa(){
        if(samosa==null){
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}
