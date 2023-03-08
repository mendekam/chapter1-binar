package com.tutorial;

public class Palindrome implements PalindromeOutput{
     public boolean isPalindrome(String s, int a, int b){
        if(b == a || b < a){
            return true;
        }
        else{
            if(s.charAt(a) != s.charAt(b)) return false;
            else return isPalindrome(s, a + 1, b - 1);
        }
    }
    public String perbandingan(String data){
        return "Kelas Palindrome";
    }
    void keluaran(){
        System.out.println("Keluaran Palindrome");
    }

    @Override
    public String notPalindrome(String data) {
        return data + " bukan Palindrome";
    }

    @Override
    public String palindrome(String data) {
        return data + " adalah Palindrome";
    }
}
