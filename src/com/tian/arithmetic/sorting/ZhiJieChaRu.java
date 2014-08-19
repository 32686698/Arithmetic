package com.tian.arithmetic.sorting;


/**
 * 直接插入排序
 * 一组数，分为两部分，一部分为有序的，一部分为无序，每次将无序部分的第一个数插入到有序总分即可，直到将无序部分的数插完
 * @author tian
 * 
 */
public class ZhiJieChaRu{

	public static int[] source = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12,
		64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
	
	public static void main(String[] args) {
		int [] a = exec(source);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
	public static int[] exec(int[] source) {
		int size = source.length;
		int temp = 0;
		for (int i = 1; i < size; i++) {
			temp = source[i];
			int j = i - 1;
			//从小到大排序时temp<source[j],意为小的往前去
			//从大到小排序时temp>source[j],意为大的往前去
			for (; j >=0 && temp > source[j]; j--) {
				source[j+1] = source[j];
			}
			source[j+1] = temp ;
		}
		return source;
	}
}
