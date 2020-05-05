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
        ///throw new IllegalArgumentException("No two sum solution");
    }
}

//other solutions
/*   https://leetcode-cn.com/problems/two-sum/solution/jie-suan-fa-1-liang-shu-zhi-he-by-guanpengchn/
标签：哈希映射
这道题本身如果通过暴力遍历的话也是很容易解决的，时间复杂度在 O(n2)
由于哈希查找的时间复杂度为 O(1)，所以可以利用哈希容器 map 降低时间复杂度   ------hash 表查询是被设计成O(1)的 但是事实上要根据hash算法的碰撞几率定的，在最差的情况下也是个O(n)的。
遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
如果最终都没有结果则抛出异常
时间复杂度：O(n)

为什么数组的时间复杂度是O(1), 因为内存被设计成访问任一位置时间都是一样的, 而且非常块, 内存的大小对此并无影响.数组基于顺序的内存地址,
所以数组访问元素时间复杂度是O(1), 即数组的大小对此并无影响.哈希表的设计可以基于数组, 所以哈希表查询的平均时间复杂度为O(1).
链接：https://www.zhihu.com/question/34039763/answer/151938728
 */