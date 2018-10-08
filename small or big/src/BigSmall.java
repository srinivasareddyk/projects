import java.util.Scanner;

public class BigSmall {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		 
		int c=a-b;
		int d=b-a;
		if(c>=2){
			System.out.println("biggest number is a");
		}
		else if(d>=2){
			System.out.println("biggest number is b");
		}
		else{
			System.out.println("please provide valid number");
		}
		
	}

}
