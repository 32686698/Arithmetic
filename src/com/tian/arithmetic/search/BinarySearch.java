package com.tian.search;

/**
 * 二分查找
 * @author tian
 *
 */
public class BinarySearch {

	private static int[] a = {1,3,4,5,8,9,10,12,14,16,17,30,36,55,68,69,90,100};
	private static int key = 3;
	
	public static void main(String[] args) {
		System.out.println(rank(key, a));
	}
	/**
	 * 二分查找，非递归，数组为升序
	 * @param key
	 * @param a
	 * @return
	 */
	public static int rank(int key,int[] a){
		int low = 0;
		int hight = a.length - 1;
		while (low <= hight) {
			int mid =( low + hight ) / 2;
			if(key < a[mid])
				hight = mid -1 ;
			if(key > a[mid])
				low = mid + 1;
			if(key == a[mid])
				return mid;
		}
		return -1;
	}
	
}
