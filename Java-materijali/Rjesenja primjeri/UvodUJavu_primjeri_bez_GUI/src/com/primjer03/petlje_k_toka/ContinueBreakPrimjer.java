package com.primjer03.petlje_k_toka;

public class ContinueBreakPrimjer {

    public static void main(String[] args) {
        boolean jeProst;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            jeProst = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    jeProst = false;
                    break;
                }
            }
            if (jeProst) // je li prost?
            {
                System.out.println(i); // Da, ispiši ga
            }
        }

    }
}
