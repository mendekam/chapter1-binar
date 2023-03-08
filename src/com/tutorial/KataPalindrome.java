package com.tutorial;

import java.util.Scanner;

public class KataPalindrome extends Palindrome {

    @Override
    public void keluaran() {
        Scanner scanner = new Scanner(System.in);
        String data;

        System.out.println("PROGRAM CEK PALINDROME");
        System.out.print("Masukkan Data : "); data = scanner.nextLine();
        System.out.println(perbandingan(data));
    }

    @Override
    public String perbandingan(String data) {
        int strLength = data.length();

        if(data.isBlank()) return "Data input kosong";

        if (isPalindrome(data.toLowerCase().trim(), 0, strLength - 1)) {
            return palindrome(data);
        }
        else {
            return notPalindrome(data);
        }
    }
}
