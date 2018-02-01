import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scanner = new Scanner (System.in);
System.out.println("Enter the first name, middle initial, and last name");
String Firstname = Scanner.nextLine();
String Lastname = Scanner.nextLine();
String Middleinitial = Scanner.nextLine();

Human human = new Human (Firstname, Lastname, Middleinitial, "Doctor", 28);


Human human2 = new Human (Firstname, Lastname, Middleinitial, "Pharmacist", 37);

System.out.println(human.Career); 
System.out.println(human2.YearsOld);


	}

}
