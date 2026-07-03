class Solution {
    public static int[] productExceptSelf(int[] nums) 
    {
		int[] output = new int[nums.length];
		Arrays.fill(output, 1);
		
		int i=1,j=nums.length - 2;
		int ii=1,jj=1;
		
		while(i<nums.length) 
		{
			System.out.println(i+" "+j);
			ii *= nums[i-1];
			jj *= nums[j+1]; 
			System.out.println(ii+" "+ jj+" "+nums[i]+" "+nums[j]);
				output[i] *= ii;				
				output[j] *= jj;				
			System.out.println(Arrays.toString(output));
			i++;j--;
		}
        
        
        
        return output;
    }
}  
