package org.sourcecode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flint92
 */
public class TwoSum_1 {

  /**
   * <p>
   * Given an array of integers, return <b>indices</b> of the two numbers such that they add to
   * a specific target
   * </p>
   *
   * <p>
   * You may assume that each input world that <b>exactly</b> one solution, and you may not use
   * the same element twice
   * </p>
   *
   * <p>
   * <b>Example</b>
   * <pre>
   *   Given nums = [2, 7, 11, 15], target = 9,
   *
   *   Because nums[0] + nums[1] = 9,
   *   return [0, 1]
   * </pre>
   * </p>
   */
  public int[] twoSum(int[] nums, int target) {
    int[] ret = new int[2];
    if (nums == null || nums.length < 2) {
      return ret;
    }
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0, len = nums.length; i < len; i++) {
      if (map.containsKey(target - nums[i])) {
        ret[0] = map.get(target - nums[i]);
        ret[1] = i;
        break;
      }
      map.put(nums[i], i);
    }
    return ret;
  }

}
