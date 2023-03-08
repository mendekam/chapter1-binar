package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int pilih;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Program Palindrome");
            System.out.println("Menu : ");
            System.out.println("1. Kalimat\n2. Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Cek Kalimat Palindrome");
                    palindrome.keluaran();
                    break;
                case 2:
                    System.out.println("Cek Angka Palindrome");
                    palindrome.keluaran();
                    break;
                case 3:
                    System.out.println("Terimakasih!!!");
                    break;
                default:
                    System.out.println("Coba Masukkan Kembali Pilihan Anda!!!");
            }
            System.out.println("----------------------------------------------");
        }while(pilih != 3);
    }
}
