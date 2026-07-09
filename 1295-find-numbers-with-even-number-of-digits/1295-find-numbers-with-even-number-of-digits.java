class Solution {

        static int digits(int num){
            int count = 0;
            while(num > 0){
                count++;
                num = num / 10;
            }
            return count;
        }

        static boolean isEven(int num){
        
        return digits(num) % 2 == 0;
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