// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Random;

class solution
{
	public static void shuffle(int nums[])
	{
		for (int i = nums.length - 1; i >= 1; i--)
		{
			Random rand = new Random();

			int j = rand.nextInt(i + 1);

			int temp = nums[i];
		    nums[i] = nums[j];
		    nums[j] = temp;
		}
	}
	public static void main (String[] args)
	{
		int[] nums = { 1, 2, 3, 4, 5, 6,7 };
        System.out.println("Original Array: "+Arrays.toString(nums));
		shuffle(nums);
		System.out.println("Shuffle Array: "+Arrays.toString(nums));
	}
}
