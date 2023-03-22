class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sp=0,ep=0;
        int flag=0;
        for(int i =0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                     if((nums[i]+nums[j]) == target)
                     {
                         sp=i;
                         ep=j;
                         flag = 1;
                         break;
                     }
                }
            if (flag==1)
                break;
            }
         int out[] = new int[2];
                    out[0]=sp;
                    out[1]=ep;
                    return out;
    }
}
