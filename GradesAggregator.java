import java.util.Scanner;
public class GradesAggregator{
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		int g1,g2,g3,g4,g5,g6,g7;double r1=0,r2,r3;

			System.out.print("Input the grade of assignment 1: ");
			g1=scan.nextInt();
			System.out.print("Input the grade of assignment 2: ");
			g2=scan.nextInt();
			System.out.print("Input the grade of assignment 3: ");
			g3=scan.nextInt();
			System.out.print("Input the grade of assignment 4: ");
			g4=scan.nextInt();
			System.out.print("Input the grade of assignment 5: ");
			g5=scan.nextInt();
			
			int[] grades = {g1, g2, g3, g4, g5};
			/*grades[0]=g1;
			grades[1]=g2;
			grades[2]=g3;
			grades[3]=g4;
			grades[4]=g5;*/
			
			System.out.print("Input the number of attended labs: ");
			g6=scan.nextInt();
			System.out.print("Input the midterm grade: ");
			g7=scan.nextInt();

			for(int idx = 0 ;idx<grades.length;idx++){r1+=grades[idx];}
			r1=(r1/5)*0.3;

			r2=(g6*100*0.05)/7;
			r3=g7*0.3;

			System.out.println("Assignments (30%): "+r1);
			System.out.println("Attendance (5%): "+r2);
			System.out.print("Midterm (30%): "+r3);
			
	}
}