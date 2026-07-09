class Solution {

        static boolean isEven(int num){
        int temp = 0;
        while(num > 0){
            temp++;
            num = num / 10;
        }
        
        if(temp % 2 == 0){
            return true;
        }
        return false;
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num: nums){
            if(isEven(num)){
                count++;

            }
        }

        return count;   
    }
}