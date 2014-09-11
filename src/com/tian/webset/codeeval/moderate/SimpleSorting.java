package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * 简单的排序，不过是小数
 * @author HisignT
 *https://www.codeeval.com/open_challenges/91
 */
public class SimpleSorting {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		DecimalFormat df = new DecimalFormat("#.000");
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.equals(""))
					continue;
				String[] stra = lineTxt.split(" ");
				double[] a = new double[stra.length];
				for (int i = 0; i < a.length; i++) {
					a[i] = Double.parseDouble(stra[i]);
				}
				a = sort(a);
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < a.length; i++) {
					sb.append(df.format(a[i])).append(" ");
				}
				System.out.println(sb.toString().trim());
			}
		}
	}
	
	public static double[] sort(double[] a){
		for (int i = 0; i<a.length; i++) {
			for(int j = 0 ; j < a.length - i - 1 ; j ++){
				if(a[j]>a[j+1]){
					double temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	/*
	  	70.920 -38.797 14.354 99.323 90.374 7.581
		-37.507 -3.263 40.079 27.999 65.213 -55.552
	 */
}
