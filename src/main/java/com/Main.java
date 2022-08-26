package com;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList listA = new LinkedList();
        listA.add(1);
        listA.add(4);
        listA.add(5);

        LinkedList listB = new LinkedList();
        listB.add(1);
        listB.add(3);
        listB.add(4);

        LinkedList listC = new LinkedList();
        listC.add(2);
        listC.add(6);

        LinkedList mainList = new LinkedList();

        for (int i = 0; i <= listA.size()+1; i++) {
            mainList.add(listA.remove());
        }
        for (int i = 0; i <= listB.size()+1; i++) {
            mainList.add(listB.remove());
        }
        for (int i = 0; i <= listC.size()+1; i++) {
            mainList.add(listC.remove());
        }
        Collections.sort(mainList);
        System.out.println("Sorted merged list: " + mainList);
    }

}
