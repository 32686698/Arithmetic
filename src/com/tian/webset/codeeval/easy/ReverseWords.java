package com.tian.webset.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

//https://www.codeeval.com/open_challenges/8/
public class ReverseWords {

	public static void main(String[] args) {
		File file = new File(args[0]);
		if(file.isFile() && file.exists()){
            InputStreamReader read = null;
			try {
				read = new InputStreamReader(
				new FileInputStream(file),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            try {
				while((lineTxt = bufferedReader.readLine()) != null){
					String reverseStr = reverseWords(lineTxt);
					if(reverseStr.equals(""))
						continue;
				    System.out.println(reverseStr);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
            try {
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String reverseWords(String str) {
		if (str.trim().equals(""))
			return "";
		String[] worlds = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = worlds.length - 1; i >= 0; i--) {
			if (worlds[i].trim().equals(""))
				continue;
			sb.append(worlds[i]).append(" ");
		}
		return sb.toString().trim();
	}
}
