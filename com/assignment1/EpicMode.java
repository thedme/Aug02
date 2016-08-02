package com.assignment1;

public class EpicMode {
	
	
	

	public static void main(String[] args) {
		
		printBookList();
	
	}
	
	public static void printBookList()
	{
		 String[][] bookList = new String[3][3];
			bookList[0][0] = "book1";	
			bookList[0][1] = "book2";	
			bookList[0][2] = "book3";	
			
			bookList[1][0] = "book4";	
			bookList[1][1] = "book5";	
			bookList[1][2] = "book6";
			
			bookList[2][0] = "book7";	
			bookList[2][1] = "book8";
			bookList[2][2] = "book9";	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(bookList[i][j]+",  ");
			}
			System.out.println("");
		}
	}

}
