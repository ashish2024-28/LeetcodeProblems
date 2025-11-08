package Leetcode.LeetcodeProblems;

public class MergeStringAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder("");
        // int Max = word1.length()<word2.length()?word2.length():word1.length();
        int Min = word1.length()>word2.length()?word2.length():word1.length();
        for(int i=0 ; i<Min; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            result.append(word1.substring(Min));
        }
        if(word2.length()>word1.length()){
            result.append(word2.substring(Min));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "Hello";
        System.out.println(mergeAlternately(word1,word2));
    }

}
