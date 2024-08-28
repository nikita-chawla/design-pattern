package singelton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        EarlyInitializarion earlyInitializarion = EarlyInitializarion.getEarlyInitializarion();
        System.out.println(earlyInitializarion.hashCode());
        EarlyInitializarion earlyInitializarion2 = EarlyInitializarion.getEarlyInitializarion();
        System.out.println(earlyInitializarion2.hashCode());

        //Break Singelton design pattern
        // 1. Reflection API
        // solution : If object is there then in constructor throw exception
        /*             use enum
            2. DeSerialization
            solution : implement readResolve method and return this object

            3. Cloning
            solution : in overriding clone method return this object
         */

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());


        // Reflection API
//        Constructor constructor =Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = (Samosa) constructor.newInstance();
//        System.out.println(s2.hashCode());

// Deserialization
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xyz.ob"));
        oos.writeObject(samosa1);

        System.out.println("serialization done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xyz.ob"));
        Samosa deserializedSamosa = (Samosa) ois.readObject();
        System.out.println("deserialization done");
        System.out.println(deserializedSamosa.hashCode());

        // cloning

        Samosa ss1 = Samosa.getSamosa();
        System.out.println(ss1.hashCode());
        Samosa ss2 = (Samosa) ss1.clone();
        System.out.println(ss2.hashCode());


    }
}
