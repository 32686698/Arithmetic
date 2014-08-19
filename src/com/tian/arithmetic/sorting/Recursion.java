package com.tian.arithmetic.sorting;

/**
 * µ›πÈ≈≈–Ú
 * @author HisignT
 *
 */
public class Recursion {
	public static int[] source = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12,
		64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
	
	public static void main(String[] args) {
		exec(source,0);
		for (int i : source) {
			System.out.println(i);
		}
	}
	
	public static void exec(int[] arry,int start) {
		if(start==arry.length-1)
			return ;
		int temp = 0;
		for (int i = start+1; i< arry.length;i++) {
			if(arry[i]<arry[start]){
				temp = arry[i];
				arry[i]=arry[start];
				arry[start]=temp;
			}
		}
		exec(arry,start+1);
	}
}
