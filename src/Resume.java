
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

	public class Resume {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	int number;
	Date date;
	String firstName, lastName,	companyName, emailAddress;
	String rating[]={"skilled", "proficient", "familiar"};
	ArrayList<String> education = new ArrayList<String>();
	ArrayList<String> experience = new ArrayList<String>();
	ArrayList<String> skills = new ArrayList<String>();
	
	System.out.println("First name ");
	Scanner FName = new Scanner(System.in);
	firstName = FName.next();
	System.out.println("Last name ");
	Scanner LName = new Scanner(System.in);
	lastName = LName.next();
	System.out.println("E-mail adress ");
	Scanner Email = new Scanner(System.in);
	emailAddress = Email.next();
	
	
	for(number=0
			;number<10;number++){
				//education
			}
				if((number%3==0)&&!(number%5==0))
				System.out.println("Fizz");
				else if(number%5==0&&!(number%3==0))
					System.out.println("Buzz");
				else if((number%3==0)&&(number%5==0))
					System.out.println("FizzBuzz");
				else
					System.out.println(number);

		for(number=1;number<=100;number++){
			//workexperience
		}
			if((number%3==0)&&!(number%5==0))
			System.out.println("Fizz");
			else if(number%5==0&&!(number%3==0))
				System.out.println("Buzz");
			else if((number%3==0)&&(number%5==0))
				System.out.println("FizzBuzz");
			else
				System.out.println(number);

	for(number=1;number<=100;number++){
		//Skills
	}
		if((number%3==0)&&!(number%5==0))
		System.out.println("Fizz");
		else if(number%5==0&&!(number%3==0))
			System.out.println("Buzz");
		else if((number%3==0)&&(number%5==0))
			System.out.println("FizzBuzz");
		else
			System.out.println(number);
		
	}

}
