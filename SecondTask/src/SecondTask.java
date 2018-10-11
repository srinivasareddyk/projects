
public class SecondTask {
	
	public static void main(String[] args){
		
		int[] a= {6 ,3 ,9 ,8, 10 ,2 ,1 ,15 ,7};
		

	    
	      for(int i=0;i<a.length;i++){
	        int min= 23; 
	        int k=-1;
	        for (int j = 0; j < a.length; j++)  
	        { 
	            if (a[i] < a[j] )
	            {
	                  int d= a[j] - a[i] ;
	                     
	            			if(d<min)
	            				{
	            					min=d;;
	               
	            					k = j;     
	            				}
	                    
	            }
	      
	      }
	  
	        if(k == -1) {
	        System.out.print( "_ " ); 
	        } else
	        {
	        	System.out.print(a[k] + " "); 
	        }
	     
	      }
	       
		
	
	

	}
}
