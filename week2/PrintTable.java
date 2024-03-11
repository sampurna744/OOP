import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
  	
	Scanner scan = new Scanner(System.in);
	String[] name= new String [5];
	int [] lab = new int[5];
	int [] bonus = new int[5];
    
	for (int x=0; x<5; x++){
		System.out.println("Enter name: ");
		name[x] = scan.nextLine();
	
		
		System.out.println("Lab marks:");
		lab[x] = scan.nextInt();

		scan.nextLine();

		System.out.println("Bonus");
		bonus[x] = scan.nextInt();
		
		scan.nextLine();

    	}
	System.out.println("============================");
	System.out.println("==     Student Points     ==");
	System.out.println("============================");

	System.out.println("Name\tlab\tbonus\ttotal");
	System.out.println("---\t---\t---\t---\t");

	for (int x = 0; x<5; x++){
    		System.out.print(name[x]+"\t");
		System.out.print(lab[x]+"\t");
		System.out.print(bonus[x]+"\t");
		System.out.println(lab[x]+bonus[x]);
	}
}
}