package com.monzag;

import java.util.LinkedList;

public class HashMap {

    private int size = 16;
    private LinkedList<KeyValue>[] elements = new LinkedList[size];

    public void put(String key, Integer value) {
        int position = getHash(key);
        LinkedList<KeyValue> list = elements[position];

        for (KeyValue pair : list) {
            if (pair.key == key) {
                throw new IllegalArgumentException();
            }
        }

        list.add(new KeyValue(key,value));
//        resizeIfNeeded();
    }

    public Integer getHash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public Integer getValue(String key) {
        int position = getHash(key);
        LinkedList<KeyValue> list = elements[position];
        for (KeyValue pair : list) {
            if (pair.key == key) {
                return pair.value;
            }
        }

        throw new NullPointerException();
    }

    public void remove(String key) {
        int position = getHash(key);
        LinkedList<KeyValue> list = elements[position];
        for (KeyValue pair : list) {
            if (pair.key == key) {
                list.remove(pair);
            }
        }
    }

    public void clearAll() {
        for (LinkedList<KeyValue> box : elements) {
            for (KeyValue pair : box) {
                remove(pair.key);
            }
        }
    }

}
