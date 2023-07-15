import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer y = target - nums[i];
            Integer mapEntry = map.get(y);
            if (mapEntry != null && mapEntry != i) {
                return new int[]{i, mapEntry};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
