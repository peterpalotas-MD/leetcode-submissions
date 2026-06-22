class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length+nums2.length;
        int[] merged = new int[totalLength];

        int l1Index = 0;
        int l2Index = 0;
        int i =0;
        while(l1Index<nums1.length && l2Index < nums2.length){
            
            if(nums1[l1Index] < nums2[l2Index]){
                merged[i] = nums1[l1Index];
                l1Index++;
            }else{
                merged[i] = nums2[l2Index];
                l2Index++;
            }
            i++;
        }
        if(l1Index!=nums1.length){
            for( ; l1Index<nums1.length;l1Index++){
                merged[i]=nums1[l1Index];
                i++;
            }
        }
        else{
            for( ; l2Index<nums2.length;l2Index++){
                merged[i]=nums2[l2Index];
                i++;
            }
        }
        
        if(totalLength%2!=0){
            return merged[totalLength/2];
        }else{
            
            int med = totalLength/2;
            return (merged[med]+merged[(med-1)])/2.0;
        }
    }
}



