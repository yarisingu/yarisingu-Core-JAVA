package datastructure.basicprograms;

import java.util.Scanner;

public class ReverseString {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        String reverse = reverseString(pass);
        
        String reverse1 = reverseString1(pass);
        System.out.println(reverse1);
        System.out.println("normal String "+pass + "  Reverse String "+ reverse);
        sc.close();
    }


    private static String reverseString1(String inputString) {
       char[] charArray = inputString.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }


    // type 1
    private static String reverseString(String pass) {

        char ch [] = pass.toCharArray();
        char reveerse[] =  new char[pass.length()];
        int count =0;
        int length =pass.length()-1;
        int run = pass.length();
        while(count<run)
        {
            char temp = ch[length];
            reveerse[count]=temp;
            count++;
            length--;
           
        }

        return new String (reveerse);
        // this is long process
    }


    // type2


    
}
