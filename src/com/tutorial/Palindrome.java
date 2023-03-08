package com.tutorial;

import java.util.Scanner;

public class Palindrome implements InterfacePalindrome {

    private static boolean isPalindrome(String s, int a, int b){
        if(b == a || b < a){
            return true;
        }
        else{
            if(s.charAt(a) != s.charAt(b)) return false;
            else return isPalindrome(s, a + 1, b - 1);
        }
    }

    @Override
    public void keluaran() {
        Scanner scanner = new Scanner(System.in);
        String data;
        System.out.print("Masukkan Data : ");
        data = scanner.nextLine();
        System.out.println(perbandingan(data));
    }

    @Override
    public String perbandingan(String data) {
        int strLength = data.length();

        if(data.isBlank()) return "Data input kosong";

        if (isPalindrome(data.toLowerCase().trim(), 0, strLength - 1)) {
            return data + " adalah Palindrome";
        }
        else {
            return data + " bukan Palindrome";
        }
    }
}
