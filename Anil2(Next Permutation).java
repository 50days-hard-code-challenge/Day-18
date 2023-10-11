class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i = n-2; i>=0; i--){
            // find the breaking point 
            if(nums[i]<nums[i+1]){
                 index = i;
                 break;
            }
        }
        // if there is no break point like [5,4,3,2,1,]
        // just reverse the array
        if(index == -1){
            int start = 0;
        int end = n-1;
        while(start<end){
            // swap it 
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        }else{ 
               // step:2 find the next greater element and swap it
                // with arr[index]
                for(int i = n-1; i>=0;i--){
                    if(nums[i]>nums[index]){
                      int temp = nums[i];
                      nums[i] = nums[index];
                      nums[index] = temp;
                        break;
                    }
                }
        
                int start = index+1;
                int end = n-1;
                while(start<end){
                 // swap it 
                   int temp = nums[start];
                   nums[start] = nums[end];
                   nums[end] = temp;
                     start++;
                    end--;
                }
            }   

    }
}
