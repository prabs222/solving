class Solution {
    public int[] searchRange(int[] nums, int target) {
        int sp=-1,ep=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
             if(sp==-1)
             {
                 sp = i;
                 ep = i;
             }
            else
                ep=i;
                
            }
        }
        int arr[] = new int[2];
        arr[0]=sp;
        arr[1]=ep;
    return arr;
    }
    
}
