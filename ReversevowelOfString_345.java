public class ReversevowelOfString_345 {
    public static String reverseVowels(String s) {

        int sLen = s.length();
        int i=0 , j=sLen-1;
        char[] sChar = s.toCharArray();

        while( i < j){
            char Ch1 = sChar[i];
            if(isVowel(Ch1)){
                char Ch2 = sChar[j];
                if(isVowel(Ch2)){
                    char temp = sChar[i];
                    sChar[i] = sChar[j];
                    sChar[j] = temp;
                    i++; j--;
                   
                }else{
                    
                    j--;
                }
            }else{
                i++;
            }
            
        }
        return String.valueOf(sChar);

    }

    public static boolean isVowel(char ch){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                return true;
            }
            return false;
    }

    public static void main(String[] args) {
        String s = "aeiou djkfhdkla aeiou ";
        
        System.out.println(reverseVowels(s));
    }

        
}
