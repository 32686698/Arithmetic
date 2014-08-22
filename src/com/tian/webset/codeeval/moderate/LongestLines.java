package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 求最长的句子
 * @author HisignT 
 * https://www.codeeval.com/open_challenges/2/
 *
 */
public class LongestLines {

	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			int num = Integer.parseInt(bufferedReader.readLine());
			String[] longestLines = new String[num];
			for(int i = 0 ; i < num ; i ++){//排序前num个句子 从长到短
				if((lineTxt = bufferedReader.readLine()) != null){
					lineTxt = lineTxt.trim();
					if(lineTxt.equals("")){
						i--;
						continue;
					}
					for(int j = 0 ; j < i ; j ++){
						if(lineTxt.length()>longestLines[j].length()){
							String temp = lineTxt;
							lineTxt = longestLines[j];
							longestLines[j] = temp;
						}
					}
					longestLines[i] = lineTxt;
				}
			}
			
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.trim().equals(""))
					continue;
				for(int i = 0 ; i < longestLines.length ; i ++){
					if(lineTxt.length()>longestLines[i].length()){
						String temp = lineTxt;
						lineTxt = longestLines[i];
						longestLines[i] = temp;
					}
				}
			}
			read.close();
			for (String string : longestLines) {
				System.out.println(string);
			}
		}
	}
}
