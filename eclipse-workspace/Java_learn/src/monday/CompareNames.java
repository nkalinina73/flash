package monday;

import java.util.Scanner;

public class CompareNames {

	public static void main(String[] args) {
		
		String[] n = new String[5];
		Scanner reader = new Scanner(System.in);	
		System.out.println("Type 5 names, taping 'Enter' after each:");
		n[0]=reader.nextLine();
		n[1]=reader.nextLine();
		n[2]=reader.nextLine();
		n[3]=reader.nextLine();	
		n[4]=reader.nextLine();
		//n[5]=reader.nextLine();
		//n[6]=reader.nextLine();
		//n[7]=reader.nextLine();
		//n[8]=reader.nextLine();
		//n[9]=reader.nextLine();
		
		int nlenght[]=new int [5];
		nlenght[0]=n[0].length();
		nlenght[1]=n[1].length();
		nlenght[2]=n[2].length();
		nlenght[3]=n[3].length();
		nlenght[4]=n[4].length();
		//nlenght[5]=n[5].length();
		//nlenght[6]=n[6].length();
		//nlenght[7]=n[7].length();
		//nlenght[8]=n[8].length();
		//nlenght[9]=n[9].length();
		
		int maxlen;

		if(nlenght[0]>0) {
	          if (nlenght[0] > nlenght[1]) {
	              maxlen = nlenght[0];
	              System.out.println("This name is longer - " + n[0]);
	          }
	          else {
	              maxlen = nlenght[1];
	              System.out.println("This is the name of the person" + n[1]);
	              
	          }
	          {
		          if (nlenght[1] > nlenght[2]) {
		              maxlen = nlenght[0];
		              System.out.println("This is name is longer " + n[1]);
		          }
		          else {
		              maxlen = nlenght[1];
		              System.out.println("This is the name of the person" + n[2]);
		              
		          }
		          {
			          if (nlenght[2] > nlenght[3]) {
			              maxlen = nlenght[0];
			              System.out.println("This is name is longer " + n[2]);
			          }
			          else {
			              maxlen = nlenght[2];
			              System.out.println("This is the name of the person" + n[3]);
			          }
			          }
	          }
	            
		}
	}
}
