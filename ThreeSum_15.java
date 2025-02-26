import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n - 2 && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            sol(i + 1, -nums[i], nums, res);
        }

        return res;
    }

    public void sol(int start, int target, int[] nums, List<List<Integer>> res){
        int end = nums.length-1;

        while(start < end){
            if(nums[start] + nums[end] > target){
                end--;
                continue;
            }

            if(nums[start] + nums[end] < target){
                start++;
                continue;
            }

            res.add(Arrays.asList(-target, nums[start], nums[end]));
            start++;
            end--;

            while(start <= end && nums[start] == nums[start-1])
                start++;
        }
    }
    
    public List<List<Integer>> threeSum2(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();


            int j,k;
            for(int i=0;i<n-2;i++)
            {
                j = i+1;
                k = n-1;

                if(i>0 && nums[i] == nums[i-1]) 
                    continue;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum > 0){
                        /* want an smaller element */
                        k--;
                    }
                    else if(sum < 0 )
                    {
                        j++;
                    }
                    else{
                        
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        j++;
                        k--;

                        while(j < k && nums[j] == nums[j-1])
                            j++;
                        while(j < k && nums[k] == nums[k+1])
                            k--;
                    }
                }
            }

            return list;

    }
}