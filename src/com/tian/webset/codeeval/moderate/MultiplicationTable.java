package com.tian.webset.codeeval.moderate;

/**
 * µÃ·¨±í
 * @author HisignT
 *https://www.codeeval.com/open_challenges/23/
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		int row = 12;
		int length = 12;
		System.out.println(stripOutLeadingSpaces(generateMultiplicationTable(row,length),row));
	}
	
	private static String stripOutLeadingSpaces(String str,int row){
		int count;
		str = "\n"+str;
		while(true){
			count = (str).split("\n ").length;
			if(count!=row+1)
				break;
			str = str.replace("\n ", "\n");
		}
		return str.substring(1,str.length());
	}
	private static String generateMultiplicationTable(int row,int length){
		StringBuffer sb = new StringBuffer();
		for(int i = 1 ; i <= row; i++){
			for(int j = 1 ; j <= length; j ++){
				sb.append(formatNum(i*j));
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	private static String formatNum(int i){
		StringBuffer sb = new StringBuffer();
		int numLength = Integer.toString(i).length();
		while (4-numLength++>0)
			sb.append(" ");
		sb.append(i);
		return sb.toString();
	}
}
