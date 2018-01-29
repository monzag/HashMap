package com.monzag;

public class App 
{
    public static void main( String[] args )
    {
        HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Map: " + map.toString());

        map.remove("two");
        System.out.println("Map: " + map.toString());

        System.out.println("Value: " + map.getValue("one"));

        map.clearAll();
        System.out.println("Map: " + map.toString());
    }
}
