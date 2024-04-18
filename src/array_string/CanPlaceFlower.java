package array_string;

/*
 
 You have a long flowerbed in which some of the plots are planted, and some are not. 
 However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, 
where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating 
the no-adjacent-flowers rule and false otherwise.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 
 */

public class CanPlaceFlower {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int prev = 0;
		int current; // = flowerbed[0];
		int count = n;
		int next;

		if(count==0) {
			return true;	
		}
		
		for (int i = 0; i < flowerbed.length; i++) {
			current = flowerbed[i];
			if (i == flowerbed.length - 1) {
				next = 0;
			} else {
				next = flowerbed[i + 1];
			}
			if (prev == 0 && current == 0 && next == 0) {
				//System.out.println("Flower planted at index " + i);
				count--;
				prev = 1;
			} else {
				prev = current;
			}

			if (count == 0)
				return true;
		}

		return false;

	}

	public static void main(String[] args) {
		// int[] flowerbed = { 1, 0, 0, 0, 0, 1 };
		int[] flowerbed = { 0, 0, 0, 0, 0, 1, 0, 0 }; // { 0, 0, 1, 0, 0 };
		int n = 0;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}

}
