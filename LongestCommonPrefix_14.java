import java.util.Arrays;

public class LongestCommonPrefix_14 {

    // best Approach
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length;

        for(int i=0; i<strs[0].length(); i++){
            char first = strs[0].charAt(i);
            char second = strs[len-1].charAt(i);
                boolean check = first != second; 
                if(check){
                    return strs[0].substring(0,i);
                }
            }
        return strs[0];
    }

    // Brut Approach
    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                boolean check = ch != strs[j].charAt(i); 
                if(check){
                    return strs[0].substring(0,i);
                }
            }
        }
            return strs[0];
    }

    public static void main(String[] args) {
        
        String[] strs = new String[]{"flower","flow","flight"};
        
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);

        String ans2 = longestCommonPrefix2(strs);
        System.out.println(ans2);
    }
}
