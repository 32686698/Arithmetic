package com.tian.arithmetic.sorting.merge;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * �鲢����,�Զ����µĹ鲢����
 * @author HisignT
 *
 */
public class Merge extends SortTemplate{

	private Comparable[] aux;
	
	public static void main(String[] args) {
		SortTemplate s = new Merge();
		s.sort(s.getRandomArray(10, 20));
	}
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		show(a);
		sort(a, 0, a.length-1);
	}
	private void sort(Comparable[] a,int lo,int hi){
		if(hi <= lo)
			return;
		int mid = lo + (hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	private void merge(Comparable[] a,int lo,int mid ,int hi){
		int i = lo;
		int j = mid + 1;//ǰ�������Ⱥ���������һ�������
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if(i>mid)//��һ�������Ѿ��������
				a[k] = aux[j++];
			else if(j>hi)//�ڶ��������Ѿ��������
				a[k] = aux[i++];
			else if(less(aux[j],aux[i]))//�ڶ�������ĵ�һ��Ԫ�رȵ�һ������ĵ�һ��Ԫ��С�����ڶ�������ĵ�һ��Ԫ����ӵ�����a�У��ٽ��ڶ��������ͷָ������ƶ�һλ
				a[k] = aux[j++];
			else//��һ������ĵ�һ��Ԫ�رȵڶ�������ĵ�һ��Ԫ��С������һ������ĵ�һ��Ԫ����ӵ�����a�У��ٽ���һ�������ͷָ������ƶ�һλ
				a[k] = aux[i++];
		}
		show(a);
	}

}
