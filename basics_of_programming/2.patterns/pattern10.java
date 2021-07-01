/*

		*	
	*		*	
*				*	
	*		*	
		*	

*/

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int star = 1;
    int sp = n / 2;
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= star; j++) {
        if (j == 1 || j == star) {        // only print star on these positions
          System.out.print("*\t");
        }
        else {
          System.out.print("\t");
        }
      }
      System.out.println();
      // diff conditions for first and second half
      if (i <= n / 2) {
        sp--;
        star += 2;
      }
      else {
        sp++;
        star -= 2;
      }
    }

  }
}
