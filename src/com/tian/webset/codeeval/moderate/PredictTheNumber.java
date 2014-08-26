package com.tian.webset.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Ԥ�����֣���0��ʼ��ԭ�����ְ���0��1��1��2��2��0�Ĺ�����λת����׷�ӵ�ԭ�����ֺ��棬����µ����֡�Ԥ���Nλ�ϵ��������ĸ�
 * @author HisignT
 *	https://www.codeeval.com/open_challenges/125/
 */
public class PredictTheNumber {
	private static int replacementNum = 0;
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				lineTxt = lineTxt.trim();
				if(lineTxt.equals(""))
					continue;
				replacementNum = 0;
				long position = Long.parseLong(lineTxt);
				getReplacementNum(position + 1);
				System.out.println(getCharAt('0'));
			}
		}
	}
	/**
	 * �任
	 * @param startChar
	 * @return
	 */
	private static char getCharAt(char startChar){
		for (int i = 0; i < replacementNum; i++) {
			if(startChar == '0')
				startChar = '1';
			else if(startChar=='1')
				startChar = '2';
			else if(startChar=='2')
				startChar = '0';
		}
		return startChar;
	}
	/**
	 * �õ���Ҫ�任���ٴ�
	 * @param num
	 */
	private static void getReplacementNum(long num){
		int e = get2e(num);
		num = (long) (num - Math.pow(2, e));
		if(num == 0){
			replacementNum += e;
		}else{
			replacementNum ++;
			getReplacementNum(num);
		}
	}
	/**
	 * �õ���һ����С������2��ָ��
	 * @param num
	 * @return
	 */
	private static int get2e(long num){
		int i = 0;
		while (num!=1) {
			num = num/2;
			i++;
		}
		return i;
	}
}
