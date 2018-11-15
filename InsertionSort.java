package com.java.dsprogram;

import java.util.Arrays;

public class InsertionSort {


static 	int []algorithmForInsertionSort(int []q){
	
	for(int i=1;i<q.length;i++){
		int a=q[i];
		int j=i-1;
		while(j>=0 && q[j]>a){
			q[j+1]=q[j];
			j--;
		}
		q[j+1]=a;
	}
	
	return q;
}
	public static void main(String[] args) {
		int q[]={12, 34, 10, 6, -1,0,89,90,40}; 
		int as[]=algorithmForInsertionSort(q);
		System.out.println(Arrays.toString(as));
	}

}
