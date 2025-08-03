class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums) arr.add(num);

        k %= nums.length;
        Collections.rotate(arr,k);

        for(int i=0; i<nums.length; i++){
            nums[i]=arr.get(i);
        }
    }
}