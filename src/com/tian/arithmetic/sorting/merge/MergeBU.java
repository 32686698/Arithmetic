package com.tian.arithmetic.sorting.merge;

import com.tian.arithmetic.sorting.base.SortTemplate;

/**
 * �鲢����,�Ե����ϵĹ鲢����
 * ���������鲢��Ȼ���ĸ��ĸ��鲢��Ȼ��˸��˸��鲢
 * @author HisignT
 *
 */
public class MergeBU extends SortTemplate{

	private Comparable[] aux;
	
	public static void main(String[] args) {
		SortTemplate s = new MergeBU();
		s.sort(s.getRandomArray(10, 20));
	}
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		show(a);
		int N = a.length;
		for (int i = 1; i < N; i += i) {
			for (int j = 0; j < N - i ; j += i+i) {
				merge(a, j, j+i-1, Math.min(j+i+i-1, N-1));
			}
		}
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
