class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current_number = nums[i];
            int desired_number = target - current_number;

            if(map.containsKey(desired_number)){
                System.out.println(map.get(desired_number) + " " + i);
                return new int[]{map.get(desired_number), i};
            }

            map.put(current_number, i);
        }
        return new int[]{};
    }
}