package flipcoinpersentage;
import java.util.Scanner;
public class Flipcoin {
    public static void main(String[] args)
    {
	      Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of time you want to flip a coin : ");
	    int numberofflips = scanner.nextInt();
	    scanner.close();
	    if (numberofflips <=0)
	    {
	  	  System.err.println("Please enter a postive integer");
	    }
	    else
	    {
	  	  int numberofheads = 0;
	  	for (int i= 0; i < numberofflips; i++)
		  {
			  if (Math.random() >0.5)
			  {
				  numberofheads++;
			  }
		  }
	double percentageofHeads = (numberofheads*100)/numberofflips;
	double percentageofTails = 100-percentageofHeads;
	System.out.println("heads perecentage : "+ percentageofHeads);
	System.out.println("Tails perecentage : "+ percentageofTails);

	}
	   }
    

}

