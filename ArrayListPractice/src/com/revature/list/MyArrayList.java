package com.revature.list;

//import java.sql.Array;
import java.util.*;

public class MyArrayList {

	int [] arrr = new int[10];
	int capacity=arrr.length;
	int size=0;
	
	public void add(int val) {
		// TODO Auto-generated method stub
		size=capacity;
			capacity++;
			arrr = Arrays.copyOf(arrr, capacity);
		
		arrr[size]=val;
		
		
		
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		if(index>=0&&index<capacity) {
			arrr[index]=val;
		}
		else
			System.out.println("index error");
		
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		
		if(index>=0&&index<capacity) {

			   for(int i = index; i < arrr.length-1; i++){
			        arrr[i] = arrr[i + 1];
			      }
			   capacity--;
			   arrr = Arrays.copyOf(arrr, capacity);
			  
}

	else return;
		
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return arrr[index];
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arrr));
		return null;
	}
}
