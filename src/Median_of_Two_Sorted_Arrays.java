import java.util.HashMap;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        if(len%2==0){
            double d1 = findMedianSortedArrays(nums1,0,nums1.length,nums2,0,nums2.length,len/2);
            double d2 = findMedianSortedArrays(nums1,0,nums1.length,nums2,0,nums2.length,len/2+1);
            return (d1+d2)/2;

        }else{
            return findMedianSortedArrays(nums1,0,nums1.length,nums2,0,nums2.length,len/2+1);
        }
    }
   public static  double findMedianSortedArrays(int[] nums1,int start1,int len1,int[] nums2,int start2,int len2,int k){
        if(len1>len2){
            return findMedianSortedArrays(nums2,start2,len2,nums1,start1,len1,k);
        }
        if(len1==0){
            return nums2[start2+k-1];
        }
        if(k==1){
            return Math.min(nums1[start1],nums2[start2]);
        }
       int p1 = Math.min(k / 2, len1);
       int p2 = k - p1;
       if(nums1[start1+p1-1]>nums2[start2+p2-1]){
            return findMedianSortedArrays(nums1,start1,len1,nums2,start2+p2,len2-p2,k-p2);
       }
       else if(nums1[start1+p1-1]<nums2[start2+p2-1]){
           return findMedianSortedArrays(nums1,start1+p1,len1-p1,nums2,start2,len2,k-p1);
       }else{
           return nums1[start1+p1-1];
       }

   }
}
