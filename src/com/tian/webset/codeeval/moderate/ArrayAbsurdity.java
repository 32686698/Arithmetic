package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 找到数组中重复的那个数
 * @author HisignT
 *https://www.codeeval.com/open_challenges/41/
 */
public class ArrayAbsurdity {
	
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
				String[] strs = lineTxt.split(";");
				int[] a = new int[Integer.parseInt(strs[0])];
				String[] stra = strs[1].split(",");
				for (int i = 0; i < a.length; i++) {
					a[i] = Integer.parseInt(stra[i]);
				}
				System.out.println(getDuplicatedEntry(a));
			}
		}
	}
	
	public static int getDuplicatedEntry(int[] a){
		boolean [] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if(b[a[i]])
				return a[i];
			b[a[i]] = true;
				
		}
		return 0;
	}

}
