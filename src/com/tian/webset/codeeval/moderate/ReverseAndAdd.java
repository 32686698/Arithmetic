package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 反转整数，然后相加，判断是否是回文
 * @author HisignT
 *	https://www.codeeval.com/open_challenges/45/
 */
public class ReverseAndAdd {

	public static void main(String[] args)throws Exception {
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.equals(""))
					continue;
				long initNum = Long.parseLong(lineTxt);
				long i = 0;
				while (!isPalindrome(initNum)) {
					initNum += reverseInt(initNum);
					i++;
				}
				System.out.println(i+" "+initNum);
			}
		}
	}
	
	
	private static long reverseInt(long initNum){
		String initStr = initNum+"";
		StringBuffer sb = new StringBuffer();
		for (int i = initStr.length()-1; i >= 0 ; i--)
			sb.append(initStr.charAt(i));
		return Long.parseLong(sb.toString());
	}
	private static boolean isPalindrome(long num){
		if(reverseInt(num)==num)
			return true;
		return false;
	}
}
