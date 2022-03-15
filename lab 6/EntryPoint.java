import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
     int x ;
     Scanner scan = new Scanner(System.in);


			System.out.print("Which service would you like to use?");
			x =scan.nextInt();

			switch(x){
				case 1 :BasicWeek bw = new BasicWeek();
					 bw.printDays();
				break;
				case 2 : AdvancedWeek aw = new AdvancedWeek();
					 aw.printDays();
				break;
				case 3 : Calculator calc = new Calculator();
				break;
				case 4 : Employee emp = new Employee();
				break;
					}
    }
}