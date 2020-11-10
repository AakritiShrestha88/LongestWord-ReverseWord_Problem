/*

First Reverse
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
For example: if the input string is "Hello World and Coders" then your program should return
the string sredoC dna dlroW olleH.

Examples
Input: "coderbyte"
Output: etybredoc

Input: "I Love Code"
Output: edoC evoL I
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseLetter {
    private static String FirstReverse(String str) {
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp +=str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(FirstReverse(scan.nextLine()));
    }


}
