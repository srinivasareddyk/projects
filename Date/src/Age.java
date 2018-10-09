import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) throws ParseException{

		System.out.println("enter date of birth :");
		Scanner sc=new Scanner(System.in);
		String birthDate=sc.nextLine();
		 LocalDate dob = LocalDate.parse(birthDate);
		 
	
		 System.out.println("diff age is:"+ age(dob));
	}
		 public static int age(LocalDate birthDate){
			 
			 LocalDate currentDate= LocalDate.now();
			  return  Period.between(birthDate,currentDate).getYears();
			 
			 
		 }
		 


		
		 
		

}
