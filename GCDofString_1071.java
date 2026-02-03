public class GCDofString_1071 {
    

    public static String gcdOfStrings(String str1, String str2) {
        
        int len1 = str1.length();
        int len2 = str2.length();

        String sum1_2 = str1 + str2 ;
        String sum2_1 = str2 + str1 ;
        if(!sum1_2.equals(sum2_1)){
            return "";
        }
        else{
            if(len2 > len1 ){
                int temp = len2;
                len2 = len1;
                len1 = temp;
            }
            int lenOfStr = gcd(len1,len2);
            return str2.substring(0,lenOfStr);
        }
    }

    public static int gcd(int a, int b){
        int ans = 0;
        int r = 1 ;
        while(r != 0){
            r = a % b ;
            a = b;
            if(r == 0){
                ans = b;
                System.out.println(ans);
            }
            b = r;
        }
        return ans;
    }
    public static void main(String[] args) {
    
        String str1 = "ABCDABCD";
        String str2 = "ABCDABCDABCD";
        
        System.out.println(gcdOfStrings(str1, str2));
    }


}
