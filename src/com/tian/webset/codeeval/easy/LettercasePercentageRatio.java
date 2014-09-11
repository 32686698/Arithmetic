package com.tian.webset.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * 统计大小定字母的百分率
 * @author HisignT
 *https://www.codeeval.com/open_challenges/147/
 */
public class LettercasePercentageRatio {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		DecimalFormat df = new DecimalFormat("#0.00");
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.equals(""))
					continue;
				char[] a = lineTxt.toCharArray();
				double b = lowercasePercentageRatio(a);
				System.out.println("lowercase: "+df.format(b)+" uppercase: "+df.format(100-b));
			}
		}
	}
	
	public static double lowercasePercentageRatio(char[] a){
		int lowercase = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=97&&a[i]<=122){
				lowercase ++;
			}
		}
		return Double.parseDouble(lowercase+"")*100/a.length;
	}
}
