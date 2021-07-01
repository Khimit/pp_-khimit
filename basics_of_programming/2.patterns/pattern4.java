/*

*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
        
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=n;
        int sp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            System.out.println();
            star--;
            sp++;
        }

    }
}
