package com.test.jpashop;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@SpringBootApplication
public class JpashopApplication {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "하나");
        map.put(2, "둘");
        map.put(3, "셋");

        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            String value = map.get(key);
            System.out.println(value);
        }


    }
}


