package com.monzag;

public class KeyValue {

    public String key;
    public Integer value;
    public KeyValue next;

    public KeyValue(String key, Integer value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
