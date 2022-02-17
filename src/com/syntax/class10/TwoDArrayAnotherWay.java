package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {

		int[][] numbers = { 
				{ 10, 20, 30 ,40}, //0
				{ 100, 200, 300 }, //1
				{ 1000, 2000, 3000 ,4000,6000}//2
					
		};
		int size=numbers.length;//3
		int sizeOf1Array=numbers[0].length;//4
		int sizeOf2Array=numbers[1].length;//3
		int sizeOf3Array=numbers[2].length;//5
		System.out.println(sizeOf1Array);
		System.out.println(sizeOf2Array);
		System.out.println(sizeOf3Array);
		
	//Retrieving all elements from 2D array
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[i].length;j++) {
				
				System.out.println(numbers[i][j]);
			}
			
		}
		
	}

}
