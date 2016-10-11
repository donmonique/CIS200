/**
 * Pascal Triangle
 * @author Donmonique
 * @version 3
 * Lab Friday 7:30
 */
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		int Bound=0;
		int counter=0;
		int jFac = 1;
		int iFac = 1;
		int ijFac = 1;
		int total = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Bound : ");
		Bound = Integer.parseInt(s.nextLine());
		//********ROWS********************
		for (int y=0; y<=Bound; y++){
			//y factorial
			jFac = 1;//reset fac
			for (int j = y; j>0; j--) {
				jFac *= j;
			}
			//prints out spaces before rows
			for (int space = Bound - y+1; space>0; space-=1) {
				System.out.print("   ");
			}
			//*********COLUMN***********
			for(int x=0; x<=y; x++) {
				//x factorial
				iFac = 1;//reset fac
				for (int i = x; i>0; i--) {
					iFac *= i;
				}
				//y-x factorial
				ijFac = 1;//reset fac
				for (int z = (y-x); z>0; z--) {
					ijFac*=z;
				}
				total = (jFac/(iFac * ijFac));//calculate coordinate fac
				//printing out spaces before columns
				if (total < 10){
					System.out.print("  ");
					System.out.print(total);
					System.out.print("   ");
				}
				else
				{
					System.out.print(" ");
					System.out.print(total);
					System.out.print("   ");	
				}
			}//********COLUMN**********
			System.out.println();
		}
		//*************ROWS*********************
		
		
		System.out.println("Binomial Expansioons: ");
		for (int j = 0; j <= Bound; j++) {
			System.out.print("(x + y)^" + j + " = ");
			int x= j;
			int y = 0;
			for (int i = j; i>=0; i--) {
				x=i;
				switch(x){
				case 0: 
					if (j==0) {
						System.out.print("1");
					}
					break;
				case 1:
					System.out.print("x");
					break;
				default:
					System.out.print("x^"+x);
					break;
				}
				
				switch(y){
				case 0:
					System.out.print("");
					break;
				case 1:
					System.out.print("y");
					break;
				default:
					System.out.print("y^"+y);
					break;
				}
				
				if (y==j || x==0)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(" + ");
				}
				y++;
			}
			System.out.println();
		}
		
	}

}
