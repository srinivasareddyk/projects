//import java.util.Scanner;

public class AddRepNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,2,0,4,0,8,2};

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
		int i;
		for(i=0;i<a.length;i++){
			
			if(a[i]== 0){
				break;
			}
		
		}
		
		for(int j=i+1;j<a.length;j++){
			if(a[j] != 0){
				
				 int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				
			}
			
		}
		
		
		
		
		
		
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		
	}

}
