package com.tian.webset.csdnhero;

import java.util.Scanner;

/**
 * 一份“奇妙”的银行流水
 * @author HisignT
 *	http://hero.csdn.net/Question/Details?ID=633&&ExamID=628
 */
public class zuixiaogongbeishu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(s.nextLine()).append("\n");
		String[][] strs = new String[26][4];
		int index = 0;
		String temp = "";
//		for(;index<25&&(!(temp = s.nextLine()).equals("E"));index++)
		for(;index<25&&(!s.hasNext());index++)
			strs[index] = temp.split(";");
		strs = exec(strs, index);
		for (int i = 0; i < index; i++) {
			sb.append(strs[i][0].trim()).append(";").append(strs[i][1].trim()).append(";")
				.append(strs[i][2].trim()).append(";").append(strs[i][3].trim()).append("\n");
		}
		System.out.println(sb.toString());
	}
	public static String[][] exec(String[][] strs,int lineNum){
		int flag = 0;//标记是不是有两个问号
		boolean aFlag = false;//标记是不是还有问题
		for(int i = 1 ; i < lineNum ; i++){
			System.out.println("-");
			strs[i][0] = i+1+"";
			flag = 0;
			if(strs[i-1][3].equals("?"))flag += 1;
			if(strs[i][1].equals("?"))flag += 3;
			if(strs[i][2].equals("?"))flag += 5;
			if(strs[i][3].equals("?"))flag += 7;
			if(flag%2==0){
				aFlag = true;
				continue;
			}
			if(flag==1){//strs[i-1][3].equals("?")
				strs[i-1][3] = (Double.parseDouble(strs[i][2])+Double.parseDouble(strs[i][3])-Double.parseDouble(strs[i][1]))+"";
				continue;
			}
			if(flag==3){//strs[i][1].equals("?")
				strs[i][1] = (Double.parseDouble(strs[i][2])+Double.parseDouble(strs[i][3])-Double.parseDouble(strs[i-1][3]))+"";
				continue;
			}
			if(flag==5){//strs[i][2].equals("?")
				strs[i][2] = (Double.parseDouble(strs[i-1][3])+Double.parseDouble(strs[i][1])-Double.parseDouble(strs[i][3]))+"";
				continue;
			}
			if(flag==7){//strs[i][3].equals("?")
				strs[i][3] = (Double.parseDouble(strs[i-1][3])+Double.parseDouble(strs[i][1])-Double.parseDouble(strs[i][2]))+"";
				continue;
			}
		}
		if(aFlag)
			strs = exec(strs, lineNum);
		return strs;
	}
}
