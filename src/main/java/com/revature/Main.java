package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Gather input
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        List<String> man = new ArrayList<>();
        List<String> woman = new ArrayList<>();

        //Assign a name to the man or woman list
        for (int i = 0; i < T*2; i++) {
            String names = scanner.next();
            if (i %2 != 0) {
                woman.add(names);
            } else {
                man.add(names);
            }
        }
        for (int i = 0; i < man.size(); i++) {
            canMarry(man.get(i), woman.get(i));
        }
    }

        static void canMarry(String m, String w) {
            char[] arrM = m.toCharArray();
            char[] arrW = w.toCharArray();

            //Will fail if arrM is too short with an array out of bounds exception...need to investigate
            for (int i = 0; i < arrM.length; i++){
                for (int j = 0; j < arrW.length; j++) {
                    if (arrM[j] == arrW[j]) {
                        break;
                    }
                    if (j == arrW.length -1) {
                        System.out.println("No");
                        return;
                    }
                }
            }
            System.out.println("Yes");
        }
}
