//@author minyue
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class q0001twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    return output;
                }
            }
        }
        return output;
        //throw new IllegalArgumentException("No two sum solution");
    }
}
