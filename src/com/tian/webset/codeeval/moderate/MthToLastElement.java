package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * ÕÒµ¹ÊýµÄÊý
 * @author HisignT
 *	https://www.codeeval.com/open_challenges/10/
 */
public class MthToLastElement {

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
				String str = lineTxt.replace(" ", "");
				
				char[] chars = str.toCharArray();
				int length = chars.length;
				int num = Integer.parseInt(String.valueOf(chars[length-1]));
				if(num>=length)
					continue;
				System.out.println(chars[length-1-num]);
			}
		}
	}
}
