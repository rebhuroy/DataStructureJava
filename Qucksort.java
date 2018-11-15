package com.java.dsprogram;

import java.util.Arrays;

public class Qucksort {

	static int partition(int q[],int start,int end){
		int pivot=q[end];
		int i=start-1;
		int j=start;
		for(j=start;j<end;j++){
			if(q[j]<pivot){
				i++;
				int t=q[i];
				q[i]=q[j];
				q[j]=t;
			}
		}
		i++;
		int t=q[i];
		q[i]=q[end];
		q[end]=t;
		
		
		
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
