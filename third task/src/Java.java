
public class Java {
	public static void main(String[] args) {

	String st = "javaj2ee" ;
	int l=st.length();
	
	for(int i=0;i<l;i++){
		
		for(int j=0;j<=i;j++){
			System.out.print(st.charAt(j));
			if(j<i){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	int k=6;
	for(int i=0;i<l-1;i++){
		for(int j=0;j<=k;j++){
			System.out.print(st.charAt(j));
		if(k>j
				){
			System.out.print(" ");
		}
			
		}
	k--;
	System.out.println();
	}
}
}