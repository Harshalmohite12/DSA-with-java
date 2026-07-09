class Solution {

        static int digits(int num){
            //this method will return how many digits num contains
            if(num == 0){
                return 1;
            }
            int count = 0;
            while(num > 0){
                count++;
                num = num / 10;
            }
            return count;
        }

        static boolean isEven(int num){
            //this method returns num contains even numbers f digits in num 
        
            return digits(num) % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        // this method will count how manu number have even number of length
        int count = 0;

        for(int num: nums){
            if(isEven(num)){
                count++;

            }
        }

        return count;   
    }
}