/*

				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=1;            // star var 
        int space=n-1;         // space var

      for(int i=1;i<=n;i++){
        // first print spaces
            for(int j=1;j<=space;j++){
                System.out.print("\t");
                
            }
        // print star
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
        // update star and spaces accordingly
            System.out.println();
            space--;
            star++;
        }

    }
}
