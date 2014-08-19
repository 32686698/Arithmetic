package com.tian.webset.csdnhero;

import java.util.Scanner;

/**
 * 给定整数区间[A,B]问其中有多少个完全平方数
 * @author HisignT
 *	http://hero.csdn.net/Question/Details?ID=608&&ExamID=603
 */
public class Wanquanpingfangshu {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = 0;
		int end = 0;
		StringBuffer sb = new StringBuffer();
		while(s.hasNextInt()){
			start = s.nextInt();
			end = s.nextInt();
			sb.append(exec(start, end)).append("\n");
		}
		System.out.println(sb.toString());
	}
	public static int exec(int start,int end){
		int count = 0;
		int num = (int)Math.ceil(Math.sqrt(start));
		int temp = num*num;
		if(temp<start||temp>end)
			return 0;
		do{
			count ++;
			num ++;
		}while(num*num<=end);
		return count;
	}
}
