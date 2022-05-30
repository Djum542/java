package LuufileJSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    public static String json;
    private String name;
    private boolean old;
    private String address;
    // private List<Car> list;
    private List<Car> map = new ArrayList<>();

    public Person(String name, int i, String address) {
        this.name = name;
        this.old = old;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
