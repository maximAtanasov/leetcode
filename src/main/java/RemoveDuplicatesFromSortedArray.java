class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int resultIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[resultIndex - 1]) {
                nums[resultIndex++] = nums[i];
            }
        }
        return resultIndex;
    }
}