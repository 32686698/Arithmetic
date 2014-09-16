package com.tian.arithmetic.sorting.primary;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * ��������
 * @author HisignT
 *
 */
public class Insertion extends SortTemplate {

	/**
	 * �����������
	 * ��ǰһ���Ƚϣ���ǰһ�������뽻һ������λ��
	 */
	public void sort(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0&&less(a[j],a[j-1]); j--) {
				exch(a, j, j-1);
			}
			show(a);
		}
	}
	
	public static void main(String[] args) {
		SortTemplate s = new Insertion();
		s.sort(s.getRandomArray(10, 20));
	}
	
	/**
	 * �Ľ��Ĳ�������
	 * ����ѭ���нϴ��Ԫ�ض����ƶ��������ǽ���
	 * @param a
	 */
	public void improveSort(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			Comparable temp = a[i];
			int j = i-1;
			for ( ; j >= 0&&less(temp,a[j]); j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
			show(a);
		}
			
	}

}
