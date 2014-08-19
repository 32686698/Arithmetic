package com.tian.arithmetic.sorting;


/**
 * ֱ�Ӳ�������
 * һ��������Ϊ�����֣�һ����Ϊ����ģ�һ����Ϊ����ÿ�ν����򲿷ֵĵ�һ�������뵽�����ּܷ��ɣ�ֱ�������򲿷ֵ�������
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
			//��С��������ʱtemp<source[j],��ΪС����ǰȥ
			//�Ӵ�С����ʱtemp>source[j],��Ϊ�����ǰȥ
			for (; j >=0 && temp > source[j]; j--) {
				source[j+1] = source[j];
			}
			source[j+1] = temp ;
		}
		return source;
	}
}
