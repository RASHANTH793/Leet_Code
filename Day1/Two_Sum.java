import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //[2,7,11,15] => nums[0] = 2,nums[1]=7, nums[0]+nums[1]=9(Target);
        // HashMap is used for getting key value pairs.
        Map<Integer,Integer> hashMap = new HashMap<>();
        //Traversing through the array.
        for(int i=0;i<=nums.length;i++){
            //Declaring variable to store the value extracted from target value and i value.
            int complement = target - nums[i];
            //checking the value if the hashmap contains extractd value or not.
            if(hashMap.containsKey(complement)){
                // if true returing the new array which contians extracted value and index value.
                return new int[]{
                    hashMap.get(complement),i
                };
            }
            //if false assigning num[i] and i to the hashMap.
            hashMap.put(nums[i],i);
        }
        //return the new array which contains the target value with the index.
        return new int[]{};
        
    }
}