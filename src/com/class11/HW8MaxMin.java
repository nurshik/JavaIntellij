package com.class11;

public class HW8MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {900,28,5,36,84,41,56,2,73};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {			
			if(max<arr[i]) {
				max=arr[i];
			}if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Max of array="+max);
		System.out.println("Min of array="+min);
		System.out.println("---------Second largest----------");
		int dif=0,max2=0;
		max=0;
		for(int j=0;j<arr.length;j++) {			
			if(max<arr[j]) {						
				max2=max;
				max=arr[j];
			}else {
				if(max2<arr[j] && max!=arr[j]) {
					max2=arr[j];
				}
			}
		}
		System.out.println("2nd Max of array="+max2);
		System.out.println("Max of array="+max);
		System.out.println("Min of array="+min);
	}

}
