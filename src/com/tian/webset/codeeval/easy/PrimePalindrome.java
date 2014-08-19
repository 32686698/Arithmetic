package com.tian.webset.codeeval.easy;

//https://www.codeeval.com/open_challenges/3/
public class PrimePalindrome {

	public static void main(String[] args) {
		int i = 1000;
		while (i>1) {
			i--;
			if(determinePllindrome(i+"")&&determinePrime(i)){
				System.out.println(i);
				break;
			}
		}
	}
	/**
	 * �ж��Ƿ��ǻ���
	 * @param str
	 * @return
	 */
	public static boolean determinePllindrome(String str){
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		if(str.equals(sb.toString()))
			return true;
		return false;
	}
	/**
	 * �ж��Ƿ�������
	 * �����ж�1
	 * @param num
	 * @return
	 */
	public static boolean determinePrime(int num){
		for(int i = (int) Math.floor(Math.sqrt(num)) ; i > 1 ; i--){
			if(num%i==0)
				return false;
		}
		return true;
	}
}
