package com.tian.webset.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

//https://www.codeeval.com/open_challenges/1/
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		File file = new File(s.nextLine());
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
					String fb = fizzBuzz(lineTxt);
					if(fb.equals(""))
						continue;
				    System.out.println(fb);
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
	public static String fizzBuzz(String str){
		int[] ints = new int[3];
		int i = 0;
		StringBuffer sb = new StringBuffer();
		for (String string : str.split(" ")) {
			if(string.trim().equals(""))
				continue;
			ints[i] = Integer.parseInt(string);
			i++;
		}
		for (i = 1; i <= ints[2]; i++) {
			if((i%ints[0]==0)&&(i%ints[1]==0)){
				sb.append("FB").append(" ");
				continue;
			}
			if(i==ints[0]||i%ints[0]==0){
				sb.append("F").append(" ");
				continue;
			}
			if(i==ints[1]||i%ints[1]==0){
				sb.append("B").append(" ");
				continue;
			}
			sb.append(i).append(" ");
		}
		return sb.toString().trim();
	}
}
