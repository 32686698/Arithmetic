package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 两个平方数的合
 * @author HisignT
 *	https://www.codeeval.com/open_challenges/33/
 */
public class DoubleSquares {

	public static void main(String[] args)throws Exception {
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			int lineCount = Integer.parseInt(bufferedReader.readLine());
			while (lineCount-->0) {
				lineTxt = bufferedReader.readLine().trim();
				if(lineTxt.equals(""))
					continue;
				System.out.println(doubleSquares(Integer.parseInt(lineTxt)));
			}
		}
	}
	public static int doubleSquares(int num){
		int count = 0;
		int kaifang = (int) Math.sqrt(num);
		for (int i = kaifang ; i >= kaifang/2;i--) {
			for (int j = 0; j <= i; j++) {
				if(i*i+j*j==num)
					count++;
			}
		}
		return count;
	}
}
