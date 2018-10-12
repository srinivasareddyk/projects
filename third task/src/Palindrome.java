import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome {

	public static void main(String[] args) {

	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a  string");
    String str = sc.nextLine();
    String[] arr = str.split(" ");
    for(String word : arr)
    {
    	String rev = "";	
    	for(int i = word.length() - 1; i >= 0; i--)
    	{
    		rev = rev + word.charAt(i);
    	}
    	if (word.equals(rev) && word.length()>1)
    	{
    		System.out.print("");
    	}
    	else
    	{
    		System.out.print(word + " ");
    	}
    }
    sc.close();
    
	}


        		 
        }
        	 
        	 
        	 
         
         



