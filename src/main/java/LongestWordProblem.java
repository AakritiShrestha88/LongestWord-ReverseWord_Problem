/* Longest Word
        Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
        If there are two or more words that are the same length, return the first word from the string with that length.
        Ignore punctuation and assume sen will not be empty.


        Examples
        Input: "fun&!! time"
        Output: time
        Input: "I love dogs"
        Output: love

*/


import java.util.Scanner;

public class LongestWordProblem {
    public static String LongestWord(String str){
        String longestWord="";
        String comparingWord ="";
        String[] words = str.replaceAll("[^a-zA-Z0-9\\s]"," ").split("\\s");
        for(String word : words){
            if(word.length() > comparingWord.length()){
                comparingWord = word;
                longestWord = word;
            }else{
                longestWord = comparingWord;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(LongestWord(scan.nextLine()));
    }
}
