package array_2part;

import java.util.Arrays;

public class Merge_Two_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {50,60,70,80};
		int a_length=a.length;
		int b_length=b.length;
		int c_length=(a_length+b_length);
		int  c[]=new int[c_length];
		for(int i=0;i<a_length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b_length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(c));	
	}

}
