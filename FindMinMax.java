package nov.automation.week2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(nums);
		System.out.println("Minimum value is " +nums[0]);
		System.out.println("Second maximum value is " +nums[nums.length-2]);
	}

}
