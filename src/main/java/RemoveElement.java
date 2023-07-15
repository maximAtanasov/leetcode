class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[resultIndex++] = nums[i];
            }
        }
        return resultIndex;
    }
}