package chakeTHEREconsicutive4CONSONENT;
import java.util.*;
public class suobhan {
	 public static int  isvowel(char c){
	        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	            return 1;
	        }
	        return 0;
	    }
	 
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner sc = new Scanner(System.in);
			
			int t  = sc.nextInt();
			for(int k =0;k<t;k++){
			    
			    
			    int n = sc.nextInt();
			    int flag =0;
			    
			    String s = sc.next();
			    
			   // jodi 4 ta cons aksatha thaka 
			   
			   for(int i =0;i<n-3;i++){
			       char c1 = s.charAt(i);
			       char c2 = s.charAt(i+1);
			       char c3 = s.charAt(i+2);
			       char c4 = s.charAt(i+3);
			       
			       if(isvowel(c1)==0 && isvowel(c2)==0 && isvowel(c3)==0 && isvowel(c4)==0 )
			       //here gradually they are cons
			       {
			           flag = 1;
			           
			       }
			   }
			   
			   if(flag==1){
			       System.out.println("NO");
			   }else{
			       System.out.println("YES");
			   }
			   
			   
			}
		}

}
