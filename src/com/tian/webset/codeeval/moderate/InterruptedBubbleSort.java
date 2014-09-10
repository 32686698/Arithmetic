package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 根据指定遍历次数输出冒泡排序的结果
 * @author HisignT
 *https://www.codeeval.com/open_challenges/158/
 */
public class InterruptedBubbleSort {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.equals(""))
					continue;
				String[] strs = lineTxt.split("\\|");
				String[] stra = strs[0].split(" ");
				long[] a = new long[stra.length];
				for (int i = 0; i < a.length; i++) {
					a[i] = Long.parseLong(stra[i]);
				}
				a = exec(a, Long.parseLong(strs[1].trim()));
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < a.length; i++) {
					sb.append(a[i]).append(" ");
				}
				System.out.println(sb.toString().trim());
			}
		}
	}
	
	public static long[] exec(long[] ints,long count){
		for (int i = 0; (i < count)&&(i<ints.length); i++) {
			for(int j = 0 ; j < ints.length - i - 1 ; j ++){
				if(ints[j]>ints[j+1]){
					long temp = ints[j+1];
					ints[j+1] = ints[j];
					ints[j] = temp;
				}
			}
		}
		return ints;
	}
}
