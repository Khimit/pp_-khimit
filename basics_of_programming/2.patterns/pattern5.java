/*

		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=1;
        int spac=n/2;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spac;j++){
                System.out.print("\t");
            } 
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){          // for first half and for second half different condition to update variables
               star+=2;    
               spac-=1; 
            }
            else{
                star-=2;
                spac+=1;
            }
            
        }

    }
}
