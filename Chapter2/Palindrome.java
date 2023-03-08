import java.util.Scanner;

/**
 * Palindrome
 */
//inheritance
public class Palindrome implements SebuahMethod {

    @Override
    public void keluaran() {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String data = "";
        
        System.out.println("PROGRAM CEK PALINDROME");
        System.out.println("Masukkan Data : "); data = scanner.nextLine();
        System.out.println(perbandingan(data));
    }

    @Override
    public String perbandingan(String data) {
        // TODO Auto-generated method stub

        String reverseStr = "";
    
        int strLength = data.length();

        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + data.charAt(i);
        }

        if (data.toLowerCase().equals(reverseStr.toLowerCase())) {
          return data + " adalah Palindrome";
        }
        else {
          return data + " bukan Palindrome";
        }

    }

    


}
