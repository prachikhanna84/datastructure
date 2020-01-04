package com.prachi;

public class ArrayClass {

    String name[] = new String[10];

    public void insert(){
        name[0]="prachi";
        name[1]="jeet";
        name[2]="arth";
    }

    public void display(){
        for (String n:name
             ) {
            System.out.println(n);
        }
    }
}
