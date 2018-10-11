import java.util.Scanner;

public class AddRepNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[6];
	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
		
			a[i]=sc.nextInt();
		}
		
		int add=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					add=a[i]+a[j];
					
					
					a[i]=add;
					a[j]=0;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
sc.close();
	}

}
