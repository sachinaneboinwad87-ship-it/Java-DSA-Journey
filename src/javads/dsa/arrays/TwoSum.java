package javads.dsa.arrays;


public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (target == nums[i] + nums[j]) {

                    ans[0] = i;
                    ans[1] = j;

                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {10,20,1,6,5,68};
        int target = 21;
      int []result =   twoSum(nums,target);
        System.out.println("["+result[0]+ "," +result[1] +"]");

    }
}
