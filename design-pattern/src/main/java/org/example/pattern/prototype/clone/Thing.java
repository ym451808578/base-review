package org.example.pattern.prototype.clone;

import lombok.Data;
import org.example.pattern.prototype.Mail;
import sun.management.counter.perf.PerfInstrumentation;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Castle
 * @Date 2021/5/18 9:52
 */
@Data
public class Thing implements Cloneable {
    private String name;
    private ArrayList<String> stringList;

    @Override
    public Thing clone() {
        Thing cloneThing = null;
        try {
            cloneThing = (Thing) super.clone();
            cloneThing.stringList = (ArrayList<String>) this.stringList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneThing;
    }
}

@Data
class SerialClone implements Cloneable, Serializable {
    private String name;
    private ArrayList<String> strings;

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
                objectOutputStream.writeObject(this);
            }
            try (InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray())) {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                return objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        SerialClone serialClone=new SerialClone();
        ArrayList<String> arrayList=new ArrayList<>(2);
        arrayList.add("java");
        serialClone.setName("Clone");
        serialClone.setStrings(arrayList);

        System.out.println(serialClone.getStrings());
        SerialClone clone= (SerialClone) serialClone.clone();
        clone.getStrings().add("vue");
        System.out.println(clone.getStrings());
        System.out.println(serialClone.getStrings());
        System.out.println(serialClone==clone);
    }
}
