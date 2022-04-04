import java.io.*; 

import java.util.Scanner;


public class lab8{
  public static void main(String[] args) throws IOException{
  

      
		
		File fr = new File("expenses.txt");
		//fr.createNewFile();
		FileWriter writer=new FileWriter(fr);
		BufferedWriter bw = new BufferedWriter(writer);
		PrintWriter outToFile = new PrintWriter(bw);
		Scanner fileScan = new Scanner(fr);
		
		Scanner scan = new Scanner (System.in);
		String input1,input2,input3,input4,line;
		double pay;

      		do{
			
			System.out.print ("Input your name: ");
				input1 = scan.nextLine();
			System.out.print ("What did you purchase? ");
				input2 = scan.nextLine();
			System.out.print ("How much did youpay?: ");
				
				pay = scan.nextDouble();
				
			outToFile.print( input1+" purchased"+input2+" for "+pay+" USD dollars");outToFile.close();

			System.out.print("Would you like to log another purchase?");
			scan.nextLine();
			input3 = scan.nextLine();
			
				if(input3.equals("y")==true){continue;}
				if(input3.equals("n")==true){

					System.out.print( "Would you like to read a summary of your purchases?");
					input4 = scan.nextLine();
						if(input4.equals("y")==true){
							
							line=fileScan.next();System.out.print(line);
						

								}

					if (input4.equals("n")==true){break;}}

						
		
				

				
			
        
    
		}while(input3.equals("y")==true);
 
  
}
}
