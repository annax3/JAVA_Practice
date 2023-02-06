import java.util.*;
class _12Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you city Name");
		String name=sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad")){
			System.out.println("Hello Hyderabadi, Aadaab..");
		}
		else if(name.equals("chennai")){
			System.out.println("Hello madrasi, vanakkam");
		}
		else if(name.equals("banglore")){
			System.out.println("Hello kanadiya, Namaskara");
		}
		else{
			System.out.println("Enter valid String name");
		}
	}
}