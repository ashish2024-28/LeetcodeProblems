import java.util.HashMap;

public class Two_Sum_1 {
    
    // public static int[] twoSum(int[] nums, int target) {
    public static void twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<len; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                // return new int[]{map.get(needed),i};
                // return new int[]{i,map.get(needed)};
                System.out.println(i+ " ," +map.get(needed));
            }
            map.put(nums[i],i);
        }
                // return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,3,5,6,7,8,9};
        twoSum(arr, 17);
    }
}
