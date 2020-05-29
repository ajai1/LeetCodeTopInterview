
public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int j = n-1 ; j>=0; j--) {
			for(int i = 0; i<m; i++) {
				if(nums2[j] < nums1[i]) {
					int t = nums2[j];
					nums2[j] = nums1[i];
					nums1[i] = t;
				}
			}
		}
		for(int i = 0; i< n; i++) {
			nums1[m+i] = nums2[i]; 
		}
		for(int i : nums1) {
			System.out.print(i + " - ");
		}
    }
	
	public static void main(String[] args) {
		int[] nums1 = {0,0,0};
		int m = 0;				
		int[] nums2 = {1,2,6};
		int n = 3;
		
		merge(nums1, m, nums2, n);

	}

}
