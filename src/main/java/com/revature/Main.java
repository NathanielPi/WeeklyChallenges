package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        List<Integer> tests = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            tests.add(N);
        }
        for(int i : tests) {
            walkOnAxis(i);
        }
    }

    public static void walkOnAxis(int num){
        System.out.println((num * (num + 1) / 2 + num));
    }
}
