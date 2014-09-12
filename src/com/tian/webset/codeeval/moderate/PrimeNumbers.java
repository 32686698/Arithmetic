package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 求小于某个数的所有素数4,294,967,295
 * @author HisignT
 *https://www.codeeval.com/open_challenges/46/
 */
public class PrimeNumbers {

	private static boolean[] b;
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
				int initNum = Integer.parseInt(lineTxt);
					
				getPrimeNumbers(initNum);
				StringBuffer sb = new StringBuffer();
				for (int i = 2; i < initNum; i++) {
					if(!b[i])
						sb.append(i).append(",");
				}
				System.out.println(sb.toString());
			}
		}
		
	}
	
	/**
	 * 	埃氏筛法
	 * @param num
	 * @return
	 */
	private static void getPrimeNumbers(int num){
		int sqrt = (int) Math.floor(Math.sqrt(num));
		b = new boolean[ (num+1)];//默认全是false
		for(int i=2;i<=sqrt;i++){
			if(!b[i]){
				for(int j = i*2;j<num;j +=i){//能进来的都是合并，至少有i这个因子
					b[j]=true;
				}
			}
		}
	}
}
