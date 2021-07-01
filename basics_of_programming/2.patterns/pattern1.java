/*

*	
*	*
* * *
* * * *
* * * * *

*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=1;         // initialize star var with 1
      
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){     // run loop till star and print it
                System.out.print("*\t");
            }
            System.out.println();    
            star++;         // upgrade star variable after every row
        }

    }
}
