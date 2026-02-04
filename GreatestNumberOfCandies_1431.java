import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies_1431 {
    
     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        // String []result = new String[n];
        List<Boolean> result = new ArrayList<>();
        int gratest = candies[0];
        for(int i=1; i<n; i++){
            if(gratest < candies[i]){
                gratest = candies[i];
            }
        }
        for(int i=0; i<n; i++){
            if(candies[i] + extraCandies >= gratest ){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
        



    }

    public static void main(String[] args) {
        int arr[] = {2,3,3,4,4,5,5,6,6,7,7,0};
        int extraCandies = 6;
        System.out.println(kidsWithCandies(arr, extraCandies));

    }

}

