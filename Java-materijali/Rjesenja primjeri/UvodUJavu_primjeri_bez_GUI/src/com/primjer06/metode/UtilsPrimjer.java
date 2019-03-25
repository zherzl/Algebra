package com.primjer06.metode;

public class UtilsPrimjer {

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("Ana voli Milovana");

        if (isPalindrome) {
            System.out.println("Izraz je palindrom");
        } else {
            System.out.println("Izraz nije palindrom");
        }
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "");

        int index = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(index--)) {
                return false;
            }
        }
        return true;
    }

}
