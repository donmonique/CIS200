/**
 * BlackJack Project 2
 * @author Donmonique edmondson
 * @version 2
 * Lab Friday 7:30
 */
import java.util.*;
public class BlackJack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String UserCardCase1 = " ";
		String UserCardCase2 = " ";
		String DealCardCase1 = " ";
		String DealCardCase2 = " ";
		int UserCardNum1 = 0;
		int UserCardNum2 = 0;
		int DealCardNum1 = 0;
		int DealCardNum2 = 0;
		int total1 = 0;
		int total2 = 0;
		boolean aceFlag1 = false;
		boolean aceFlag2 = false;
		boolean aceFlag3 = false;
		boolean aceFlag4 = false;
		
		//give random values to each card
		UserCardNum1 = r.nextInt(13) + 1;
		UserCardNum2 = r.nextInt(13) + 1;
		DealCardNum1 = r.nextInt(13) + 1;
		DealCardNum2 = r.nextInt(13) + 1;
		//first users card case
		switch (r.nextInt(4)) {
			case 0: 
				UserCardCase1 = " of Hearts";
			break;
			case 1:
				UserCardCase1 = " of Clubs";
			break;
			case 2:
				UserCardCase1 = " of Spades";
			break;
			case 3:
				UserCardCase1 = " of Diamonds";
			break;
		}
		//second users card case
		switch (r.nextInt(4)) {
			case 0: 
				UserCardCase2 = " of Hearts";
			break;
			case 1:
				UserCardCase2 = " of Clubs";
			break;
			case 2:
				UserCardCase2 = " of Spades";
			break;
			case 3:
				UserCardCase2 = " of Diamonds";
			break;
		}
		//first dealers card case
		switch (r.nextInt(4)) {
			case 0: 
				DealCardCase1 = " of Hearts";
			break;
			case 1:
				DealCardCase1 = " of Clubs";
			break;
			case 2:
				DealCardCase1 = " of Spades";
			break;
			case 3:
				DealCardCase1 = " of Diamonds";
			break;
		}
		//second dealers card case
		switch (r.nextInt(4)) {
			case 0: 
				DealCardCase2 = " of Hearts";
			break;
			case 1:
				DealCardCase2 = " of Clubs";
			break;
			case 2:
				DealCardCase2 = " of Spades";
			break;
			case 3:
				DealCardCase2 = " of Diamonds";
			break;
		}
		//Dealer Print out 1
		System.out.println("Dealer has : ");
		switch (DealCardNum1) {
		case 1:
			System.out.println("	Dealer Has: King" + DealCardCase1);
			total1 += 10;
			break;
		case 11:
			System.out.println("	Dealer Has: Ace" + DealCardCase1);
			aceFlag1 = true;
			total1 += 11;
			break;
		case 12:
			System.out.println("	Dealer Has: Queen" + DealCardCase1);
			total1 += 10;
			break;
		case 13:
			System.out.println("	Dealer Has: Jack" + DealCardCase1);	
			total1 += 10;
			break;
		default:
			System.out.println("	Dealer Has: " + DealCardNum1 + DealCardCase1);
			total1 += DealCardNum1;
			break;
		}
		//Dealer print out 2
		switch (DealCardNum2) {
		case 1:
			System.out.println("	Dealer Has: King" + DealCardCase2);
			total1 += 10;
			break;
		case 11:
			System.out.println("	Dealer Has: Ace" + DealCardCase2);
			aceFlag2 = true;
			total1 += 11;
			break;
		case 12:
			System.out.println("	Dealer Has: Queen" + DealCardCase2);
			total1 += 10;
			break;
		case 13:
			System.out.println("	Dealer Has: Jack" + DealCardCase2);	
			total1 += 10;
			break;
		default:
			System.out.println("	Dealer Has: " + DealCardNum2 + DealCardCase2);
			total1 += DealCardNum2;
			break;
		}
		if ((total1 > 21) && ((aceFlag1 == true) || (aceFlag2 == true))) {
			total1 -= 10;
		}
		System.out.println("Dealer has a total of : " + total1);
		System.out.println();
		System.out.println("User has : ");
		//User print out 1
		switch (UserCardNum1) {
		case 1:
			System.out.println("	User Has: King" + UserCardCase1);
			total2 += 10;
			break;
		case 11:
			System.out.println("	User Has: Ace" + UserCardCase1);
			aceFlag3 = true;
			total2 += 11;
			break;
		case 12:
			System.out.println("	User Has: Queen" + UserCardCase1);
			total2 += 10;
			break;
		case 13:
			System.out.println("	User Has: Jack" + UserCardCase1);	
			total2 += 10;
			break;
		default:
			System.out.println("	User Has: " + UserCardNum1 + UserCardCase1);
			total2 += UserCardNum1;
			break;
		}
		//user printout 2
		switch (UserCardNum2) {
		case 1:
			System.out.println("	User Has: King" + UserCardCase2);
			total2 += 10;
			break;
		case 11:
			System.out.println("	User Has: Ace" + UserCardCase2);
			aceFlag4 = true;
			total2 += 11;
			break;
		case 12:
			System.out.println("	User Has: Queen" + UserCardCase2);
			total2 += 10;
			break;
		case 13:
			System.out.println("	User Has: Jack" + UserCardCase2);	
			total2 += 10;
			break;
		default:
			System.out.println("	User Has: " + UserCardNum2 + UserCardCase2);
			total2 += UserCardNum2;
			break;
		}
		if ((total2 > 21) && ((aceFlag3 == true) || (aceFlag4 == true))) {
			total2 -= 10;
		}
		System.out.println("User has a total of : " + total2);
		System.out.println();
		//Continue to play or stay
		System.out.print("Enter (h)it or (s)tay;");
		char hitOrStay = s.nextLine().charAt(0);
		//Draw again if hit
		if (hitOrStay == 'h' || hitOrStay == 'H'){
			UserCardNum1 = r.nextInt(13) + 1;
			switch (r.nextInt(4)) {
			case 0: 
				UserCardCase1 = " of Hearts";
			break;
			case 1:
				UserCardCase1 = " of Clubs";
			break;
			case 2:
				UserCardCase1 = " of Spades";
			break;
			case 3:
				UserCardCase1 = " of Diamonds";
			break;			
			}
			switch (UserCardNum1) {
			case 1:
				System.out.println("	You draw a: King" + UserCardCase1);
				total2 += 10;
				break;
			case 11:
				System.out.println("	You draw a: Ace" + UserCardCase1);
				if (total2 + 11 > 21) {
					total2 += 1;
				}
				else{
					total2 += 11;
				}
				break;
			case 12:
				System.out.println("	You draw a: Queen" + UserCardCase1);
				total2 += 10;
				break;
			case 13:
				System.out.println("	You draw a: Jack" + UserCardCase1);	
				total2 += 10;
				break;
			default:
				System.out.println("	You draw a: " + UserCardNum1 + UserCardCase1);
				total2 += UserCardNum1;
				break;
			}
			
		}
		else {
			System.out.println("	You stay.");
		}
		//if dealer < 17 he draws again
		if (total1 <= 17) {
			switch (r.nextInt(4)) {
			case 0: 
				DealCardCase1 = " of Hearts";
			break;
			case 1:
				DealCardCase1 = " of Clubs";
			break;
			case 2:
				DealCardCase1 = " of Spades";
			break;
			case 3:
				DealCardCase1 = " of Diamonds";
			break;
			}
			switch (DealCardNum1) {
			case 1:
				System.out.println("	Dealer draws a: King" + DealCardCase1);
				total1 += 10;
				break;
			case 11:
				System.out.println("	Dealer draws a: Ace" + DealCardCase1);
				if (total1 + 11 > 21) {
					total1 += 1;
				}
				else{
					total1 += 11;
				}
				total1 += 11;
				break;
			case 12:
				System.out.println("	Dealer draws a: Queen" + DealCardCase1);
				total1 += 10;
				break;
			case 13:
				System.out.println("	Dealer draws a: Jack" + DealCardCase1);	
				total1 += 10;
				break;
			default:
				System.out.println("	Dealer draws a: " + DealCardNum1 + DealCardCase1);
				total1 += DealCardNum1;
				break;
			}
		}
		else {
			System.out.println("	Dealer Stays");
		}
		if ((total1 > 21) && ((aceFlag1 == true) || (aceFlag2 == true))) {
			total1 -= 10;
		}
		if ((total2 > 21) && ((aceFlag3 == true) || (aceFlag4 == true))) {
			total2 -= 10;
		}
		//print outs
		System.out.println();
		System.out.println("Your total: " + total2);
		System.out.println("Dealer total: " + total1);
		System.out.println();
		if ((total1 == 21) && (total1 != total2)) {
			System.out.println("Dealer Wins!");
		}
		else if ((total2 == 21) && (total1 != total2)) {
			System.out.println("User Wins!");
		}
		else if ((total1 <= 21) && (total2 > 21)) {
			System.out.println("Dealer Wins!");
		}
		else if ((total2 <= 21) && (total1 > 21)) {
			System.out.println("User Wins!");
		}
		else if ((total1 > 21) && (total2 > 21)) {
			System.out.println("No one Wins!");
		}
		else if ((total1 == total2) && (total2 <= 21) && (total1 <= 21)) {
			System.out.println("User Wins!");
		}
		else if ((total1 < 21) && (total2 < 21) && (total1 > total2)) {
			System.out.println("Dealer Wins!");
		}
		else if ((total1 < 21) && (total2 < 21) && (total2 > total1)) {
			System.out.println("User Wins!");
		}
		
	}

}
