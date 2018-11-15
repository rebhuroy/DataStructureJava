package com.java.dsprogram;

import java.util.Arrays;

public class QuickShort {
	static int partition(int q[],int start,int end){
		int i=start-1;
		int j=start;
		int t=0;
		int pivot=q[end];
		for(j=start;j<= end-1;j++){
			if(q[j]<=pivot){
				i++;
				t=q[i];
				q[i]=q[j];
				q[j]=t;
			}
		}
		i++;
		int ival=q[i];
		q[end]=ival;
		q[i]=pivot;
		
		


		
		
		return i;	
		
	}
	
	

	static void quicksort(int q[],int start,int end){
		if(start<end){
			int pivot=partition(q,start,end);
			quicksort(q,start,pivot-1);
			quicksort(q,pivot+1,end);
		}
	}
	
	
	public static void main(String[] args) {
		int q[]={12, 34, 10, 6, -1,0,89,90,40}; 
		
		quicksort(q,0,q.length-1);
		System.out.println(Arrays.toString(q));
		
	}

}
