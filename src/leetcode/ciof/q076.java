package leetcode.ciof;

import java.util.Arrays;
import java.util.List;

/**
 * 数组中的第 k 大的数字
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 *
 *
 *
 */
public class q076 {
    public int findKthLargest(int[] nums, int k) {
        List<int[]> ints = Arrays.asList(nums);
        Arrays.sort(nums);
        return  nums[nums.length-k];
    }
}
