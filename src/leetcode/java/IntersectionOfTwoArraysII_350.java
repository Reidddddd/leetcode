package leetcode.java;

import java.util.Arrays;

public class IntersectionOfTwoArraysII_350 {
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0, j = 0, k = 0;
    int[] intersection = new int [nums1.length > nums2.length ? nums1.length : nums2.length]; 
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) i++;
      else if (nums2[j] < nums1[i]) j++;
      else if (nums1[i] == nums2[j]) {
        intersection[k++] = nums1[i];
        i++;
        j++;
      }
    }
    return Arrays.copyOf(intersection, k);
  }
}
