package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/**
 * Ñ­»·Êý×Ö
 * @author HisignT
 * https://www.codeeval.com/open_challenges/5/
 */
public class DetectCycles {

	public static void main(String[] args)throws Exception {
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.trim().equals(""))
					continue;
				String[] a = lineTxt.split(" ");
				int[] b = new int[a.length];
				for (int i = 0; i < a.length; i++) {
					b[i] = Integer.parseInt(a[i]);
				}
				System.out.println(detectCycles(b));
			}
		}
	}
	public static String detectCycles(int[] ints){
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < ints.length; i++) {
			for (int j = i+1; j < ints.length; j++) {
				if(ints[i]!=ints[j])
					continue;
				boolean isCycle = true;
				for (int k = 1; k < j-i; k++) {
					if(ints[i+k]!=ints[j+k])
						isCycle = false;
				}
				if(isCycle){
					for (int k = i; k < j; k++) {
						sb.append(ints[k]).append(" ");
					}
					return sb.toString().trim();
				}
			}
		}
		return sb.toString();
	}
}
