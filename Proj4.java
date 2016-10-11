/**
 * Project 4 Parity
 * @author Donmonique Edmondson
 * @version 4
 * Friday 7:30
 */
 

import java.io.*;
import java.util.*;
public class Proj4 {

	public static void main(String[] args) throws IOException {
		//Scanners and Initialization
		Scanner s = new Scanner(System.in);
		String line = "";
		int rowBound = 0;
		int columnBound = 0;
		int parityTotal = 0;
		int parity = 0;
		int j = 0;//initialize 
		int errorX = 0;
		int errorY = 0;
		int errorCount = 0;
		//asks for file path
		System.out.print("Enter File Path : ");
		String filePath = s.nextLine();
		Scanner input = new Scanner(new File(filePath));
		
		//get bounds
		line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line, "x");
		rowBound = Integer.parseInt(st.nextToken());
		columnBound = Integer.parseInt(st.nextToken());
		
		int [][] image = new int [rowBound][columnBound];
		
		input.nextLine();//skip blank line
		//*******************INPUT IMAGE TO ARRAY****************
		while (input.hasNext()) {//while we have available data
			line = input.nextLine();//take data from string
			for (int i = 0; i < columnBound; i++) {//take each character from string to column
				image[j][i] = (int)line.charAt(i) - '0';//subtract ascii 0 (48) from ascii 0 or 1
			}
			j++;
		}
		//reads all lines of file to string to integer 2d array
		
		//***************COMPARING TO PARITY*******************
		//compare parity bits on x axis
		for (int y=0; y<rowBound-1; y++){
			parityTotal = 0;
			for (int x=0; x<columnBound-1; x++){
				parityTotal += image[y][x];
			}
			if (parityTotal%2 == 0) {
				parity = 0;
			}
			else if (parityTotal%2 != 0) {
				parity = 1;
			}
			
			if (parity != image[y][columnBound-1]){
				System.out.println("Does Not Match " + "row : " + y + " should be : " + parity);
				errorCount++;
				errorY = y;
			}
			
		}
		//compare parity bits on y axis
		for (int x=0; x<columnBound-1; x++){
			parityTotal = 0;
			for (int y=0; y<rowBound-1; y++){
				parityTotal += image[y][x];
			}
			if (parityTotal%2 == 0) {
				parity = 0;
			}
			else if (parityTotal%2 != 0) {
				parity = 1;
			}
			
			if (parity != image[rowBound-1][x]){
				System.out.println("Does Not Match " + "column : " + x + " should be : " + parity);
				errorX = x;
			}
			
		}
		
		//**********fixing errors************************
		if (errorCount == 1) {//if 1 error flip the number there
			System.out.println("Change has been found... Correcting");
			if (image[errorY][errorX] == 0 ){
				image[errorY][errorX] = 1;
			}
			else if (image[errorY][errorX] == 1) {
				image[errorY][errorX] = 0;
			}
		}
		else if (errorCount > 1) {//if more then one error leave the program
			System.out.println("ERROR TOO MANY CHANGES!");
			return;
		}
		else {//else no errors (only other condition)
			System.out.println("No Errors have been found!");
		}
		//******************printing out fixed image********************
		System.out.print("Enter Substitutes for white (1) : ");
		char white = s.nextLine().charAt(0);
		System.out.print("Enter Substitutes for black (0) : ");
		char black = s.nextLine().charAt(0);
		
		for (int y=0; y<rowBound-1; y++) {//every row
			for (int x = 0; x < columnBound-1; x++) {//every column
				if (image[y][x] == 1) {//replace substitutes and print
					System.out.print(white);
				}
				else if (image[y][x] == 0) {
					System.out.print(black);
				}
			}
			System.out.println();//new line
		}

		input.close();//closes connection
	}

}
