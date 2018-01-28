package com.monzag;

import java.util.LinkedList;

public class HashMap {

    private int size = 16;
    private LinkedList<KeyValue>[] elements = new LinkedList[size];

    public void add(String key, Integer value) {
        int position = getHash(key);
        LinkedList<KeyValue> list = elements[position];

        for (KeyValue pair : list) {
            if (pair.key == key) {
                throw new IllegalArgumentException();
            }
        }

        list.add(new KeyValue(key,value));
        resizeIfNeeded();
    }

}
