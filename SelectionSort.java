package com.java.dsprogram;

import java.util.Arrays;

public class SelectionSort {

static 	int []algorithmForSelectionsort(int []q){
	for(int i=0;i<q.length;i++){
		int min=i;
		for(int j=i+1;j<q.length;j++){
			if(q[min]<q[j]){
				min=j;
			}
			
		}int t=q[min];
		q[min]=q[i];
		q[i]=t;
		
		
	}
	
	
	return q;
}
	public static void main(String[] args) {
		int q[]={12, 34, 10, 6, -1,0,89,90,40}; 
		int as[]=algorithmForSelectionsort(q);
		System.out.println(Arrays.toString(as));
	}

}