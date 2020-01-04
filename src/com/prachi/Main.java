package com.prachi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayClass arrayClass = new ArrayClass();

        arrayClass.insert();

        arrayClass.display();


        ListClass myList = new ListClass(3);

        myList.addElements("Test123");
        myList.addElements("Test234");
        myList.addElements("Test345");
        myList.addElements("Test456");
        myList.addElements("Test567");
        myList.addElements("Test678");
        myList.addElements("Test778");


        myList.display();
        myList.remove("Test567");
        System.out.println("after Deletion");

        myList.display();

        myList.insertAt(4,"888");
        System.out.println("after insertion");
        myList.display();

        LinkedListClass mll = new LinkedListClass("Prachi");

        mll.addElement("Jeet");
        mll.display();


    }
}
